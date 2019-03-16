package com.voizFonica.service;

import com.voizFonica.beans.Dates;
import com.voizFonica.beans.Register;

public interface IVechileService{

	public Register vechileRegistration(Register reg);
	public Dates insValCheck(String str);

	
}
