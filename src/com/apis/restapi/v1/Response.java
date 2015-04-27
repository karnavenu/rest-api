package com.apis.restapi.v1;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class Response {
	private int code;
	private String message;
	private Object responseObject;

	public Response() {

	}

	public Response(Object resultObject, int code, String message) {
		super();
		this.responseObject = resultObject;
		this.code = code;
		this.message = message;
	}

	public Object getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(Object resultObject) {
		this.responseObject = resultObject;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
