package com.cest.controller;


import com.cest.config.annotation.GPAutowired;
import com.cest.config.annotation.GPController;
import com.cest.config.annotation.GPRequestMapping;
import com.cest.config.annotation.GPRequestParam;
import com.cest.service.IDemoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@GPController
@GPRequestMapping("/demo")
public class HelloController {

    @GPAutowired
    private IDemoService demoService;

    @GPRequestMapping("/query")
    public void query(HttpServletRequest req, HttpServletResponse resp,
                      @GPRequestParam("name") String name){
        String result = demoService.get(name);
        try {
            resp.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GPRequestMapping("/add")
    public void add(HttpServletRequest req, HttpServletResponse resp,
                    @GPRequestParam("a") Integer a, @GPRequestParam("b") Integer b){
        try {
            resp.getWriter().write(a + "+" + b + "=" + (a + b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GPRequestMapping("/add1")
    public void add1(HttpServletRequest req, HttpServletResponse resp,
                    @GPRequestParam("a") Integer a, @GPRequestParam("b") Integer b){
        try {
            resp.getWriter().write(a + "+" + b + "=" + (a + b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
