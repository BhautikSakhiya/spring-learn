package com.springdemo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")		//explicit beanId
@Component							//default beanId --> generate id same name as class name, only first letter is small
public class TennisCoach implements Coach {
	
	
//	use @qualifier when multiple class implements interface --> Example - @Qualifier("happyFortuneService")	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {System.out.println("In Constructor");}
	
////	Autowired using setter method
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	
//	Autowired using constructor
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	@PostConstruct
	public void doStartup() {
		System.out.println("inside doStartup and use postConstruct");
	}
	
	@PreDestroy
	public void doCleanup() {
		System.out.println("inside doCleanup and use preDestroy");
	}
	
	@Override
	public String getDailyWorkout() {
		return "sprint 10mtr 20 times";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
