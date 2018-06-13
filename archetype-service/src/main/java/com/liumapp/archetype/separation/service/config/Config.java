package com.liumapp.archetype.separation.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author liumapp
 * @file Config.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/13/18
 */
@Configuration
public class Config extends WebMvcConfigurerAdapter {

	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("*")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowCredentials(true);
    }

}
