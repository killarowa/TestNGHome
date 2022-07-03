package Calculations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Division {

	@Test  //(invocationCount=5)
	public void Test_Devide_TwoPositiveNumbers(){
		int a = 120;
		int b = 3;
		
		int actual = (a / b);
		
		int expected = 40;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Test_Devide_TwoNegativeNumbers(){
		int a = -5;
		int b = -10;
		
		int actual = (a / b);
		
		int expected = 0;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Test_Devide_NegativePositiveNumbers(){
		int a = -5;
		int b = 10;
		
		int actual = (a / b);
		
		int expected = 0;
		
		Assert.assertEquals(actual, expected);
	}
	
	
	
	
	
}
