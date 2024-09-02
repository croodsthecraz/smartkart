package com.shopping.smartkart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.smartkart.dto.CustomerSignInDTO;
import com.shopping.smartkart.entity.CustomerSignIn;
import com.shopping.smartkart.repository.CustomerSignInRepository;

@Transactional
@Service
public class CustomerSignInServiceImpl implements CustomerSignInService{

	@Autowired
	private CustomerSignInRepository customerCred;
	
	
	@Override
	public String addCustomerCred(CustomerSignInDTO customerCredDTO) {
		Optional<CustomerSignIn> custOp = customerCred.findById(customerCredDTO.getuserEmailId());
		String customer = "Email ID is already present";
		if(custOp.isEmpty()) {
			CustomerSignIn custSignIn = new CustomerSignIn();
			custSignIn.setuserEmailId(customerCredDTO.getuserEmailId());
			custSignIn.setUserName(customerCredDTO.getUserName());
			custSignIn.setPassword(customerCredDTO.getPassword());
			customer = custSignIn.getUserName() + " SignIn successfull";
			customerCred.save(custSignIn);
		}
		return customer;
	}

}
