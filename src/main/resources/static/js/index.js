$(function(){
    console.log("整合页面");
    getUser();
});

function getUser(){
    $.ajax({
        url:"/api/db",
        type:"GET",
        dataType:"json",
        success:function(data){
            console.log(data.user);
            var users = data.data.user;
            var html="<ul>"
            for(var i=0;i<users.length;i++){
                html += '<li>'+users[i].username+':'+users[i].password+'</li>';
            }
            html+="</ul>"
            
            $("#main").html(html);
        },
        error:function(error){
            console.log(error);
        }
    });
}