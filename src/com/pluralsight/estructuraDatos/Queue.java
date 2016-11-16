package com.pluralsight.estructuraDatos;

public class Queue {
	private Node current;

	public void Push(Node node )
	{
		if(current==null)
		{
			current=node;

		}
		else
		{
			current.setPre(node);
		}

	}
	
	public Node Peek()
	{
	
		return current;
	
	}
	
	
	public Node Pop()
	{
		Node node = current;
		current=current.previous;
		return node;
	}






}
