package com.wolken.wolkenapp;

import com.wolken.wolkenapp.dto.ElectronicsProductsDTO;

public class ElectronicsUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectronicsProductsDTO dto=new ElectronicsProductsDTO();
		
		dto.setPrice(1000);
		dto.setProductId(100);
		dto.setProductName("Fridge");
		dto.setType("homeappliances");
		dto.setRating(4);
		System.out.println(dto.toString());
		ElectronicsProductsDTO dto2= new ElectronicsProductsDTO();
		

	}

}
