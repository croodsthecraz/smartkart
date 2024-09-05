package com.shopping.smartkart.service;

import com.shopping.smartkart.Exception.SmartKartException;
import com.shopping.smartkart.dto.CustomerSignInDTO;

public interface CustomerLoginService {
	
	String authenticateUser(CustomerSignInDTO customerDetails) throws SmartKartException;

}
