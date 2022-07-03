package Calculations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Multiplication {

	@Test
	public void Test_Multiply_TwoPositiveNumbers(){
		int a = 120;
		int b = 3;
		
		int actual = (a * b);
		
		int expected = 360;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Test_Multiply_TwoNegativeNumbers(){
		int a = -5;
		int b = -10;
		
		int actual = (a * b);
		
		int expected = 50;
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void Test_Multiply_NegativePositiveNumbers(){
		int a = -5;
		int b = 10;
		
		int actual = (a * b);
		
		int expected = -50;
		
		Assert.assertEquals(actual, expected);
	}
}
