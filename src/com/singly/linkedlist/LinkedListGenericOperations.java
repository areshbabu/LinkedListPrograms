package com.singly.linkedlist;

public class LinkedListGenericOperations {
	//private Node headNode = null;
	public Node insertNodeAtEnd(Node newNode, Node headNode) {
		if(headNode == null) {
			headNode = newNode;
			return newNode;
		}
		Node tempNode = headNode;
		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(newNode);
		//headNode =  tempNode;
		return headNode;
	}
	
	public void displayList(Node dpNode) {
		if(dpNode == null) {
			System.out.println("Empty...!!");
			return;
		}
			
		while (dpNode != null) {
			System.out.println(dpNode.getData() + "->");
			dpNode = dpNode.getNext();
		}
	}
}
