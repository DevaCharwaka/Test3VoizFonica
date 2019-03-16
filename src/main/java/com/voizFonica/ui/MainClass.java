package com.voizFonica.ui;

import java.util.Calendar;
import java.util.Scanner;
import java.sql.Date;
import java.text.Format;
import java.text.SimpleDateFormat;

import com.voizFonica.beans.*;
import com.voizFonica.service.*;

public class MainClass {

	static IVechileService obj = new VechileServiceImpl();
	static Scanner sc = new Scanner(System.in);
	public static Register setInfo() {
		Register reg = new Register();
		
		
		System.out.println("Enter the vechile number");
		reg.setVechileNo(sc.next());
		System.out.println("Enter the vechile type");
		reg.setVechileType(sc.next());
		System.out.println("Enter the insurance period");
		reg.setInsPeriod(sc.nextInt());
		System.out.println("Enter the aadhar number");
		reg.setAadharNo(sc.nextLong());
		System.out.println("Enter the mobile number");
		reg.setMobNo(sc.nextLong());

		long todayDate = System.currentTimeMillis();  
	   // Format f = new SimpleDateFormat("dd-mm-yyyy");
		java.sql.Date date =new java.sql.Date(todayDate);  
	//	System.out.println(date);  

	    
		reg.setTodayDate(date);
		
		
		
		Register reg1 = obj.vechileRegistration(reg);
	return reg1;
	
	}
	
	
	public static void main(String args[]) {
				
		int ch;
	
		while(true) {

			System.out.println("1.vechile insurance registration 2. insurance chekck 3. exit");
			ch = sc.nextInt();

			switch(ch){
			case 1: Register reg = setInfo();
						System.out.println("your insurance has succesfully registered on vechile number "+reg.getVechileNo());
						break;	
			case 2:	System.out.println("Enter the vechile number");
					String str1 = sc.next();
					Dates dt =obj.insValCheck(str1);
						System.out.println("your insurance expires on "+dt.getNextyearDate());
					
		}
		}
	}
	
}
