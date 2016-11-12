package com.pluralsight.estructuraDatos;

public class DoubleLinkedList {

	private Node current;	

	public void addNext(Node node)
	{
		
		
		if (current!=null)
		{
			current.setNext(node);
			node.setPre(current);
			current=node;

		}
		else
		{
			node.setPre(current);
			current=node;
		}
	}
	public void addPrevious(Node node)
	{
		
		

	}



	public Node getFirstElement()
	{
		Node  n = null ;
		while(current!=null)
		{
			n=current;
			current=current.getPrevoius();
		}
		
		return n;
	}
	
	

}
