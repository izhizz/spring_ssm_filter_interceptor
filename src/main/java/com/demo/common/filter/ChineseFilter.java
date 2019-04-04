package com.demo.common.filter;



import javax.servlet.*;
import java.io.IOException;

public class ChineseFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //对request和response进行一些预处理
        servletRequest.setCharacterEncoding("UTF-8");

    }

    @Override
    public void destroy() {

    }
}
