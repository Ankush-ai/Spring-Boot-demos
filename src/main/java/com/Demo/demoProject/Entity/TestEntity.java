package com.Demo.demoProject.Entity;

import org.antlr.v4.runtime.misc.NotNull;

public class TestEntity {
	@SuppressWarnings("deprecation")
	@NotNull
	private String name;
	@SuppressWarnings("deprecation")
	@NotNull
	private Integer id;
	public TestEntity(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public TestEntity() {
		
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
	@Override
	public String toString() {
		return "TestEntity [name=" + name + ", id=" + id + "]";
	}
	

}
