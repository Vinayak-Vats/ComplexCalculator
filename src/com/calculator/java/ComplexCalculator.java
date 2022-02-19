/**
 * 
 */
package com.calculator.java;
import java.util.Scanner; 

/**
 * @author Vinayak
 *This is a calculator created for you to make your day to day calculations easy
 *For more efficiency, productivity and reliability
 *Executes addition, multiplication, subtraction and division mathematical operations
 *Takes user input in console
 *Returns result to the console
 */
public class ComplexCalculator {
	public static void main(String[]args) {
		System.out.println("Pure mathematics is, in its way, the poetry of logical ideas —Albert Einstein");
		
		String s0 = inputTaker("Enter value 1: ");
		String s1 = inputTaker("Enter value 2: ");
		String s2 = inputTaker("Choose Operater from +,-,*,/ : ");
		
		
		double finalResult0 = addValues(s0,s1);
		double finalResult1 = subValues(s0,s1);
		double finalResult2 = mulValues(s0,s1);
		double finalResult3 = divValues(s0,s1);
		
		try {
			//using switch methodology to choose between different operators and to show output accordingly 
			switch(s2) {
				case "+":
					System.out.println(s0+"+"+s1+"="+ finalResult0);
					break;
				case "-":
					System.out.println(s0+"-"+s1+"="+ finalResult1);
					break;
				case "*":
					System.out.println(s0+"*"+s1+"="+ finalResult2);
					break;
				case "/":
					System.out.println(s0+"/"+s1+"="+ finalResult3);
					break;
				default:
					System.out.println("You did not choose the valid operator");
			}
		} catch (Exception e) {
			System.out.println("Don't worry, technical glitch will be soon resolved");
		}
		
		System.out.println("Thank You For Using My Calculator");	
	}
	
	//Creating a method for Scanner class for allowing user to give input in console 
	static String inputTaker(String prompt) {
		System.out.print(prompt);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	//Converting the string(given by user as input) into Double in case of addition
	static double addValues(String s0, String s1) {
		double d0 = Double.parseDouble(s0);
		double d1 = Double.parseDouble(s1);
		double result0= d0+d1;
		return result0;
		
	}
	
	//Converting the string(given by user as input) into Double in case of subtraction
	static double subValues(String s0, String s1) {
		double d0 = Double.parseDouble(s0);
		double d1 = Double.parseDouble(s1);
		double result1= d0-d1;
		return result1;
		
	}
	
	//Converting the string(given by user as input) into Double in case of multiplication
	static double mulValues(String s0, String s1) {
		double d0 = Double.parseDouble(s0);
		double d1 = Double.parseDouble(s1);
		double result2= d0*d1;
		return result2;
	}
		
	//Converting the string(given by user as input) into Double in case of division
	static double divValues(String s0, String s1) {
		double d0 = Double.parseDouble(s0);
		double d1 = Double.parseDouble(s1);
		double result2= d0/d1;
		return result2;
		
	}
		
}
