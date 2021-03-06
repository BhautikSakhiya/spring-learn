package com.springmvcdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>{

	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
//		if(theCode != null)
//			if(theCode.contains("java")) return true;
//			else if(theCode.contains("Java")) return true;
//			else return false;
//		return false ;
		boolean result = false;
		if(theCode != null) {
			for (String tempPrefix : coursePrefix) {
                result = theCode.contains(tempPrefix);
                
                // if we found a match then break out of the loop
                if (result) {
                    break;
                }
			}
		}else {
			result = true;
		}
		
//		boolean result = theCode.contains(coursePrefix);
		return result;
	}

}
