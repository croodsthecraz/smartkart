package com.shopping.smartkart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.smartkart.Exception.SmartKartException;
import com.shopping.smartkart.dto.ProductDTO;
import com.shopping.smartkart.entity.Product;
import com.shopping.smartkart.repository.ProductRepository;

@Transactional
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository prodRepo;

	@Override
	public ProductDTO getProductById(Integer productId) throws SmartKartException {
		Optional<Product> prodOps = prodRepo.findById(productId);
		Product prodOp = prodOps
				.orElseThrow(() -> new SmartKartException("No Product is available for this product ID"));
			ProductDTO prodDTO = new ProductDTO();
			prodDTO.setBrand(prodOp.getBrand());
			prodDTO.setCategory(prodOp.getCategory());
			prodDTO.setDescription(prodOp.getDescription());
			prodDTO.setName(prodOp.getName());
			prodDTO.setPrice(prodOp.getPrice());
			prodDTO.setProductId(prodOp.getProductId());
			prodDTO.setQuantity(prodOp.getQuantity());
			
		return prodDTO;
	}

}
