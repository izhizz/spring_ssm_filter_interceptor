package com.demo.common.filter;


import com.sun.net.httpserver.HttpExchange;

import javax.servlet.*;
import java.io.IOException;

public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter2-----22222>"+111111);
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter2-----2222>"+2222222);
    }

    @Override
    public void destroy() {

    }
}
