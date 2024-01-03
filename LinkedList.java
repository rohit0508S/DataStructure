package com.LinkedList.singly;

public class LinkedList {
	Node head;
	Node tail;
	class Node{
		Object data;
		Node next;
		Node (Object data){
			this.data=data;
		}
	}
	public void add(Object data) {
		Node n=new Node(data);
		if(head==null)
		{
			head=tail=n;
		}
		tail.next=n;
		tail=n;
	}
	public void addFirst(Object data) {
		Node n=new Node(data);
		if(head==null) {
			head=tail=n;
			return;
		}
		n.next=head;
		head=n;

	}
	public void addLast(Object data) {

		Node n=new Node(data);
		if(head==null) {
			head=tail=n;
			return;
		}
		tail.next=n;
		tail=n;
	}

	public void addSpecific(Object data,int in) {
		if(in==0) {
			addFirst(data);
			return;
		}
		Node temp=head;
		while(temp.next!=null&&in>1) {
			temp=temp.next;
			in--;
		}
		if(temp!=null) {
			Node n=new Node(data);
			n.next=temp.next;
			temp=n;
			if(n.next==null) {
				tail=n;
			}
			else {
				System.out.println("Index out of range!");
			}
		}
	}

}
