package com.zzh.config;

import com.zzh.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author zzh
 * @Date 2024/7/25 下午1:57
 * @ClassName GlobalExceptionHandler
 * @Description 全局异常捕获
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {Exception.class}) // 捕获所有类型的异常
    public ResponseEntity<Result> handleAllExceptions(Exception ex, NativeWebRequest request) {
        String requestURI = request.getNativeRequest(HttpServletRequest.class).getRequestURI();
        // 获取异常堆栈的第一条信息，通常是异常发生的直接位置
        StackTraceElement stackTraceElement = ex.getStackTrace()[0];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();

        // 获取异常的类型
        Class<?> exceptionType = ex.getClass();

        // 自定义错误响应
        Result result = Result.error()
                .msg("服务产生异常了，请联系管理员")
                .code(500);
        log.error("产生了一个异常\n接口: {}\n类: {}\n方法: {}\n类型: {}\n错误信息: {}",requestURI,className,methodName,exceptionType.getName(), ex.getMessage());
        return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
