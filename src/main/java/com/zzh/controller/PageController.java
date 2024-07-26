package com.zzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @Author zzh
 * @Date 2024/7/25 下午4:54
 * @ClassName PageController
 * @Description TODO
 */
@Controller
public class PageController {
    @GetMapping("/indexPage")
    public String index() {
        return "index";
    }
}
