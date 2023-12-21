package com.Demo.demoProject.Exceptions;

public class ErrorObject {
	private Long timestamp;
	private String message;
	private int status;
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public ErrorObject() {
		
	}
	
	@Override
	public String toString() {
		return "ErrorObject [timestamp=" + timestamp + ", message=" + message + ", status=" + status + "]";
	}
	public ErrorObject(Long timestamp, String message, int status) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.status = status;
	}
	

}
