package com.shopping.smartkart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.smartkart.Exception.SmartKartException;
import com.shopping.smartkart.dto.CustomerSignInDTO;
import com.shopping.smartkart.entity.CustomerSignIn;
import com.shopping.smartkart.repository.CustomerSignInRepository;

@Transactional
@Service
public class CustomerLoginServiceImpl implements CustomerLoginService{
	
	@Autowired
	public CustomerSignInRepository customerRepo;

	@Override
	public String authenticateUser(CustomerSignInDTO userDetails) throws SmartKartException {
		Optional<CustomerSignIn> customerOp = customerRepo.findById(userDetails.getuserEmailId());
		CustomerSignIn customerDetails = customerOp.orElseThrow(() -> new SmartKartException("user ID is found, please enter an valid ID"));
		if(userDetails.getPassword().equals(customerDetails.getPassword())) {
			return userDetails.getUserName() + " your login is successful";
		}
		return "your login failed";
	}
	
	

}
