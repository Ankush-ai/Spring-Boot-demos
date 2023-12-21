package com.Demo.demoProject.Entity;

public class Products {
	private String name;
	private Integer id;
	private Double price;
	public Products(String name, Integer id, Double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
 public void Products() {
	 
 }
@Override
public String toString() {
	return "Products [name=" + name + ", id=" + id + ", price=" + price + "]";
}
}
