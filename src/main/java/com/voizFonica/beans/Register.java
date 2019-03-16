package com.voizFonica.beans;

import java.sql.Date;

public class Register {

	private String vechileNo;
	private String vechileType;
	private int insPeriod;
	private long aadharNo;
	private long mobNo;
	private Date todayDate;
	
	
	public Date getTodayDate() {
		return todayDate;
	}
	public void setTodayDate(Date date) {
		this.todayDate = date;
	}
	public String getVechileNo() {
		return vechileNo;
	}
	public void setVechileNo(String vechileNo) {
		this.vechileNo = vechileNo;
	}
	public String getVechileType() {
		return vechileType;
	}
	public void setVechileType(String vechileType) {
		this.vechileType = vechileType;
	}
	public int getInsPeriod() {
		return insPeriod;
	}
	public void setInsPeriod(int insPeriod) {
		this.insPeriod = insPeriod;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public Register(String vechileType, int insPeriod, long aadharNo, long mobNo, Date todayDate) {
		
		this.vechileType = vechileType;
		this.insPeriod = insPeriod;
		this.aadharNo = aadharNo;
		this.mobNo = mobNo;
		this.todayDate=todayDate;
	}
	
	public Register() {
		
	
	}





}
