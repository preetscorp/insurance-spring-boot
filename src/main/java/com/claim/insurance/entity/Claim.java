package com.claim.insurance.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Claim {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer claimId;
	
	Integer userId;//fk
	Integer policyNo;
	Integer vehicleNo;
	Integer dlNo;
	String claimStatus;
	BigDecimal claimAmt;
	Integer insuranceProviderId;
	String createBy; //chk this
	String updateBy;
	Date createTs;
	Date updateTs;
	
	byte[] image;
	
	
	public Claim() {}
	
	public Claim(Integer userId, Integer policyNo, Integer vehicleNo, Integer dlNo,
			BigDecimal claimAmt, Integer insuranceProviderId,String createBy,Date createTs) {
		super();
		this.userId = userId;
		this.policyNo = policyNo;
		this.vehicleNo = vehicleNo;
		this.dlNo = dlNo;
		this.claimAmt = claimAmt;
		this.insuranceProviderId = insuranceProviderId;
		this.createBy =createBy;
		this.createTs = createTs;
	}
	
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(Integer policyNo) {
		this.policyNo = policyNo;
	}
	public Integer getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(Integer vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public Integer getDlNo() {
		return dlNo;
	}
	public void setDlNo(Integer dlNo) {
		this.dlNo = dlNo;
	}
	public String getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	public BigDecimal getClaimAmt() {
		return claimAmt;
	}
	public void setClaimAmt(BigDecimal claimAmt) {
		this.claimAmt = claimAmt;
	}
	public Integer getInsuranceProviderId() {
		return insuranceProviderId;
	}
	public void setInsuranceProviderId(Integer insuranceProviderId) {
		this.insuranceProviderId = insuranceProviderId;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}

	public Date getUpdateTs() {
		return updateTs;
	}

	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}
	
}
