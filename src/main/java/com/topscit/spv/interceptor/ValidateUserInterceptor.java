package com.topscit.spv.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.topscit.spv.util.HttpUtil;



public class ValidateUserInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		System.out.println("拦截器");
		Cookie[] cookies = request.getCookies();
		String key = null;
		if(cookies != null)
		{
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				String name = cookie.getName();
				if("uid".equals(name))
				{
					key = cookie.getValue();
				}
			}	
		}
		if(key == null)
		{
			response.sendRedirect("/redis_spring/login.jsp");
			return false;
		}
		else
		{
			System.out.println(key);
			//发请求到redis_spring获取登录信息
			String send = HttpUtil.send("http://localhost/redis_spring/getUserState?key="+key);
			System.out.println(send);
			if(send.equals("1"))
			{
				return true;
			}
			else
			{
				response.sendRedirect("/redis_spring/login.jsp");
				return false;
			}
		}
	}

}
