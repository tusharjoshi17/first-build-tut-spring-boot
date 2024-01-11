package com.firstbuild.learningspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/* so here we can define spring beans the things which are manage by beans
 * are called spring beans and we can define the methods to create the
 * spring beans in the configuration class */

/*What is a record ferature? - Eliminate verbosity in creating java Beans
 * Public accessor methods, constructor,
 * equals, hashcode and toString are automatically created
 * Released in jdk 16*/

record Person(String name, int age, Address address) {}

record Address(String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
	
//	anything that is managed by spring is called bean
	@Bean
	public String name() {
		return "Tushar";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
//		var person = new Person("Tushar",20);
//		return new Person("Tushar", 20, address());
		return new Person("Tushar", 20, new Address("Gandhi ward","Hinganghat"));
	}
	
	/*the relationship between these object are independent but with
	 * spring framework we can call these already existing objects(Bean)
	 * by call by method and parameter
	 * to create one bean we are using existing different beans in the class*/
	
	@Bean
	public Person person2CallByMethod() {
		return new Person(name(), age(),address());
	}
	
	@Bean
	public Person person3CallByParameters(String name,int age, Address address3) {
		return new Person(name,age,address3);
	}
	
//	No qualifying bean of type available: expected single matching bean but
//	found 2: address2,address3
//	multiple matching beans are called candidates
	@Bean
	@Primary
	public Person person4CallByParameters(String name,int age, Address address) {
		return new Person(name,age,address);
	}

	@Bean
	public Person person5Qualifier(String name,int age,@Qualifier("address3qualifier") Address address) {
		return new Person(name,age,address);
	}

	@Bean(name="address2")
	@Primary
	public Address address() {
		
		return new Address("Lala Oli", "Kamptee");
	}
	
	@Bean
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("HD nagar", "Nagpur");
	}
	
}
	


