package com.voizFonica.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.voizFonica.beans.Register;

class VechileDAOImplTest {

	@Test
	void testVechileRegistration() {
		VechileDAOImpl obj = new  VechileDAOImpl();
		Register reg=  new Register();
		reg.setVechileNo("TS10EP3364");
		reg.setVechileType("2Wheeler");
		reg.setAadharNo(421258151);
		reg.setMobNo(954282973);
		reg.setInsPeriod(3);
		long todayDate = System.currentTimeMillis();  


		java.sql.Date date =new java.sql.Date(todayDate);  
		
		reg.setTodayDate(date);
		Register test = obj.vechileRegistration(reg);
		assertEquals(test.getVechileNo(), "TS10EP3364");
	}

}
