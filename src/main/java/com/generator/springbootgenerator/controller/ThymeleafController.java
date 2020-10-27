package com.generator.springbootgenerator.controller;

import com.generator.springbootgenerator.exceptions.OneException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Map;

/**
 * author: lqs
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/springbootGenerate")
    public String springbootGenerate(Map<String, String> map) {
        map.put("who", "lqs");
        return "springbootGenerate";
    }

    @RequestMapping("/thymeleafTest")
    public String thymeleafTest(Map<String, Object> map) {
        map.put("who", "lqs");
        map.put("love", "qwc");
        map.put("sex", Arrays.asList("man", "woman"));
        return "thymeleafTest";
    }

    @RequestMapping("/login")
    public String login(HttpSession session) {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info("==maybe我可能是一个拦截的请求==");
        return "login";
    }

    @PostMapping("/user/login")
    public String userLogin(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            Map<String, Object> map,
                            HttpSession session) {
        if (!"lqs".equals(username)) {
            throw new OneException();
        }
        session.setAttribute("loginUser", username);
        return "redirect:/lqs";
    }
}
