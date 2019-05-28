package arithmeticOperation;

import org.testng.annotations.Test;

public class Multiplication {

	@Test
	public void multMeth_1(){
		
		int a = 40;
		int b = 30;
		int c = a*b;
		
		System.out.println("Successfully Executed Multiplication Method-1 & The Value is :"+ c);
	}
	
	@Test
	public void multMeth_2(){
		
		int a = 10;
		int b = 30;
		int c = a*b;
		
		System.out.println("Successfully Executed Multiplication Method-2 & The Value is :"+ c);
	}
	
	@Test
	public void multMeth_3(){
		
		int a = 60;
		int b = 30;
		int c = a*b;
		
		System.out.println("Successfully Executed Multiplication Method-3 & The Value is :"+ c);
	}
}
