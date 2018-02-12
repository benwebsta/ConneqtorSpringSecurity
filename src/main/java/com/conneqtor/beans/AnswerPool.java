package com.conneqtor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="ANSWER_POOL")
public class AnswerPool {
	
	@Id
	@Column(name="ANSWER_POOL_ID")
	@Qualifier("answerPoolId")
	private int answerPoolId;
	
	@Column(name="A")
	@Qualifier("a")
	private String a;
	
	@Column(name="B")
	@Qualifier("b")
	private String b;
	
	@Column(name="C")
	@Qualifier("c")
	private String c;
	
	@Column(name="D")
	@Qualifier("d")
	private String d;
	
	@Column(name="E")
	@Qualifier("e")
	private String e;
	
	@Column(name="F")
	@Qualifier("f")
	private String f;

	public int getAnswerPoolId() {
		return answerPoolId;
	}

	public void setAnswerPoolId(int answerPoolId) {
		this.answerPoolId = answerPoolId;
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
		return "AnswerPool [answerPoolId=" + answerPoolId + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e="
				+ e + ", f=" + f + "]";
	}

}
