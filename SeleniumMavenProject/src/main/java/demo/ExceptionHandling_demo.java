package demo;

public class ExceptionHandling_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		demo1();

	}	
	public static void demo1(){


		try {
			System.out.println("Hello World");
			int i=1/0;
			System.out.println("Completed");
		} catch (Exception e) {


			// TODO Auto-generated catch block
			System.out.println("Inside try");

			System.out.println("Messages is " +e.getMessage());
			System.out.println("Cause is " +e.getCause());
			e.printStackTrace();
		
		}
		finally {
			System.out.println("Inside Finally");
		}

	}
}


