package com.lti;

public class Calc {
	
	public static int add(int num1,int num2){
		return num1+num2;
	}
	
	public static int subs(int num1,int num2){
		return num1-num2;
	}
	
	public static int prod(int num1,int num2){
		return num1*num2;
	}
	
	public static int div(int num1,int num2){
		return num1/num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));
		System.out.println(subs(20,10));
		System.out.println(prod(20,10));
		System.out.println(div(20,10));

	}

}
