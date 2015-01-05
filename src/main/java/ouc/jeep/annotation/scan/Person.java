package ouc.jeep.annotation.scan;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	
	@Resource(name="student")
	private Student student;

	public void showStudent(){
		this.student.show();
	}
}
