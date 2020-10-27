package com.generator.springbootgenerator.compoents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author lqs
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        Logger logger = LoggerFactory.getLogger(getClass());
        String locale = request.getParameter("locale");
        Locale localeObject = Locale.getDefault();
        if (!StringUtils.isEmpty(locale)) {
            logger.info("***来到了自定义国际化解析器***");
            String [] split = locale.split("_");
            localeObject = new Locale(split[0], split[1]);
        }
        return localeObject;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
