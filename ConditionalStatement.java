package com.helloworld;

public class ConditionalStatement {
	
	public void ifStatement() {
		
		
		int x=20;
		int y=18;
		if(x>y) {
			System.out.println("x is greater than y");
		}
	}
	
	public void ifElseStatement() {
		
		
		int time=20;
		if(time<18) {
			System.out.println("good day");
		}
		else {
			System.out.println("good evening");
		}
	}
	
	public void ElseifStatement() {
		
		
		int time=22;
		if(time<10) {
			System.out.println("good morning");
		}
		else if(time<18) {
			System.out.println("good day");
		}
		else {
			System.out.println("good evening");
		}
	}
	
	public void SwitchStatement() {
		
		
		int day=4;
		switch(day) {
		case 1:
			System.out.println("day is monday");
			break;
		case 2:
			System.out.println("day is tuesday");
			break;
		case 3:
			System.out.println("day is wednesday");
			break;
		case 4:
			System.out.println("day is thursday");
			break;
		case 5:
			System.out.println("day is friday");
			break;
		case 6:
			System.out.println("day is saturday");
			break;
		case 7:
			System.out.println("day is sunday");
			break;
		}
		
		int day1=8;
		switch(day1) {
		case 1:
			System.out.println("today is saturday");
			break;
		case 2:
			System.out.println("today is sunday");
			break;
			default:
			System.out.println("looking forward to the weekend");
		
		}
		
		
		
	}
	
	 public static void main(String[] args) {
		ConditionalStatement obj = new ConditionalStatement();
		obj.ifStatement();
		obj.ifElseStatement();
		obj.ElseifStatement();
		obj.SwitchStatement();
		
	}

}
