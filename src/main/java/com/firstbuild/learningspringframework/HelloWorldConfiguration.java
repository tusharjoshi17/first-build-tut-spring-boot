package com.firstbuild.learningspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* so here we can define spring beans the things which are manage by beans
 * are called spring beans and we can define the methods to create the
 * spring beans in the configuration class */

@Configuration
public class HelloWorldConfiguration {
	
//	anything that is managed by spring is called bean
	@Bean
	public String name() {
		return "Tushar";
	}

}
