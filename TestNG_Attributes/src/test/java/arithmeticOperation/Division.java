package arithmeticOperation;

import org.testng.annotations.Test;


public class Division {

	@Test (dependsOnMethods={"divMeth_2"})
	public void divMeth_1(){
		
		int a = 40;
		int b = 30;
		int c = a/b;
		
		System.out.println("Successfully Executed Division Method-1 & The Value is :"+ c);
	}
	
	@Test 
	public void divMeth_2(){
		
		int a = 60;
		int b = 30;
		int c = a/b;
		
		System.out.println("Successfully Executed Division Method-2 & The Value is :"+ c);
	}
	
	@Test 
	public void divMeth_3(){
		
		int a = 10;
		int b = 30;
		int c = a/b;
		
		System.out.println("Successfully Executed Division Method-3 & The Value is :"+ c);
	}
}