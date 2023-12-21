package com.Demo.demoProject.Entity;

public class Employee {
	private String name,location;
	private Integer age , id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Employee(Integer id, String location, Integer age, String name) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", age=" + age + ", id=" + id + "]";
	}
	

}
