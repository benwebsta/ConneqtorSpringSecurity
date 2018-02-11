package com.conneqtor.beans;

public class QuestionsDTO {

	private int questionId;
	
	private String question;
	
	private String a;
	
	private String b;
	
	private String c;
	
	private String d;
	
	private String e;
	
	private String f;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	@Override
	public String toString() {
		return "QuestionsDTO [questionId=" + questionId + ", question=" + question + ", a=" + a + ", b=" + b + ", c="
				+ c + ", d=" + d + ", e=" + e + ", f=" + f + "]";
	}
	
}
