package com.tt.teach.utils;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @作者：zhujungui
 * @时间：2018/12/19 16:14
 * @描述：控制器的工具类
 */
public class BaseController {
    //1.日志打印的管理
    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
    //2.常用的变量提取出来，放到base工具类变为静态常量，方便使用
    protected static final String SESSION_KEY = "studentName";
    protected static final String FORWARD = "forward:";
    protected static final String REDIRECT = "redirect:";

    //3.
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    public HttpServletResponse getResponse() {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        return response;
    }

    public HttpSession getSession() {
        HttpSession session = getRequest().getSession();
        return session;
    }

}
