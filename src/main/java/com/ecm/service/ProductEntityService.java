package com.ecm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecm.entity.ProductEntity;

@Service
public interface ProductEntityService {

	List<ProductEntity> findAll();

	ProductEntity findById(Long id);

	void save(ProductEntity productEntity);

}
