package com.fdmgroup.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbigailCalculatorTest {

	@Test
	public void testThat_0_returns_0() {
		// ARRANGE  
		String input = "0";
		double expected = 0.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testThat_1_returns_1() {
		// ARRANGE  
		String input = "1";
		double expected = 1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Plus1_returns_1() {
		// ARRANGE  
		String input = "+1";
		double expected = 1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1Plus1_returns_2() {
		// ARRANGE 
		String input = "1+1";
		double expected = 2.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_10Plus1_returns11() {
		// ARRANGE 
		String input = "10+1";
		double expected = 11.0;
		ICalculator calculator = new AbigailCalculator();	
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_10Plus10_returns20() {
		// ARRANGE 
		String input = "+10++10";
		double expected = 20.0;
		ICalculator calculator = new AbigailCalculator();	
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_10Plus1Plus1_returns12() {
		// ARRANGE 
		String input = "100+1+1";
		double expected = 102.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_0Point5Plus0Point5_returns1() {
		// ARRANGE 
		String input = "0.5+0.5";
		double expected = 1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_12Point5Plus17Point5_returns30() {
		// ARRANGE 
		String input = "12.5+17.5";
		double expected = 30.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_10Plus1Plus1Plus10_returns22() {
		// ARRANGE 
		String input = "10+1+1+10";
		double expected = 22.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Nagtive0_returns0() {
		// ARRANGE 
		String input = "-0";
		double expected = 0.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Nagtive1_returnsNagtive1() {
		// ARRANGE 
		String input = "-1";
		double expected = -1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_5Less2_returns3() {
		// ARRANGE 
		String input = "5-2";
		double expected = 3.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_15Less5_returns10() {
		// ARRANGE 
		String input = "15-5";
		double expected = 10.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative3Plus7_returns4() {
		// ARRANGE 
		String input = "-3+7";
		double expected = 4.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative3Less7_returnsNegative10() {
		// ARRANGE 
		String input = "-3-7";
		double expected = -10.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative3PlusNegative7_returnsNegative10() {
		// ARRANGE 
		String input = "-3+-7";
		double expected = -10.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_3PlusNegative7_returnsNegative4() {
		// ARRANGE 
		String input = "3+-7";
		double expected = -4.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_3Less7_returnsNegative4() {
		// ARRANGE 
		String input = "3-+7";
		double expected = -4.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_3LessNegative7_returns10() {
		// ARRANGE 
		String input = "3--7";
		double expected = 10.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_0Point89Less0Point78_returns0Point11() {
		// ARRANGE 
		String input = "0.89-0.78";
		double expected = 0.11;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_15Less5Less5_returns5() {
		// ARRANGE 
		String input = "15-5-5";
		double expected = 5.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_15Less5Less5Plus1_returns6() {
		// ARRANGE 
		String input = "15-5-5+1";
		double expected = 6.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1Less5Plus1Plus1_returnsNegative2() {
		// ARRANGE 
		String input = "1-5+1+1";
		double expected = -2.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_0Times1_returns0() {
		// ARRANGE 
		String input = "0*1";
		double expected = 0.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1Times1_returns1() {
		// ARRANGE 
		String input = "1*1";
		double expected = 1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_10Times16_returns160() {
		// ARRANGE 
		String input = "10*16";
		double expected = 160.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative10Times6_returnsNeative60() {
		// ARRANGE 
		String input = "-10*6";
		double expected = -60.0;
		ICalculator calculator = new AbigailCalculator();	
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1TimesNegative6_returnsNeative6() {
		// ARRANGE 
		String input = "1*-6";
		double expected = -6.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1Times6_returns6() {
		// ARRANGE 
		String input = "1*+6";
		double expected = 6.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative1TimesNegative6_returns6() {
		// ARRANGE 
		String input = "-1*-6";
		double expected = 6.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative1Times6_returnsNegative6() {
		// ARRANGE 
		String input = "-1*6";
		double expected = -6.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_0Point6Times0Point8_returns0Point48() {
		// ARRANGE 
		String input = "0.6*0.8";
		double expected = 0.48;
		ICalculator calculator = new AbigailCalculator();	
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_2Times12Times1_returns24() {
		// ARRANGE 
		String input = "2*12*1";
		double expected = 24.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1Plus2Times3_returns7() {
		// ARRANGE 
		String input = "1+2*3";
		double expected = 7.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1Plus2TimesNegative3_returnsNegative5() {
		// ARRANGE 
		String input = "1+2*-3";
		double expected = -5.0;
		ICalculator calculator = new AbigailCalculator();	
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1Less2TimesNegative3_returns7() {
		// ARRANGE 
		String input = "1-2*-3";
		double expected = 7.0;
		ICalculator calculator = new AbigailCalculator();	
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_2Times3Less3Times2_returns0() {
		// ARRANGE 
		String input = "2*3-3*2";
		double expected = 0.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_2TimesNegative3Less3Times2_returnsNegative12() {
		// ARRANGE 
		String input = "2*-3-3*2";
		double expected = -12.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_20Times30Less30Times20Plus4Times5_returns20() {
		// ARRANGE 
		String input = "20*30-30*20+4*5";
		double expected = 20.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_20TimesNegative30Less30Times20Plus4TimesNegative5_returnsNegative1180() {
		// ARRANGE 
		String input = "20*-30-30*20+-4*-5";
		double expected = -1180.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1Dividing1_returns1() {
		// ARRANGE 
		String input = "1/1";
		double expected = 1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1Dividing0_returnserror() {
		// ARRANGE 
		String input = "1/0";
		ICalculator calculator = new AbigailCalculator();		
		try {
		calculator.evaluate(input);
		} catch (ArithmeticException e) {
		assertEquals("Cannot divide by zero", e.getMessage());
		}
	}
	
	@Test
	public void testThat_0Dividing0_returnserror() {
		// ARRANGE 
		String input = "0/0";
		ICalculator calculator = new AbigailCalculator();		
		try {
		calculator.evaluate(input);
		} catch (ArithmeticException e) {
		assertEquals("Cannot divide by zero", e.getMessage());
		}
	}
	
	@Test
	public void testThat_2Point3Dividing0_returnserror() {
		// ARRANGE 
		String input = "2.3/0";
		ICalculator calculator = new AbigailCalculator();		
		try {
		calculator.evaluate(input);
		} catch (ArithmeticException e) {
		assertEquals("Cannot divide by zero", e.getMessage());
		}
	}
	
	@Test
	public void testThat_10Dividing1_returns10() {
		// ARRANGE 
		String input = "10/1";
		double expected = 10.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_10Dividing7_returns1Point428() {
		// ARRANGE 
		String input = "10/7";
		double expected = 1.428;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative9Dividing3_returnsNegative3() {
		// ARRANGE 
		String input = "-9/3";
		double expected = -3;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_9DividingNegative3_returnsNegative3() {
		// ARRANGE 
		String input = "9/-3";
		double expected = -3;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_9Dividing3_returns3() {
		// ARRANGE 
		String input = "9/+3";
		double expected = 3;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative9DividingNegative3_returns3() {
		// ARRANGE 
		String input = "-9/-3";
		double expected = 3;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_0Point9Dividing0Point3_returns3() {
		// ARRANGE 
		String input = "0.9/0.3";
		double expected = 3;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_128Dividing4Dividing8_returns4() {
		// ARRANGE 
		String input = "128/4/8";
		double expected = 4;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_12Dividing4Plus6_returns9() {
		// ARRANGE 
		String input = "12/4+6";
		double expected = 9.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_12Dividing4Minus20Dividing5_returnsNegative1() {
		// ARRANGE 
		String input = "12/4-20/5";
		double expected = -1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_12DividingNegative4Less6Plus20Times5_returns91() {
		// ARRANGE 
		String input = "12/-4-6+20*5";
		double expected = 91.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_6Plus12DividingNegative4Less20Times5_returnsNegative97() {
		// ARRANGE 
		String input = "6+12/-4-20*5";
		double expected = -97.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_2Times3Less12DividingNegative4_returns9() {
		// ARRANGE 
		String input = "2*3-12/-4";
		double expected = 9.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1PlusBrackets0BracketsPlus2Times3_returns7() {
		// ARRANGE 
		String input = "1+(0)+2*3";
		double expected = 7.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Bracket1Plus2BracketTimes3_returns9() {
		// ARRANGE 
		String input = "(1+2)*3";
		double expected = 9.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Bracket10Plus2BracketTimes100_returns1200() {
		// ARRANGE 
		String input = "(10+2)*100";
		double expected = 1200.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_4TimesBrackets1Plus2Times3BracketTimes2Plus1Bracket_returns60() {
		// ARRANGE 
		String input = "4*((1+2*3)*2+1)";
		double expected = 60.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Bracket1Point2Plus2Point9BracketDividing0Point1_returns41() {
		// ARRANGE 
		String input = "(1.2+2.9)/0.1";
		double expected = 41.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative4PlusBracketNegative2Bracket_returnsNegative6() {
		// ARRANGE 
		String input = "-4+(-2)";
		double expected = -6.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative3LessBracketNegative2Bracket_returnsNegative1() {
		// ARRANGE 
		String input = "-3-(-2)";
		double expected = -1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative2TimesBracketNegative3Bracket_returns6() {
		// ARRANGE 
		String input = "-2*(-3)";
		double expected = 6.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_8DividingBracketNegative2Bracket_returnsNegative4() {
		// ARRANGE 
		String input = "8/(-2)";
		double expected = -4.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_2Plus5TimesBracket10Dividing2BracketLess4_returns23() {
		// ARRANGE 
		String input = "2+5*(10/2)-4";
		double expected = 23.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_9PowersOf0_returns1() {
		// ARRANGE  
		String input = "9^0";
		double expected = 1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_0PowersOf5_returns_0() {
		// ARRANGE  
		String input = "0^5";
		double expected = 0.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_2PowersOf3_returns8() {
		// ARRANGE  
		String input = "2^3";
		double expected = 8.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1PowersOf10_returns1() {
		// ARRANGE  
		String input = "1^10";
		double expected = 1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_3PowersOfNegative2_returns0Point111() {
		// ARRANGE  
		String input = "3^-2";
		double expected = 0.111;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_0PowersOfNegative3_returnsInfinity() {
		// ARRANGE  
		String input = "0^-3";
		double expected = Double.POSITIVE_INFINITY;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative1PowersOf6_returns1() {
		// ARRANGE  
		String input = "-1^6";
		double expected = 1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative1PowersOf7_returnsNegative1() {
		// ARRANGE  
		String input = "-1^7";
		double expected = -1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Negative2PowersOfNegative3_returnsNegative0Point125() {
		// ARRANGE  
		String input = "-2^-3";
		double expected = -0.125;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_0Point1PowersOf2_returns0Point01() {
		// ARRANGE  
		String input = "0.1^2";
		double expected = 0.01;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1Plus1PowersOf10_returns2() {
		// ARRANGE  
		String input = "1+1^10";
		double expected = 2.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1PowersOf10Plus3_returns4() {
		// ARRANGE  
		String input = "1^10+3";
		double expected = 4.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_7Times2PowersOf3_returns56() {
		// ARRANGE  
		String input = "7*2^3";
		double expected = 56.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_2PowersOf3Times7_returns56() {
		// ARRANGE  
		String input = "2^3*7";
		double expected = 56.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1DividingNegative2PowersOfNegative3_returnsNegative8() {
		// ARRANGE  
		String input = "1/-2^-3";
		double expected = -8.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_2PowersOf3Dividing4_returns2() {
		// ARRANGE  
		String input = "2^3/4";
		double expected = 2.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Bracket1Plus2BracketTimes3Plus1PowerOf10_returns10() {
		// ARRANGE 
		String input = "(1+2)*3+1^10";
		double expected = 10.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_1PowerOf10Plus3DividingBracket2Plus1Bracket_returns2() {
		// ARRANGE 
		String input = "1^10+3/(2+1)";
		double expected = 2.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);		
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Bracket1Plus2BracketPowersOf2_returns9() {
		// ARRANGE  
		String input = "(1+2)^2";
		double expected = 9.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_9PowersOfBracket1Less1Bracket_returns1() {
		// ARRANGE  
		String input = "9^(1-1)";
		double expected = 1.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_Bracket1Plus2PowersOf3BracketTimes4Dividing3_returns12() {
		// ARRANGE  
		String input = "((1+2^3)*4)/3";
		double expected = 12.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThat_SpaceWontAffectCalculation() {
		// ARRANGE  
		String input = "( ( 1 + 2 ^ 3 ) * 4 ) / 3";
		double expected = 12.0;
		ICalculator calculator = new AbigailCalculator();		
		// ACT
		double actual = calculator.evaluate(input);	
		// ASSERT
		assertEquals(expected, actual, 0.001);
	}
	
}
