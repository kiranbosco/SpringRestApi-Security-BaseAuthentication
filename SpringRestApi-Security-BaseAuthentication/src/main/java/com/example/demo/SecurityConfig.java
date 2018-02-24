package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class SecurityConfig extends GlobalAuthenticationConfigurerAdapter {
	
	public void init(AuthenticationManagerBuilder auth)throws Exception{
		
		auth.inMemoryAuthentication().withUser("allen").password("pass").roles("USER").and()	
		.withUser("ben").password("pass1").roles("user","admin");
		
	}

	}

