package com.leaf.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huangshuren
 */
public class Interceptor extends HandlerInterceptorAdapter {

    public boolean preHandler(HttpServletRequest request,
                              HttpServletResponse response,
                              Object handler){
        System.out.printf("This is interceptor");
        return true;
    }

}
