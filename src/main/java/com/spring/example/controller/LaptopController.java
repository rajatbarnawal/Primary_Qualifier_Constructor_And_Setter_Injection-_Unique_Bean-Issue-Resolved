/*
 * 
 * Description:

Parameter 0 of constructor in com.spring.example.controller.LaptopController required a single bean, but 2 were found:
	- dell: defined in file [/home/avinash/Documents/workspace-sts-3.9.10.RELEASE/Spring/target/classes/com/spring/example/Class/Dell.class]
	- lenovo: defined in file [/home/avinash/Documents/workspace-sts-3.9.10.RELEASE/Spring/target/classes/com/spring/example/Class/Lenovo.class]


Action:

Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed


 * 
 * 
 * 
 * 
 */

//Issue Resolved

package com.spring.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example.Interface.Laptop;

@RestController
@RequestMapping(path = "/api/object/laptop")
public class LaptopController {

	// 1. Making one the implementation class as @Primary
	// 2. Using @Qualifier("name") on @Autowird
	// 3. Paramaterized constructor (@Qualifier("name")) --- Make it autowired not
	// the Class only constructor
	// 4. Marking setter method as Autowired and Annotation Parameter as
	// Qualifier("name")

	// required = false works on setter if bean does not exist
	// " does not work with constructor injection if bean does not exist....

	// @Qualifier("lenovo")
	// private Laptop laptop;

	private Laptop lappy; // Mentioning autowired here does not make any sense...!!!

	@Autowired
	public LaptopController(@Qualifier("dell") Laptop lappy) {
		this.lappy = lappy;
	}

	/*
	 * public void setLappy(@Qualifier("dell") Laptop lappy) { this.lappy = lappy; }
	 */

	@RequestMapping(path = "/get", method = RequestMethod.GET, produces = "text/plain")
	public String getLaptopName() {
		return lappy.laptopName();
	}
}
