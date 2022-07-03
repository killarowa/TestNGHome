package Calculations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Summation {
	
	@Test
	public void Test_Sum_TwoPositiveNumbers(){
		int a = 10;
		int b = 20;
		
		int actual = (a + b);
		
		int expected = 30;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Test_Sum_NegativePositiveNumbers(){
		int a = 50;
		int b = -20;
		
		int actual = (a + b);
		
		int expected = 30;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Test_Sum_TwoNegativeNumbers(){
		int a = -5;
		int b = -41;
		
		int actual = (a + b)*2;
		
		int expected = -92;
		
		Assert.assertEquals(actual, expected);
	}
	
	

}




































