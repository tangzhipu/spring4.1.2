package ouc.jeep.annotation.scan;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScanTest {

	@Test
	public void test(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ouc/jeep/annotation/scan/applicationContext.xml");
		Person person = (Person)context.getBean("person");
		person.showStudent();
	}
}
