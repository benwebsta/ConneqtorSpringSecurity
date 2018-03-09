package com.conneqtor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="ANSWERS")
public class Answers {
	
	@Id
	@Column(name="ANSWER_ID")
	@SequenceGenerator(name="ANSWERS_SEQ", sequenceName="ANSWERS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ANSWERS_SEQ")
	@Qualifier("answerId")
	private int answerId;
	
	@Column(name="USER_ID")
	@Qualifier("userId")
	private int userId;
	
	@Column(name="ANSWER1")
	@Qualifier("answer1")
	private String answer1;
	
	@Column(name="ANSWER2")
	@Qualifier("answer2")
	private String answer2;

	@Column(name="ANSWER3")
	@Qualifier("answer3")
	private String answer3;

	@Column(name="ANSWER4")
	@Qualifier("answer4")
	private String answer4;

	@Column(name="ANSWER5")
	@Qualifier("answer5")
	private String answer5;

	@Column(name="ANSWER6")
	@Qualifier("answer6")
	private String answer6;

	@Column(name="ANSWER7")
	@Qualifier("answer7")
	private String answer7;

	@Column(name="ANSWER8")
	@Qualifier("answer8")
	private String answer8;

	@Column(name="ANSWER9")
	@Qualifier("answer9")
	private String answer9;
	
	@Column(name="ANSWER10")
	@Qualifier("answer10")
	private String answer10;
	
	@Column(name="ANSWER11")
	@Qualifier("answer11")
	private String answer11;
	
	@Column(name="ANSWER12")
	@Qualifier("answer12")
	private String answer12;

	@Column(name="ANSWER13")
	@Qualifier("answer13")
	private String answer13;

	@Column(name="ANSWER14")
	@Qualifier("answer14")
	private String answer14;

	@Column(name="ANSWER15")
	@Qualifier("answer15")
	private String answer15;

	@Column(name="ANSWER16")
	@Qualifier("answer16")
	private String answer16;

	@Column(name="ANSWER17")
	@Qualifier("answer17")
	private String answer17;

	@Column(name="ANSWER18")
	@Qualifier("answer18")
	private String answer18;

	@Column(name="ANSWER19")
	@Qualifier("answer19")
	private String answer19;
	
	@Column(name="ANSWER20")
	@Qualifier("answer20")
	private String answer20;
	
	@Column(name="ANSWER21")
	@Qualifier("answer21")
	private String answer21;
	
	@Column(name="ANSWER22")
	@Qualifier("answer22")
	private String answer22;

	@Column(name="ANSWER23")
	@Qualifier("answer23")
	private String answer23;

	@Column(name="ANSWER24")
	@Qualifier("answer24")
	private String answer24;

	@Column(name="ANSWER25")
	@Qualifier("answer25")
	private String answer25;

	@Column(name="ANSWER26")
	@Qualifier("answer26")
	private String answer26;

	@Column(name="ANSWER27")
	@Qualifier("answer27")
	private String answer27;

	@Column(name="ANSWER28")
	@Qualifier("answer28")
	private String answer28;

	@Column(name="ANSWER29")
	@Qualifier("answer29")
	private String answer29;

	@Column(name="ANSWER30")
	@Qualifier("answer30")
	private String answer30;

