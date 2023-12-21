package com.Demo.demoProject.Entity;

public class Customer {

  private String name, Location;

public Customer(String name, String location) {
	super();
	this.name = name;
	Location = location;
}
public Customer() {
}

@Override
public String toString() {
	return "Customer [name=" + name + ", Location=" + Location + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return Location;
}

public void setLocation(String location) {
	Location = location;
}
public void setId1(long l) {
	// TODO Auto-generated method stub
	
}
public void setName(long l) {
	// TODO Auto-generated method stub
	
}
public void setId(long l) {
	// TODO Auto-generated method stub
	
}
}
