package com.voizFonica.dao;

import com.voizFonica.beans.Dates;
import com.voizFonica.beans.Register;

public interface IVechileDAO {

	public Register vechileRegistration(Register reg);
	public Dates insValCheck(String str);
	
}
