package arithmeticOperators;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Arithmetic {
	
	@Test (groups={"Sanity"})
	public void AddtionMethod1(){
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		Assert.assertEquals(c,30);
		System.out.println("Successfully executed Addtion Method-1");
		}
	
	@Test 
	public void MultiplyMethod1(){
		
		int a = 10;
		int b = 20;
		int c = a*b;
		
		Assert.assertEquals(c,600);
		System.out.println("Successfully executed Multiply Method-1");
		}

	@Test (groups={"Sanity"})
	public void AddtionMethon2(){
		
		int a = 30;
		int b = 20;
		int c = a+b;
		
		Assert.assertEquals(c,50);
		System.out.println("Successfully executed Addtion Method-2");
		}
	
	@Test 
	public void MultiplyMethod2(){
		
		int a = 30;
		int b = 20;
		int c = a*b;
		
		Assert.assertEquals(c,600);
		System.out.println("Successfully executed Multiply Method-2");
		}
	
	@Test 
	public void MultiplyMethod3(){
		
		int a = 20;
		int b = 20;
		int c = a*b;
		
		Assert.assertEquals(c,400);
		System.out.println("Successfully executed Multiply Method-3");
		}
	
	@Test (groups={"Sanity"})
	public void AddtionMethod3(){
		
		int a = 20;
		int b = 20;
		int c = a+b;
		
		Assert.assertEquals(c,40);
		System.out.println("Successfully executed Addtion Method-3");
		}
}
