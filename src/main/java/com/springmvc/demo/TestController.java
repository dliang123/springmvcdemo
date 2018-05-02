package com.springmvc.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author dengliang
 * @Email liang.deng@atzuche.cn
 * @Date Created in 10:48 2018/5/2
 */
@RestController
@RequestMapping(value = "mvc")
public class TestController {

    @RequestMapping(value = "hello", method = {RequestMethod.GET})
    public String Hello() {
        return "hello";
    }
}
