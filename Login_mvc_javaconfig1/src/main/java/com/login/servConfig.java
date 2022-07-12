package com.login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//servlet config 

@Configuration
@EnableWebMvc
@ComponentScan("com.login")
public class servConfig 
{
//	@Bean
//	public InternalResourceViewResolver viewresolver()
//	{
//	InternalResourceViewResolver vr =new InternalResourceViewResolver();
//	vr.setPrefix("/WEB-INF/");
//	vr.setSuffix(".jsp");
//	return vr;
//	}
//	
	

}
