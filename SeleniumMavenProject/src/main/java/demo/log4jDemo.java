package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class log4jDemo {

	
	
private static	org.apache.logging.log4j.Logger logger = LogManager.getLogger(log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("    \n   Hello World   \n");
		
		logger.info("This is info message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");

		
		System.out.println("Completed");
	}

}
