package arithmeticOperation;

import org.testng.annotations.Test;

public class Subtraction {
	
	@Test 
	public void subMeth_1(){
		
		int a = 40;
		int b = 30;
		int c = a-b;
		
		System.out.println("Successfully Executed Subtraction Method-1 & The Value is :"+ c);
	}
	
	@Test 
	public void subMeth_2(){
		
		int a = 60;
		int b = 30;
		int c = a-b;
		
		System.out.println("Successfully Executed Subtraction Method-2 & The Value is :"+ c);
	}
	
	@Test 
	public void subMeth_3(){
		
		int a = 10;
		int b = 30;
		int c = a-b;
		
		System.out.println("Successfully Executed Subtraction Method-3 & The Value is :"+ c);
	}
}
