package com.voizFonica.service;

import com.voizFonica.beans.Dates;
import com.voizFonica.beans.Register;
import com.voizFonica.dao.IVechileDAO;
import com.voizFonica.dao.VechileDAOImpl;

public class VechileServiceImpl  implements IVechileService {

	IVechileDAO obj = new VechileDAOImpl();
	
	public Register vechileRegistration(Register reg) {
		
		
		// TODO Auto-generated method stub
		return obj.vechileRegistration(reg);
	}

	public Dates insValCheck(String str) {
		// TODO Auto-generated method stub
		return obj.insValCheck(str);
	}

	
}
