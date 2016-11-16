package com.pluralsight.estructuraDatos;

public class HashTable<T,X> {

	Object [] hash;
	
	
	public HashTable()
	{
		hash =  new Object[20];
		
	}
	public int Hash( T key)
	{
		
		return  ((Object)key).hashCode()/10;
	}
	
	
	public void Add(T key, T entity)
	{
		int  keyPosition =Hash(key);
		
		
		
	}
	
	

}
