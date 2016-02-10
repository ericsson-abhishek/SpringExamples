package com.secure.spring;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

public class MyCustomAuthEntrypoint implements AuthenticationEntryPoint{

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		//request.getRequestDispatcher("/rest/logme").forward(request, response);;
		response.sendRedirect("rest/logme");
		System.out.println("My CustomAuthEntryPoint gets called with "+authException);
		
	}

}
