package Calculations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Subtraction {

	@Test
	public void Test_Substract_TwoPositiveNumbers(){
		int a = 1203;
		int b = 20;
		
		int actual = (a - b);
		
		int expected = 1183;
		
		Assert.assertEquals(actual, expected);
	}
	
	
	@Test
	public void Test_Substract_TwoNegativeNumbers(){
		int a = -120;
		int b = -95;
		
		int actual = (a - b);
		
		int expected = -25;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Test_Substract_NegativePositiveNumbers(){
		int a = -120;
		int b = 123;
		
		int actual = (a - b);
		
		int expected = -243;
		
		Assert.assertEquals(actual, expected);
	}
	
	
}













