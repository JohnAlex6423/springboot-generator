package com.generator.springbootgenerator;

import com.generator.springbootgenerator.compoents.LqsViewResolver;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;

/**
 * @author lqs
 */
@MapperScan(value = "com/generator/springbootgenerator/mapper")
@SpringBootApplication()
@EnableCaching
public class SpringbootGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGeneratorApplication.class, args);
	}

	@Bean
	public ViewResolver ViewResolverOfLqs() {
		return new LqsViewResolver();
	}

}
