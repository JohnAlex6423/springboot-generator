package com.generator.springbootgenerator.config;

import com.generator.springbootgenerator.filter.MyFilter;
import com.generator.springbootgenerator.listener.MyListener;
import com.generator.springbootgenerator.servlet.MyServlet;
import org.springframework.boot.autoconfigure.websocket.servlet.TomcatWebSocketServletWebServerCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author lqs
 */
@Configuration
public class MyServerConfig {
    //一定要将这个定制器加入到容器中
    @Bean
    public TomcatWebSocketServletWebServerCustomizer tomcatWebSocketServletWebServerCustomizer(){
        return new TomcatWebSocketServletWebServerCustomizer() {
            //定制嵌入式的Servlet容器相关的规则

            @Override
            public void customize(TomcatServletWebServerFactory factory) {
                factory.setPort(8081);
//                factory.setContextPath("/boot");
                super.customize(factory);
            }
        };
    }

    @Bean
    public ServletRegistrationBean myServlet() {
        return new ServletRegistrationBean(new MyServlet(), "/myServlet");
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/hello","/myFilter"));
        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>(new MyListener());
        return registrationBean;
    }
}
