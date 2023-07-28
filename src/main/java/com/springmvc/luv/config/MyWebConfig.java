package com.springmvc.luv.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebConfig implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		System.out.println("Java bases config picked");
		
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(MyBeansConfig.class);
		
		DispatcherServlet dispatcher = new DispatcherServlet(webContext);
		
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("MyDispatcher", dispatcher);
		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/");
	}
}
