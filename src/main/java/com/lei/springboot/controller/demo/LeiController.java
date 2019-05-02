package com.lei.springboot.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//RestController is equal to use @Controller and @ResponseBody in the same time.
//@RestController
//@ResponseBody
@Controller
public class LeiController {

    @RequestMapping("shiyanlou")
    public String Lei(){
        return "shiyanloulei";
    }
}
