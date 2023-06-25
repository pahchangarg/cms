package com.pahchan.springcms.config;

import com.pahchan.springcms.filter.MyFilter_1;
import org.hibernate.annotations.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean<MyFilter_1> filter1RegistrationBean(){
        FilterRegistrationBean<MyFilter_1> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFilter_1());
        registrationBean.addUrlPatterns("/customer/*");
        return registrationBean;
    }

    // Register other filters here if needed

}