	@Column(name="ANSWER31")
	@Qualifier("answer31")
	private String answer31;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getAnswer4() {
		return answer4;
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

	public String getAnswer5() {
		return answer5;
	}

	public void setAnswer5(String answer5) {
		this.answer5 = answer5;
	}

	public String getAnswer6() {
		return answer6;
	}

	public void setAnswer6(String answer6) {
		this.answer6 = answer6;
	}

	public String getAnswer7() {
		return answer7;
	}

	public void setAnswer7(String answer7) {
		this.answer7 = answer7;
	}

	public String getAnswer8() {
		return answer8;
	}

	public void setAnswer8(String answer8) {
		this.answer8 = answer8;
	}

	public String getAnswer9() {
		return answer9;
	}

	public void setAnswer9(String answer9) {
		this.answer9 = answer9;
	}

	public String getAnswer10() {
		return answer10;
	}

	public void setAnswer10(String answer10) {
		this.answer10 = answer10;
	}

	public String getAnswer11() {
		return answer11;
	}

	public void setAnswer11(String answer11) {
		this.answer11 = answer11;
	}

	public String getAnswer12() {
		return answer12;
	}

	public void setAnswer12(String answer12) {
		this.answer12 = answer12;
	}

	public String getAnswer13() {
		return answer13;
	}

	public void setAnswer13(String answer13) {
		this.answer13 = answer13;
	}

	public String getAnswer14() {
		return answer14;
	}

	public void setAnswer14(String answer14) {
		this.answer14 = answer14;
	}

	public String getAnswer15() {
		return answer15;
	}

	public void setAnswer15(String answer15) {
		this.answer15 = answer15;
	}

	public String getAnswer16() {
		return answer16;
	}

	public void setAnswer16(String answer16) {
		this.answer16 = answer16;
	}

	public String getAnswer17() {
		return answer17;
	}

	public void setAnswer17(String answer17) {
		this.answer17 = answer17;
	}

	public String getAnswer18() {
		return answer18;
	}

	public void setAnswer18(String answer18) {
		this.answer18 = answer18;
	}

	public String getAnswer19() {
		return answer19;
	}

	public void setAnswer19(String answer19) {
		this.answer19 = answer19;
	}

	public String getAnswer20() {
		return answer20;
	}

	public void setAnswer20(String answer20) {
		this.answer20 = answer20;
	}

	public String getAnswer21() {
		return answer21;
	}

	public void setAnswer21(String answer21) {
		this.answer21 = answer21;
	}

	public String getAnswer22() {
		return answer22;
	}

	public void setAnswer22(String answer22) {
		this.answer22 = answer22;
	}

	public String getAnswer23() {
		return answer23;
	}

	public void setAnswer23(String answer23) {
		this.answer23 = answer23;
	}

	public String getAnswer24() {
		return answer24;
	}

	public void setAnswer24(String answer24) {
		this.answer24 = answer24;
	}

	public String getAnswer25() {
		return answer25;
	}

	public void setAnswer25(String answer25) {
		this.answer25 = answer25;
	}

	public String getAnswer26() {
		return answer26;
	}

	public void setAnswer26(String answer26) {
		this.answer26 = answer26;
	}

	public String getAnswer27() {
		return answer27;
	}

	public void setAnswer27(String answer27) {
		this.answer27 = answer27;
	}

	public String getAnswer28() {
		return answer28;
	}

	public void setAnswer28(String answer28) {
		this.answer28 = answer28;
	}

	public String getAnswer29() {
		return answer29;
	}

	public void setAnswer29(String answer29) {
		this.answer29 = answer29;
	}

	public String getAnswer30() {
		return answer30;
	}

	public void setAnswer30(String answer30) {
		this.answer30 = answer30;
	}

	public String getAnswer31() {
		return answer31;
	}

	public void setAnswer31(String answer31) {
		this.answer31 = answer31;
	}

	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", userId=" + userId + ", answer1=" + answer1 + ", answer2=" + answer2
				+ ", answer3=" + answer3 + ", answer4=" + answer4 + ", answer5=" + answer5 + ", answer6=" + answer6
				+ ", answer7=" + answer7 + ", answer8=" + answer8 + ", answer9=" + answer9 + ", answer10=" + answer10
				+ ", answer11=" + answer11 + ", answer12=" + answer12 + ", answer13=" + answer13 + ", answer14="
				+ answer14 + ", answer15=" + answer15 + ", answer16=" + answer16 + ", answer17=" + answer17
				+ ", answer18=" + answer18 + ", answer19=" + answer19 + ", answer20=" + answer20 + ", answer21="
				+ answer21 + ", answer22=" + answer22 + ", answer23=" + answer23 + ", answer24=" + answer24
				+ ", answer25=" + answer25 + ", answer26=" + answer26 + ", answer27=" + answer27 + ", answer28="
				+ answer28 + ", answer29=" + answer29 + ", answer30=" + answer30 + ", answer31=" + answer31 + "]";
	}
	
}
