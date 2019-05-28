package arithmeticOperation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Addition {

	@Test (enabled=false)
	public void addMeth_1(){
		
		int a = 10;
		int b = 30;
		int c = a+b;
		System.out.println("Successfully Executed Add Method-1 & The Value is :"+ c);
	}
	
	@Test (enabled=true)
	public void addMeth_2(){
		
		int a = 60;
		int b = 30;
		int c = a+b;
		System.out.println("Successfully Executed Add Method-2 & The Value is :"+ c);
	}
	
	@Test (enabled=false)
	public void addMeth_3(){
		
		int a = 40;
		int b = 30;
		int c = a+b;
		System.out.println("Successfully Executed Add Method-3 & The Value is :"+ c);
	}
}
