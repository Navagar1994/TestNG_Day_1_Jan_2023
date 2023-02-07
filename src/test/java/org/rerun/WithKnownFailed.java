package org.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class WithKnownFailed implements IRetryAnalyzer{

	
	int low = 0;
	int high = 10;
	@Override
	public boolean retry(ITestResult result) {
		
		if(low<high){
			low++;
			return true;  // test fail OR return true it rerun until condition getting failed
		}
		return false;  // test pass OR return false 
	}
}
