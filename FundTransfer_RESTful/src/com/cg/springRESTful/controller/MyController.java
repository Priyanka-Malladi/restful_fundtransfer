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
	
	@RequestMapping(value ="/wallet/fundtransfer/{fromId,toId,amount}",headers="Accept=application/json",method = RequestMethod.GET)
	public void fundTransfer(@PathVariable("cId") int customer1,@PathVariable("cId") int customer2,@RequestBody double amount){
		
		boolean result = service.fundTransfer(customer1,customer2,amount);
		if(result)
		System.out.println("Transfer done...!!");
	}
}
