package com.learnInjection.withDependentMapObject;

import java.util.Date;

public class Answer {

	private int id;
	private String answer;
	private Date date;
	
	public Answer() {}
	public Answer(int id, String answer, Date date) {
		super();
		this.id = id;
		this.answer = answer;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", date=" + date + "]";
	}
	
	 
}
