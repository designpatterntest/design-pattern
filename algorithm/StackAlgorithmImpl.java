package com.stack.algorithm;

public class StackAlgorithmImpl {

	public static final int capacity = 3;
	int arr[] = new int[capacity];
	int top = -1;

	public void push(int pushElement) {
		if (top < capacity - 1) {
			top++;
			arr[top] = pushElement;
		} else {
			System.out.println("stack over flow");
		}
		printElements();
	}

	public void printElements() {
		if (top >= 0) {
			System.out.println("Elements in stack :");
			for (int i = 0; i <= top; i++) {
				System.out.println(arr[i]);
			}
		}
	}

	public void pop() {
		if (top >= 0) {
			top--;
			System.out.println("Pop operation done !");
		} else {
			System.out.println("Stack Underflow !");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackAlgorithmImpl stack = new StackAlgorithmImpl();
		stack.push(12);
		stack.push(14);
		stack.push(3);
		stack.push(5);
		stack.pop();
		stack.printElements();
		
	}

}
