package com.learnInjection.withDependentCollection;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String question;
	private List<String> answer;
	
	public Question(int id, String question, List<String> answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	
	public void show() {
		System.out.println(id+" "+question);
		Iterator<String> itr = answer.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
