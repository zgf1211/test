package com.demo;/**
 * @ClassName controler
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/8/13
 * @Version V1.0
 **/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName controler
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/8/13
 * @Version V1.0
 **/
@RestController
@RequestMapping("/test")
public class controller {
    @RequestMapping("/1")
    public String getString() {
        return  "hello word!!!!!!";
    }
}
