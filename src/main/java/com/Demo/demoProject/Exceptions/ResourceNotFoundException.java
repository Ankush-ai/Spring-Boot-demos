package com.Demo.demoProject.Exceptions;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException (String message) {
		super(message);
	}

}
