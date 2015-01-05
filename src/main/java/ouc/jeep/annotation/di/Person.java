package ouc.jeep.annotation.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

/**
 * 使用resource注解为引用类注入，不需要写setter方法。
 * @author jeep
 *
 */
public class Person {
	private Long pid;
	private String pname;
	
	@Resource(name="student")
	private Student student;
	
	private Set sets;
	
	private List lists;
	
	private Map map;
	
	private Properties properties;
	
	public void showStudent(){
		this.student.show();
	}
}
