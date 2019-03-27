package com.singly.linkedlist;
/**
 * 
 * @author aresh
 * 
 * Given two linked list L1=1,5,9,11 L2=2,4,6,6,10
 * Merge Above two lists in sorted order as shown below
 * L3=1,2,4,5,6,6,9,10,11
 *
 */
public class MergeTwoNodeAndSort{
	Node headNode;
	LinkedListGenericOperations gen = new LinkedListGenericOperations();
	public Node mergeNodes(Node l1, Node l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		Node l3 = null;
		while (l1 != null || l2 != null) {
			if(l1 == null && l2 != null)
			{
				l3 = gen.insertNodeAtEnd(new Node(l2.getData()), l3);
				l2 = l2.getNext();
			}else if(l1 != null && l2 == null)
			{
				l3 = gen.insertNodeAtEnd(new Node(l1.getData()), l3);
				l1 = l1.getNext();
			}else if(l1.getData() < l2.getData()) {
				l3 = gen.insertNodeAtEnd(new Node(l1.getData()), l3);
				l1 = l1.getNext();
			} else if(l1.getData() > l2.getData()) {
				l3 = gen.insertNodeAtEnd(new Node(l2.getData()), l3);
				l2 = l2.getNext();
			}else {
			l3 = gen.insertNodeAtEnd(new Node(l2.getData()), l3);
			l2 = l2.getNext();
			l1 = l1.getNext();
			}
		}
		return l3;
	}

	public static void main(String[] args) {
		
		LinkedListGenericOperations genOps = new LinkedListGenericOperations();
		MergeTwoNodeAndSort mergeNode = new MergeTwoNodeAndSort();
		//create L1 Node
		Node l1 = null;
		l1 = genOps.insertNodeAtEnd(new Node(1), l1);
		l1 = genOps.insertNodeAtEnd(new Node(5), l1);
		l1 = genOps.insertNodeAtEnd(new Node(9), l1);
		l1 = genOps.insertNodeAtEnd(new Node(11), l1);
		System.out.println("Dispaly L1:");
		genOps.displayList(l1);
		Node l2 = null;
		l2 = genOps.insertNodeAtEnd(new Node(2), l2);
		l2 = genOps.insertNodeAtEnd(new Node(4), l2);
		l2 = genOps.insertNodeAtEnd(new Node(6), l2);
		l2 = genOps.insertNodeAtEnd(new Node(6), l2);
		l2 = genOps.insertNodeAtEnd(new Node(10), l2);
		System.out.println("Dispaly L2:");
		genOps.displayList(l2);
		Node l3 = null;
		l3 = mergeNode.mergeNodes(l1, l2);
		System.out.println("Dispaly L3:");
		genOps.displayList(l3);
	}
}
