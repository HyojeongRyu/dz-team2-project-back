package com.dz.factory.service.management;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dz.factory.domain.management.ProductRelation;
import com.dz.factory.mapper.management.ProductRelationMapper;
import com.dz.factory.web.dto.management.ProductRelationDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductRelationService {

	private final ProductRelationMapper productRelationMapper;
	
	@Transactional
	public void productRelationAdd(ProductRelationDto dto) {
		
		for(ProductRelation component : dto.getComponents()) {
			ProductRelation insertData = new ProductRelation();
			insertData.setComponent_id(component.getItem_id());
			insertData.setQuantity(component.getQuantity());
			insertData.setItem_id(dto.getProductId());
			productRelationMapper.insert(insertData);
		}
		
	}
	
	
}
