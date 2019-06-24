package com.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	@Id
	private String pid;
	private String enamel;
	private Double esal;
	
	
	public Product() {
		super();
	}
	public Product(String enamel, Double esal) {
		super();
		this.enamel = enamel;
		this.esal = esal;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getEnamel() {
		return enamel;
	}
	public void setEnamel(String enamel) {
		this.enamel = enamel;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", enamel=" + enamel + ", esal=" + esal + "]";
	}

	
	
	
	


}
