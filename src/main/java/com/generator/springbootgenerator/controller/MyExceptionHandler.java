package com.generator.springbootgenerator.controller;

import com.generator.springbootgenerator.exceptions.OneException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lqs
 */
@ControllerAdvice
public class MyExceptionHandler {

/*    @ResponseBody
    @ExceptionHandler(OneException.class)
    public Map<String , Object> handleException(Exception e) {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info("==拦截自定义异常，意思就是小老板换个号==");
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "龙光射牛斗之墟");
        map.put("code", "到时候在自适应吧");
        map.put("message", e.getMessage());
        return map;
    }*/

    @ExceptionHandler(OneException.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        //传入我们自己的错误状态码  4xx 5xx，否则就不会进入定制错误页面的解析流程
        /**
         * Integer statusCode = (Integer) request
         .getAttribute("javax.servlet.error.status_code");
         */
        request.setAttribute("javax.servlet.error.status_code",409);
//        map.put("code","8848,一二三");
//        map.put("message",e.getMessage());
        //转发到/error
        return "forward:/error";
    }
}
