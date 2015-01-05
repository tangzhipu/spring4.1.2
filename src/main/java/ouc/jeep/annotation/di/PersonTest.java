package ouc.jeep.annotation.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("ouc/jeep/annotation/di/applicationContext.xml");
		Person person = (Person)context.getBean("person");
		person.showStudent();
	}
}
