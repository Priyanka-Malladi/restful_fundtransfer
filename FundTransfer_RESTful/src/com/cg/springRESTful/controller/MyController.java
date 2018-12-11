package com.cg.springRESTful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springRESTful.service.IWalletService;

@RestController
public class MyController {

	@Autowired
	IWalletService service;
	
	@RequestMapping(value ="/fundtransfer/{fromId}/{toId}/{amount}",headers="Accept=application/json",method = RequestMethod.GET)
	public String fundTransfer(@PathVariable("fromId") int customerId1,@PathVariable("toId") int customerId2,@PathVariable("amount") double amount){
		System.out.println(customerId1);
		System.out.println(customerId2);
		System.out.println(amount);
		boolean result = service.fundTransfer(customerId1,customerId2,amount);
		if(result){
		System.out.println("Transfer done...!!");
		return "fund transfer successfull";
	}
		return "fund transfer failed"; 
	}
}
