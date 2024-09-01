package com.shopping.smartkart.api;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.smartkart.Exception.SmartKartException;
import com.shopping.smartkart.dto.ProductDTO;
import com.shopping.smartkart.service.ProductService;

@RestController
@RequestMapping(value = "/product-api")
public class ProductsAPI {
	
	@Autowired
	private ProductService prodServ;
	
	@GetMapping(value = "/products/{productId}")
	public ResponseEntity<ProductDTO> getProducts(@PathVariable Integer productId) throws SmartKartException{
		ProductDTO prodDTO = prodServ.getProductById(productId);
		return new ResponseEntity<>(prodDTO, HttpStatus.OK);
	}

}
