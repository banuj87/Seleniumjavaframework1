package demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;




// we can create meta groups which are custom groups
public class TestNgGroupsDemo {

	@Test(groups = {"sanity"})
	public void test1(){
		System.out.println("This is test 1");


	}
	@Test(groups = {"sanity","smoke"})
	public void test2(){
		System.out.println("This is test 2");

	}
	@Test(groups = {"regression","sanity"})
	public void test3(){
		System.out.println("This is test 3");
	}
	@Test
	public void test4(){
		System.out.println("This is test 4");



	}
}
