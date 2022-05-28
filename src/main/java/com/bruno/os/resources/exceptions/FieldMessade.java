package com.bruno.os.resources.exceptions;

import java.io.Serializable;

public class FieldMessade implements Serializable {

	private static final long serialVersionUID = 1L;

	private String FieldName;
	private String message;

	public FieldMessade() {
		super();

	}

	public FieldMessade(String fieldName, String message) {
		super();
		FieldName = fieldName;
		this.message = message;
	}

	public String getFieldName() {
		return FieldName;
	}

	public void setFieldName(String fieldName) {
		FieldName = fieldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
