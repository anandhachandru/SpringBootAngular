package com.ck.alpha.bean;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class JsonResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	@com.fasterxml.jackson.databind.annotation.JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	private String messageType;

	private String messageCode;

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	private String message;

	private boolean success;// To reset page on True Condition

	public JsonResponse() {
		super();
	}

	public JsonResponse(Object obj, String messageType, String messageCode, String message, boolean success) {
		super();
		this.data = obj;
		this.messageType = messageType;
		this.messageCode = messageCode;
		this.message = message;
		this.success = success;
	}

}
