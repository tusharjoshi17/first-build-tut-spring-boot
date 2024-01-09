package com.firstbuild.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
/* creating a spring framework here which functionality in jvm will look like
 * this jvm->spring->objects 
 * 1: Launch a spring context(Application)
 * 2: Configure the things that we want spring to manage - @Configuration (class)
 * we can use @Configuration class to launch spring context */
		/* we would want to launch a spring context with the
		 * configuration class, we can do that by using a class which
		 * is AnnotationConfig*/
		
		/* 2: Configure the things that we want spring to manage - @Configuration (class)
		 * HelloWorldConfiguration - @Configuration
		 * name - @Bean*/
	var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		/*we are creating here are spring context with the annotation
		 *so we'd want to create inside the jvm, a spring context(spring app)
		 * and we are using @Configuration class to create a 
		 * AnnoataionConfig application context(Spring application)*/
	
//	3: Retrieving Beans Managed by spring
	
	System.out.println(context.getBean("name"));
	System.out.println(context.getBean("age"));
	System.out.println(context.getBean("person"));
	System.out.println(context.getBean("address2"));
//	System.out.println(context.getBean(Address.class));
	System.out.println(context.getBean("person2CallByMethod"));
	System.out.println(context.getBean("person3CallByParameters"));
	
	
	}

}
