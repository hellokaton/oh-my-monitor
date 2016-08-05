package com.monitor.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局web拦截器
 */
public class BaseInteceptor implements HandlerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseInteceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        LOGGER.info("#### Request URL\t=> {}\t{}", httpServletRequest.getMethod(),
                httpServletRequest.getRequestURI());

        LOGGER.info("#### Client IP\t\t=> {}", httpServletRequest.getRemoteAddr());

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

}
