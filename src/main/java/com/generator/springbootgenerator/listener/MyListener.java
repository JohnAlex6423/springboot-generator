package com.generator.springbootgenerator.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 监听容器的初始化与销毁
 * @author lqs
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.debug("**web应用启动了**");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.debug("==web服务已销毁==");
    }
}
