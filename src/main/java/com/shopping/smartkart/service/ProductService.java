package com.shopping.smartkart.service;

import java.util.List;

import com.shopping.smartkart.Exception.SmartKartException;
import com.shopping.smartkart.dto.ProductDTO;

public interface ProductService {
	
	ProductDTO getProductById(Integer ProductId) throws SmartKartException;

}
