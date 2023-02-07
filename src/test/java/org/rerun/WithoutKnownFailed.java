package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class WithoutKnownFailed implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
		
		IRetryAnalyzer retryAnalyzer = a.getRetryAnalyzer(); // it gets the failed testcases from listeners and send it to retry method
		                                                     // but if it   try to send the failed test cases we have to write many conditions
		                                                     // so we go for another method setRetryAnalyzer();
		a.setRetryAnalyzer(WithKnownFailed.class);
		
		  
		
	}
	
	

}
