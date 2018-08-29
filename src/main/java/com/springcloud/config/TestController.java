package com.springcloud.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *  @Author dengwei
 *  @Description: TODO
 *  @Date 2018/8/29 15:59
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "张三";
    }
}
