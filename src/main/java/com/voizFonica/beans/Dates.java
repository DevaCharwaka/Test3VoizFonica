package com.voizFonica.beans;

import java.util.Date;

public class Dates {
	
	private int remDays;
	private Date nextyearDate;
	public int getRemDays() {
		return remDays;
	}
	public void setRemDays(int remDays) {
		this.remDays = remDays;
	}
	public Date getNextyearDate() {
		return nextyearDate;
	}
	public void setNextyearDate(Date nextyearDate2) {
		this.nextyearDate = nextyearDate2;
	}
	public Dates(int remDays, Date nextyearDate) {
		
		this.remDays = remDays;
		this.nextyearDate = nextyearDate;
	}
	
	public Dates() {
		
	}

}
