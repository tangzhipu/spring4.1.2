package ouc.jeep.mvc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MvcTest {

	@Test
	public void testAction(){
		ApplicationContext context = new ClassPathXmlApplicationContext("ouc/jeep/mvc/applicationContext.xml");
		PersonAction personAction = (PersonAction) context.getBean("personAction");
		personAction.savePerson();
	}
}
