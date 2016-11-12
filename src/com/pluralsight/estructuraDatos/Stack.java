package com.pluralsight.estructuraDatos;

public class Stack {
	private Node current;

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
