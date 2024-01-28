package com.helloworld;

public class LoopStatements {
	
	public void WhileLoop() {
		int i=0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
	}
	
	
	
	public void DoWhileLoop() {
		int i=0;
		do {
			System.out.println();
			i++;
		}
		while(i<5);
	}
	
	public void Forloop() {
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
	}
	
	public void Nestedloop() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		for(int j=0;j<5;j++) {
			System.out.println(j);
		}
	}

	public static void main(String[] args) {
		LoopStatements obj = new LoopStatements();
		obj.WhileLoop();
		obj.DoWhileLoop();
		obj.Forloop();
		obj.Nestedloop();

	}

}
