package com.dz.factory.common.domain;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class ProductRelation {

	private int relation_id;
	
	@NotBlank(message="item_code")
	private String item_code;
	private int company_id;
	
	@NotBlank(message="component_code")
	private String component_code;
	
	@NotBlank(message="quantity")
	private int quantity;

	
	
}
