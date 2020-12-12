package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Visit;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/Spring.xml");
		
		Visit v = (Visit) ap.getBean("v");
		
		v.cashOut();

	}

}
