package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Bank;
import com.bank.repository.BankRepo;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	private BankRepo repo
	
	@PostMapping("/data")
	public Bank dataentry(@RequestBody Bank b)
	{
		 Bank  save    = repo.save(b);
		 
		 return save;
	}
	
	
	
	
	

}
