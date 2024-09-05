package com.shopping.smartkart.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.smartkart.Exception.SmartKartException;
import com.shopping.smartkart.dto.CustomerSignInDTO;
import com.shopping.smartkart.service.CustomerLoginService;

@RestController
@RequestMapping(value = "/customer-login")
public class CustomerLoginAPI {
	
	@Autowired
	public CustomerLoginService customerLogin;
	
	//customer Sign model should be used 
	@GetMapping(value= "/login")
	public ResponseEntity<String> authenticateUser(@RequestBody CustomerSignInDTO userDetails) throws SmartKartException{
		String message = customerLogin.authenticateUser(userDetails);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

}
