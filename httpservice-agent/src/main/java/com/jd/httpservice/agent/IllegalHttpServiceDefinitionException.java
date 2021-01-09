package com.jd.httpservice.agent;

import com.jd.httpservice.HttpServiceException;

public class IllegalHttpServiceDefinitionException extends HttpServiceException{

	private static final long serialVersionUID = -6866487415383367958L;

	public IllegalHttpServiceDefinitionException() {
	}
	
	public IllegalHttpServiceDefinitionException(String message) {
		super(message);
	}
	
	public IllegalHttpServiceDefinitionException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
}
