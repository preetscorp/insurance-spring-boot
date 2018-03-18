package com.claim.insurance.service;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.insurance.entity.Claim;
import com.claim.insurance.model.ClaimRequest;
import com.claim.insurance.repository.ClaimRepository;
import com.claim.insurance.repository.UserRepository;

@Service
public class InsuranceService {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	ClaimRepository claimRepo;
	
	public String getRoleBasedOnUserId(Integer id) {
		return userRepo.findById(id).get().getUserRole();
	}
	
	public Integer fileClaim(ClaimRequest request) {
		
		Claim c= claimRepo.save(new Claim(request.getUserId(),request.getPolicyNo(),request.getVehicleNo()
						   			,request.getDlNo(),request.getClaimAmt(),request.getInsuranceCompanyid()
						   			,request.getCreateBy(),Calendar.getInstance().getTime()));
		
		System.out.println("Claim id :"+c.getClaimId());
		
		return c.getClaimId();
	}
	
	public void updateClaim(Integer custId) {
		Optional<Claim> c = claimRepo.findById(custId);
		Claim claim = c.get();
		claim.setClaimStatus("APPROVED");
		claim.setUpdateBy("INSPR");
		
		claim.setUpdateTs(Calendar.getInstance().getTime());
		
		claimRepo.save(c.get());
	}
	
	public Claim getClaimById(Integer custId) {
		return claimRepo.findById(custId).get();
	}
	
	public String getClaimStatus(Integer custId) {
		return claimRepo.findById(custId).get().getClaimStatus();
	}
	
	/*public List<Claim> getAllApprovedClaims(){
		
	}*/
}
