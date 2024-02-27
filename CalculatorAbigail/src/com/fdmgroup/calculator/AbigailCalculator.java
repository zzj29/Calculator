package com.fdmgroup.calculator;

public class AbigailCalculator implements ICalculator {
	
	@Override
	public double evaluate(String expression) {
		if (expression.contains(" ")) {
			expression = expression.replaceAll(" ", "");
		}
		if (!expression.contains("(") && !expression.contains("^")) {
			return operation(expression);
		} 
		else if (!expression.contains("(") && expression.contains("^")) {
			return handleExponent(expression);
		} 
		else {
			int startIndex = expression.lastIndexOf("(");
			int endIndex = expression.indexOf(")", startIndex);
			String innerExpression = expression.substring(startIndex+1, endIndex);
			if (!innerExpression.contains("^")) {
				double innerResult = operation(innerExpression);
				String updatedExpression = expression.substring(0, startIndex) + innerResult + expression.substring(endIndex+1);
				return evaluate(updatedExpression);
			} else {
				double innerResult = handleExponent(innerExpression);
				String updatedExpression = expression.substring(0, startIndex) + innerResult + expression.substring(endIndex+1);
				return evaluate(updatedExpression);
			}
		}
	}
	
	public double handleExponent(String expression) {
		int index = expression.indexOf("^");
		if (expression.contains("+") || expression.contains("-") || expression.contains("*") || expression.contains("/")) {
			int plusIndexBefore = expression.lastIndexOf("+", index-1);
			int plusIndexAfter = expression.indexOf("+", index+1);
//			int minusIndexBefore = expression.lastIndexOf("-", index-1);
//			int minusIndexAfter = expression.indexOf("-", index+1);
			int timesIndexBefore = expression.lastIndexOf("*", index-1);
			int timesIndexAfter = expression.indexOf("*", index+1);
			int dividIndexBefore = expression.lastIndexOf("/", index-1);
			int dividIndexAfter = expression.indexOf("/", index+1);
			
			int beforeIndex = findMax(-1, plusIndexBefore, timesIndexBefore, dividIndexBefore);
			int afterIndex = findMin(expression.length(), plusIndexAfter, timesIndexAfter, dividIndexAfter);
			
			String leftNumber = expression.substring(beforeIndex+1, index);
	    	String rightNumber = expression.substring(index + 1, afterIndex);
	    	double base = Double.parseDouble(leftNumber);
	    	int exponent = (int)Double.parseDouble(rightNumber);
	    	double result = power(base, exponent);
	    	
	    	String updatedExpression = expression.substring(0, beforeIndex+1) + result + expression.substring(afterIndex);
	    	
	    	return evaluate(updatedExpression);
		} else {
    	String leftNumber = expression.substring(0, index);
    	String rightNumber = expression.substring(index + 1);
    	double base = Double.parseDouble(leftNumber);
    	int exponent = (int)Double.parseDouble(rightNumber);
    	return power(base, exponent);
		}
	}
	
