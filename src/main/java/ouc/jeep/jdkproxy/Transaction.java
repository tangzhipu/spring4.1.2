package ouc.jeep.jdkproxy;

public class Transaction {
	public void beginTransaction(){
		System.out.println("开启事务 ");
	}
	public void commit(){
		System.out.println("事务提交");
	}
}
