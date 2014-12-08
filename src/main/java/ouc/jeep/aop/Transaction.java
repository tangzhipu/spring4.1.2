package ouc.jeep.aop;

import org.aspectj.lang.JoinPoint;


public class Transaction {
	public void beginTransaction(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.err.println(methodName); 
		System.err.println("begin transaction");
	}
	
	public void commit(){
		System.err.println("commit");
	}
	
}