	public double operation(String expression) {
		if (expression.contains("+")) {
			if (expression.startsWith("+")) {
				expression = expression.substring(1, expression.length());
				return operation(expression);
			} else if (expression.contains("++")) {
				expression = expression.replaceAll("\\+\\+", "+");
				return operation(expression);
			} else if (expression.contains("-+")) {
				expression = expression.replaceAll("\\-\\+", "-");
				return operation(expression);
			} else if (expression.contains("*+")) {
				expression = expression.replaceAll("\\*\\+", "*");
				return operation(expression);
			} else if (expression.contains("/+")) {
				expression = expression.replaceAll("\\/\\+", "/");
				return operation(expression);
			} else {
				int plusIndex = expression.indexOf("+");
				String leftNumber = expression.substring(0, plusIndex);
				String rightNumber = expression.substring(plusIndex + 1, expression.length());
				return operation(leftNumber) + operation(rightNumber);
			}
		} else if (expression.contains("-")) {
			if (expression.startsWith("-")) {
				return operation("0" + expression);
			} else if (expression.contains("--")) {
				expression = expression.replaceAll("\\-\\-", "+");
				return operation(expression);
			} else if (expression.contains("*-")) {
				String leftNumber;
				String rightNumber;
				int index = expression.indexOf("*-");
				int minusIndexAfter = expression.indexOf("-", index + 2);
				int minusIndexBefore = expression.lastIndexOf("-", index - 1);

				if (minusIndexBefore == -1 && minusIndexAfter == -1) {
					leftNumber = expression.substring(0, index);
					rightNumber = expression.substring(index + 1, expression.length());
					return operation(leftNumber) * operation(rightNumber);
				} else if (minusIndexBefore != -1 && minusIndexAfter == -1) {
					leftNumber = expression.substring(0, minusIndexBefore);
					rightNumber = expression.substring(minusIndexBefore + 1);
					return operation(leftNumber) - operation(rightNumber);
				} else if (minusIndexBefore == -1 && minusIndexAfter != -1) {
					leftNumber = expression.substring(0, minusIndexAfter);
					rightNumber = expression.substring(minusIndexAfter + 1);
					return operation(leftNumber) - operation(rightNumber);
				}
			} else if (expression.contains("/-")) {
				String leftNumber;
				String rightNumber;
				int index = expression.indexOf("/-");
				int minusIndexAfter = expression.indexOf("-", index + 2);
				int minusIndexBefore = expression.lastIndexOf("-", index - 1);

				if (minusIndexBefore == -1 && minusIndexAfter == -1) {
					leftNumber = expression.substring(0, index);
					rightNumber = expression.substring(index + 1, expression.length());
					return operation(leftNumber) / operation(rightNumber);
				} else if (minusIndexBefore != -1 && minusIndexAfter == -1) {
					leftNumber = expression.substring(0, minusIndexBefore);
					rightNumber = expression.substring(minusIndexBefore + 1);
					return operation(leftNumber) - operation(rightNumber);
				} else if (minusIndexBefore == -1 && minusIndexAfter != -1) {
					leftNumber = expression.substring(0, minusIndexAfter);
					rightNumber = expression.substring(minusIndexAfter + 1);
					return operation(leftNumber) - operation(rightNumber);
				}
			} else {
				int minusIndex = expression.lastIndexOf("-");
				String leftNumber = expression.substring(0, minusIndex);
				String rightNumber = expression.substring(minusIndex + 1);
				return operation(leftNumber) - operation(rightNumber);
			}
		} else if (expression.contains("*")) {
			int timesIndex = expression.indexOf("*");
			String leftNumber = expression.substring(0, timesIndex);
			String rightNumber = expression.substring(timesIndex + 1, expression.length());
			return operation(leftNumber) * operation(rightNumber);
		} else if (expression.contains("/")) {
			int dividIndex = expression.lastIndexOf("/");
			String leftNumber = expression.substring(0, dividIndex);
			String rightNumber = expression.substring(dividIndex + 1, expression.length());
			if (Double.parseDouble(rightNumber) == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			return operation(leftNumber) / operation(rightNumber);
		}
		return Double.parseDouble(expression);
	}
	
	public double power(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else if (exponent < 0 ) {
			return 1 / power(base, -exponent);
		} else {
			double temp = power(base, exponent/2);
			if (exponent % 2 == 0) {
				return temp * temp;
			} else {
				return base * temp * temp;
			}
		}
	}
	
	public int findMax(int a, int b, int c, int d) {
		int max = a;
		if (b > max) { max = b; }
		if (c > max) { max = c; }
		if (d > max) { max = d; }
//		if (e > max) { max = e; }
		return max;
	}
	
	public int findMin(int a, int b, int c, int d) {
		int min = a;
		if (b < min && b != -1) { min = b; }
		if (c < min && c != -1) { min = c; }
		if (d < min && d != -1) { min = d; }
//		if (e < min && e != -1) { min = e; }
		return min;
	}
	
}
