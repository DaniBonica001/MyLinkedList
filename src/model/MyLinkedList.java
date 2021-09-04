package model;

public class MyLinkedList<T extends Comparable<T>> {
	
	private Node<T> first;

	//Constructor
	public MyLinkedList() {
		
	}
	
	//Methods createNode
	public void createNode(T element) {
		Node<T> newNode = new Node<T>(element);
		
		if (first == null) {			
			first = newNode;
			
		}else {
			insertNode(newNode,first,first.getNext());			
		}						
	}
	
	//Method to add node in order
	public void insertNode(Node<T> newNode, Node<T>nodePrev, Node<T>nodeNext) {

		if (newNode.getElement().compareTo(nodePrev.getElement())>0 && nodePrev.getNext() == null) {
			nodePrev.setNext(newNode);
		}else if (newNode.getElement().compareTo(nodePrev.getElement())>0 && newNode.getElement().compareTo(nodeNext.getElement())<0){
			nodePrev.setNext(newNode);
			nodeNext.setPrevious(newNode);
			newNode.setNext(nodeNext);
			newNode.setPrevious(nodePrev);
			
		}else {
			insertNode(newNode,nodeNext,nodeNext.getNext());
		}
	}
}
