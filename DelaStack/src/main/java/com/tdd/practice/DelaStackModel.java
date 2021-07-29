package com.tdd.practice;

public class DelaStackModel {
	
	Integer stack[];
	Integer top; 


	DelaStackModel(Integer size){
		stack = new Integer[10];
		top = -1;
	}
	
	public void display() {
		for (int i=0; i < stack.length; i++)
			System.out.print(stack[i] + "");
				System.out.println();
	}
	public void push(Integer number) {
		top++;
		stack[top] = number;
		
	}
	public void pop();
		for(int i = 0; i < top;)
}
}