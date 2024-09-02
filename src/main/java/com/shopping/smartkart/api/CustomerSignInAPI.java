package com.shopping.smartkart.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.smartkart.dto.CustomerSignInDTO;
import com.shopping.smartkart.service.CustomerSignInService;

@RestController
@RequestMapping(value = "/customer-signin")
public class CustomerSignInAPI {
	
	@Autowired
	private CustomerSignInService customerSignIn;
	
	@PostMapping(value = "/SignIn")
	public ResponseEntity<String> addCustomerDetails(@RequestBody CustomerSignInDTO customerCred){
		String cust = customerSignIn.addCustomerCred(customerCred);
		return new ResponseEntity<>(cust, HttpStatus.OK);
	}

}
