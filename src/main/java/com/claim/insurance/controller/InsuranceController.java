package com.claim.insurance.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.claim.insurance.entity.Claim;
import com.claim.insurance.model.ClaimRequest;
import com.claim.insurance.service.InsuranceService;

@RestController
public class InsuranceController {

	@Autowired
	InsuranceService service;
	
	//Not working - need to check
	@GetMapping("/login.html")
	public ModelAndView getLogin() {
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}
	
	@GetMapping("/getRoleBasedOnUserId/{userId}")
	public String getRoleBasedOnUserId(@PathVariable("userId") Integer id) {
		return service.getRoleBasedOnUserId(id);
	}
	
	@PostMapping(value="/requestClaim",produces="application/json",consumes="application/json") //chk here
	public Integer fileClaim(@RequestBody ClaimRequest request) {
		return service.fileClaim(request);
	}
	
	@GetMapping("/getApprovedClaims")
	public List<Claim> getAllClaims(){
		
	}
	
	@GetMapping("/getClaimById/{custId}")  
	public Claim getClaimById(@PathVariable("custId") Integer id) {
		return service.getClaimById(id);
	}
	
	@GetMapping("/getClaimStatus/{custId}")  /* Requirement 3*/
	public String getClaimStatus(@PathVariable("custId") Integer id) {
		return service.getClaimStatus(id);
	}
	
	@PutMapping("/updateClaimStatus/{cId}")
	public void updateClaimStatus(@PathVariable("cId") Integer cId) {
		
		service.updateClaim(cId);
	}
	
}
