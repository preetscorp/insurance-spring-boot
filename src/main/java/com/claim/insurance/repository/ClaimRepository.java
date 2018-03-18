package com.claim.insurance.repository;

import org.springframework.data.repository.CrudRepository;

import com.claim.insurance.entity.Claim;

public interface ClaimRepository extends CrudRepository<Claim,Integer>{

}
