package com.spring.example.Class;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.example.Interface.Laptop;

//@Primary
@Service
//@Qualifier("dell")
public class Dell implements Laptop {

	@Override
	public String laptopName() {
		// TODO Auto-generated method stub
		System.out.println("pyush sharma");
		return "Name of Laptop is :- Dell";

	}

}
