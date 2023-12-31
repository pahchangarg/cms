package com.pahchan.springcms.filter;

import jakarta.servlet.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(3)
public class MyFilter_1 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 1 is called....");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
