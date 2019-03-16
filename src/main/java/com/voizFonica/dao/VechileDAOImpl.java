package com.voizFonica.dao;


import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.voizFonica.beans.Dates;
import com.voizFonica.beans.Register;

public class VechileDAOImpl implements IVechileDAO {

	Map<String,Register> regMap;
	
	public Register vechileRegistration(Register reg) {
		regMap = new HashMap<String,Register>(); 

		
		
		regMap.put(reg.getVechileNo(), new Register(reg.getVechileType(),reg.getInsPeriod(),reg.getAadharNo(),reg.getMobNo(),reg.getTodayDate()));
		
		return reg;
	}
	

	public Dates insValCheck(String str) {
Register obj3 = new Register();
		Dates obj1 = new Dates();
		int count=0;
				
		for(Map.Entry<String,Register> obj : regMap.entrySet()) {

			if(str.equals(obj.getKey())) {
				obj3 = obj.getValue();
				
				Calendar cal = Calendar.getInstance();
				Date today = obj3.getTodayDate();
				cal.add(Calendar.YEAR, 1); 
				Date nextyearDate = cal.getTime();
				
				obj1.setNextyearDate(nextyearDate);  
				
		
		 // 	    Calendar date1 = Calendar.getInstance();
	   // date1.setTime(obj3.getTodayDate());
	   // Format f = new SimpleDateFormat("yyyy-mm-dd");
	//    System.out.println(f.format(date1.getTime()));
	  //  date1.add(Calendar.YEAR,1);
	 //   System.out.println(f.format(date1.getTime()));
	//	obj1.setNextyearDate(f.format(date1.getTime()));
		 
				count++;
				break;
			}
					}
		
		if(count==0) 
			return null; 
		else
		return obj1;
		
	}

}
