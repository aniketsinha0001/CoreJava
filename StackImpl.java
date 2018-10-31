package com.solution;

class Stack{
	int top;
	static final int MAX=10;
	int a[] =new int[MAX];
	
	Stack(){
		top=-1;
	}

	boolean push(int x){
		if(top>=MAX){
			System.out.println("Stack OverFlow Condition:");
			return false;
		}
		else{
			a[++top]=x;
			return true;
		}
		
	}
	
	int pop(){
		if(top<0){
			System.out.println("Stack Underflow Condition:");
			return 0;
		}
		else{
			int x=a[top--];	
			return x;
		}
	
	}
	
}

class StackImpl{

	public static void main(String...a){
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(40);
		s.push(5);
	//	s.push(50);
	//	s.pop();
		System.out.println(s.pop());
		
	}
}