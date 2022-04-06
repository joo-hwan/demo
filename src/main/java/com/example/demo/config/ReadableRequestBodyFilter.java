package com.example.demo.config;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
@Component
@WebFilter(urlPatterns = "/*")
public class ReadableRequestBodyFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if(request.getContentType() == null) {
            filterChain.doFilter(request, response);
        }
        else {
            ReadableRequestBodyWrapper readableRequestBodyWrapper = new ReadableRequestBodyWrapper(request);
            filterChain.doFilter(readableRequestBodyWrapper, response);
        }
    }
}
 */
