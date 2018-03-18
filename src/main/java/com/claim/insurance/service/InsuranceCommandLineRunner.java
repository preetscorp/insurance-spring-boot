package com.claim.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.claim.insurance.entity.User;
import com.claim.insurance.repository.UserRepository;

@Component
public class InsuranceCommandLineRunner implements CommandLineRunner{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside command line runner!");
		//userRepo.save(new User("Preethi", "CUST"));
		userRepo.save(new User("Maha","SREP"));
		userRepo.save(new User("Hari","INSPR"));
	}

}
