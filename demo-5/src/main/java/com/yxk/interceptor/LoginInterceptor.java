package com.yxk.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.yxk.model.User;

public class LoginInterceptor extends HandlerInterceptorAdapter {  
	  
    @Override  
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)  
            throws Exception {  
        super.afterCompletion(request, response, handler, ex);  
    }  
  
    @Override  
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,  
            ModelAndView modelAndView) throws Exception {  
        super.postHandle(request, response, handler, modelAndView);  
    }  
  
    @Override  
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)  
            throws Exception {  
        request.setCharacterEncoding("UTF-8");  
        String url = request.getServletPath();      
        System.out.println("post URL："+url);  
        HttpSession session = request.getSession(true);
        session = request.getSession();
		if(session.getAttribute("username") == null)
		{
			if(url.contains("/index/")|| url.contains("/register/") ||url.endsWith(".html") || url.endsWith(".js") ||url.endsWith(".css") )
			{
				return true;
			}
			response.sendRedirect("/index/");
			return false;
		}
        return true;  
        
    }  
   
      
}  
