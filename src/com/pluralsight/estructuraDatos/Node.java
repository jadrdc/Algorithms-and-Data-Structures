package com.pluralsight.estructuraDatos;


public class Node implements Cloneable{

	String value;
	 Node next;
	 Node previous;

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrevoius() {
		return previous;
	}
	public void setPre(Node previous) {
		this.previous = previous;
	}
	public Object clone(){  
	    try{  
	        return super.clone();  
	    }catch(Exception e){ 
	        return null; 
	    }
	}

}
