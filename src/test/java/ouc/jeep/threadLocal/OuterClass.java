package ouc.jeep.threadLocal;

public class OuterClass {
	private static final int age = 12;
	
	public static class InnerClass{
		public void print(){
			System.err.println(age);
		}
	}

}
