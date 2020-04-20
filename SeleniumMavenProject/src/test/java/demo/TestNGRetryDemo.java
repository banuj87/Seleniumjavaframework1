package demo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryDemo {
	
	
	
	@Test
	public void test1() {
		
		System.out.println("I'm inside test1");
	}
	@Test
	public void test2() {
		
		System.out.println("I'm inside test2");
		//int i = 1/0;
		
	}
	
	@Test (retryAnalyzer=listeners.RetryDemo.class)
	public void test3() {
		
		System.out.println("I'm inside test3");
		AssertJUnit.assertTrue(0>1);
	}

}
