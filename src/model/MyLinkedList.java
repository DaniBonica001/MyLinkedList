package model;

public class MyLinkedList<T> {
	
	private Node<T> first;

	//Constructor
	public MyLinkedList() {
		
	}
	
	//Methos createNode
	public void createNode(T element) {
		Node<T> newNode = new Node<T>(element,null);
		
		if (first.getNext()!=null) {
			insertNode(newNode,first,first.getNext());
		}else {
			insertNode(newNode,first,null);
		}				
	}
	
	//Method to add node in order
	public void insertNode(Node<T> newNode, Node<T>nodePrev, Node<T>nodeNext) {
		if (first == null) {
			first = newNode;
		}else {
			
			if (nodeNext!=null) {
				
				if (newNode.compareTo(nodePrev.getVariableT())>0 && newNode.compareTo(nodeNext.getVariableT())<0) {
					newNode.setNext(nodeNext);
					newNode.setPrevious(nodePrev);
					nodePrev.setNext(newNode);
					nodeNext.setPrevious(newNode);
					
				}else {					 
					insertNode(newNode,nodeNext,nodeNext.getNext());
					 
				}
			}			
		}
	}

}
