package com.pluralsight.estructuraDatos;

public class Stack {
	private Node current;

	
	public int Count()
	{
		int x=0;
		Node node = (Node)( current.clone());
		
		while(node!=null)
		{
			x++;
			node=node.getPrevoius();
			
		}
		
		
		return x;
	}
	public void Push(Node node) {
		if (current == null) {
			current = node;
		} else {
			node.setPre(current);
			current = node;

		}

	}

	public Node Pop() {

		Node node = current;

		current = current.getPrevoius();

		return node;
	}

	public Node Peek() {

		return current;
	}

}
