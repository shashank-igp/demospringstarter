package com.examplespringstarter;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shanky on 27/12/16.
 */
@Controller
@RequestMapping(value = "/myhome")
public class mycontroller {

    @RequestMapping(value = "/{a}/{b}")
    public @ResponseBody double sum (@PathVariable double a, @PathVariable double b){
        return a+b;
    }
    @RequestMapping(value = "/{a}")
    public @ResponseBody int mul(@PathVariable int a){
        return a*100;
    }
}
