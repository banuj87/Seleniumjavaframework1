package demo;

import org.testng.annotations.Test;

public class TestNGPriority_demo {


	@Test(priority=1)
	public void Test1() {
		System.out.println("Test 1");

	}
	@Test(priority=1)
	public void Test2() {

		System.out.println("Test 2");
	}
	@Test(priority=-30)
	public void Test3() {
		System.out.println("Test 3");

	}
}

