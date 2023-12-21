package com.Demo.demoProject.Exceptions;

@SuppressWarnings("serial")
public class NoDataFoundException  extends RuntimeException{
	public NoDataFoundException (String message) {
		super(message);
	}

}
