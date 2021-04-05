package com.wolken.wolkenapp.dto;

import com.wolken.wolkenapp.DTO.;

public class ElectronicsProductsDTO {
	private Integer productId;
	private String productName;
	private Integer price;
	private String type;
	private Integer rating;
	
	public ElectronicsProductsDTO() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating=rating;
	}
	
	@Override
	public String toString() {
		return "Electronics products: "+this.productName+"|"+this.productId+"|"+this.getPrice()+"|"+this.getRating();
	}
	@Override
	public int hashCode() {
		return this.productId;
	}
	@Override
	public boolean equals(Object obj) {
		ElectronicsProductsDTO dto=(ElectronicsProductsDTO)obj;
		if(obj==null) {
			return false;
			
			
		}
		else {
			if(obj!=null) {
				if(obj instanceof ElectronicsProductsDTO) {
					if(this.hashCode()==obj.hashCode()) {
						return true;
					}
				}
			}
		}
		return false;
		
		
	}
}
