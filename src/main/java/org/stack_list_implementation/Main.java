package org.stack_list_implementation;

public class Main {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		System.out.println("La coda e vuta? = "+stack.isEmpty());
		stack.Push(5);
		stack.Push(10);
		stack.Push(13);
		stack.Push(4);
		stack.Push(9);
		
		System.out.println();
		
		System.out.println("Pop = "+stack.Pop()); 
		stack.Push(1);
		stack.Push(3);
		stack.Push(11);
		System.out.println();
		
		System.out.println("Pop = "+stack.Pop());
		System.out.println("Pop = "+stack.Pop());
		System.out.println("Pop = "+stack.Pop());
		
		System.out.println();
		
		stack.Push(36);
		System.out.println("Pop = "+stack.Pop());
		
		System.out.println("Top = "+stack.Top());
		System.out.println("Top = "+stack.Top());
		
		
		//String
		Stack<String> stack1 = new Stack<>();
		System.out.println("La coda e vuta? = "+stack1.isEmpty());
		stack1.Push("Daniele");
		stack1.Push("Pippo");
		stack1.Push("Baudo");
		stack1.Push("Tastiera");
		stack1.Push("Mouse");
		
		System.out.println();
		
		System.out.println("Pop = "+stack1.Pop()); 
		stack1.Push("Corvo");
		stack1.Push("Gatto");
		stack1.Push("Merlo");
		System.out.println();
		
		System.out.println("Pop = "+stack1.Pop());
		System.out.println("Pop = "+stack1.Pop());
		System.out.println("Pop = "+stack1.Pop());
		
		System.out.println();
		
		stack1.Push("BHo");
		System.out.println("Pop = "+stack1.Pop());
		
		System.out.println("Top = "+stack1.Top());
		System.out.println("Top = "+stack1.Top());
		
		
	}

}
