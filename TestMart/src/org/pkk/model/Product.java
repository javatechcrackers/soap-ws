package org.pkk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Product")
@XmlType(propOrder={"price","sku","name"})
public class Product {

	private String name;
	private String price;
	private String sku;
	
	@XmlElement(name="ProductName")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Product(String name, String price, String sku) {
		super();
		this.name = name;
		this.price = price;
		this.sku = sku;
	}

	public Product() {
	}

	
}
