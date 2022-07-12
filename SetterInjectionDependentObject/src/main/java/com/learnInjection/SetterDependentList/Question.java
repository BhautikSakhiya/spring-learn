package com.learnInjection.SetterDependentList;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String question;
	private List<String> answer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	
	public void show() {
		System.out.println(id+" "+question);
		Iterator<String> itr = answer.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
