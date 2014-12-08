package ouc.jeep.threadLocal;

class Out{
	private int age = 12;
	
	public void print(final int x){
		class In{
			public void inPrint(){
				System.err.println(x +" : "+age);
			}
		}
		new In().inPrint();
		System.err.println(new In().getClass()); 
	}
}

public class Test {
	public static void main(String[] args) {
		Out out = new Out();
		out.print(3); 
	}
}
