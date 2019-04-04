package com.demo.common.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ChineseFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        //对request和response进行一些预处理
        request.setCharacterEncoding("UTF-8");
        System.out.println("filter1-----1111>"+111111);
        filterChain.doFilter(request, servletResponse);
        System.out.println("filter1-----1111>"+22222);
    }

    @Override
    public void destroy() {

    }
}
