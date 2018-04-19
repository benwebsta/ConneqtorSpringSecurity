package com.conneqtor.beans;

public class QuestionFormDTO {

	private String response;
	private boolean result;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "QuestionFormDTO [response=" + response + ", result=" + result + "]";
	}
	
}
