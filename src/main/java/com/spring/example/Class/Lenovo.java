package com.spring.example.Class;

import org.springframework.stereotype.Service;

import com.spring.example.Interface.Laptop;

@Service
public class Lenovo implements Laptop {

	@Override
	public String laptopName() {
		
		System.out.println("learning git");
		// TODO Auto-generated method stub
		return "Name of laptop is :-Lenove";

	}

}
