package com.pluralsight.estructuraDatos;

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n= new Node();
		n.value="First";
		Node n2= new Node();
		n2.value="Second";
		Node n3= new Node();
		n3.value="Third";
		Stack list = new Stack();
		
		
		list.Push(n);
		list.Push(n2);
		list.Push(n3);
		
		System.out.println(list.Pop().value);
		
		System.out.println(list.Peek().value);
		System.out.println(list.Pop().value);

		System.out.println(list.Peek().value);

	}

}
