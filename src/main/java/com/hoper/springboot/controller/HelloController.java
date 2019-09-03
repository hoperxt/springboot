package com.hoper.springboot.controller;

import com.hoper.springboot.util.JsonResult;
import com.hoper.springboot.util.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {
    protected static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/hello/{id}", produces = "application/json")
    public JsonResult get(@PathVariable String id) {
        System.out.println("GET id" + id);
        return new JsonResult(ResultCode.SUCCESS, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/hello/{id}", produces = "application/json")
    public JsonResult delete(@PathVariable String id) {
        System.out.println("DELETE id" + id);
        return new JsonResult(ResultCode.SUCCESS, id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/hello/{id}", produces = "application/json")
    public JsonResult post(@PathVariable String id) {
        System.out.println("POST id" + id);
        return new JsonResult(ResultCode.SUCCESS, id);
    }

}
