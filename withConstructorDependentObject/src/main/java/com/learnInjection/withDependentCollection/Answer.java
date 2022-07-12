package com.learnInjection.withDependentCollection;

public class Answer {

	private int id;
	private String answer;
	private String by;
	public Answer(int id, String answer, String by) {
		super();
		this.id = id;
		this.answer = answer;
		this.by = by;
	}
	
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", by=" + by + "]";
	}
	
	
}
