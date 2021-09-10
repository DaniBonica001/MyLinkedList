package model;

@SuppressWarnings("hiding")
public class MyLinkedList<Objets extends Comparable<Objets>> {
	
	private Node<Objets> first;

	//Constructor
	public MyLinkedList() {
		
	}
	
	//Methods createNode
	public void createNode(Objets element) {
		Node<Objets> newNode = new Node<Objets>(element);
		
		if (first == null) {			
			first = newNode;
			
		}else {
			insertNode(newNode,first,first.getNext());			
		}						
	}
	
	//Method to add node in order
	public void insertNode(Node<Objets> newNode, Node<Objets>nodePrev, Node<Objets>nodeNext) {
			
		if (nodeNext == null) {
			if (nodePrev == first && newNode.getElement().compareTo(nodePrev.getElement())>0) {
				nodePrev.setNext(newNode);
			
			}else if (nodePrev == first && newNode.getElement().compareTo(nodePrev.getElement())<0 ) {
				nodePrev.setPrevious(newNode);
				first = newNode;
				first.setNext(nodePrev);			
			
			}else if (newNode.getElement().compareTo(nodePrev.getElement())==0 ) {
				nodePrev.setNext(newNode);
				newNode.setPrevious(nodePrev);
			
			}else if (newNode.getElement().compareTo(nodePrev.getElement())>0) {
				nodePrev.setNext(newNode);
				newNode.setPrevious(nodePrev);
				
			}			
			
		}else if (newNode.getElement().compareTo(nodePrev.getElement())>0 && newNode.getElement().compareTo(nodeNext.getElement())<0){
			nodePrev.setNext(newNode);
			nodeNext.setPrevious(newNode);
			newNode.setNext(nodeNext);
			newNode.setPrevious(nodePrev);
			
		}else {
			  insertNode(newNode,nodeNext,nodeNext.getNext());
		}		
	}
	
	//Method to know if the Linked List has elements or not
	public boolean isEmpty() {
		if(first==null) {
			return true;
		}else {
			return false;
		}
	}
	
	//Method to know if there is an existing node
	public boolean existingNode(Node<Objets> searchedNode, Node<Objets> actualNode) {	
		if(actualNode!=null) {
			if(actualNode==searchedNode) {
				return true;
			}else {
				if(actualNode.getNext()!=null) {
					return existingNode(searchedNode, actualNode.getNext());
				}else {
					return false;
				}
			}
		}else {
			return false;
		}		
	}
	
	//Method that delete an existing node
	public void deleteNode(Node<Objets> node) {
		if(existingNode(node, first)==true) {
			if(node.getPrevious()!=null) {//Si node tiene anterior
				if(node.getNext()!=null) {//Si node tiene anterior y siguiente
					node.getPrevious().setNext(node.getNext());
					node.getNext().setPrevious(node.getPrevious());
					node.setNext(null);
					node.setPrevious(null);
				}else {//Si node solo tiene anterior
					node.getPrevious().setNext(null);
				}
			}else {//No tiene previous es porque es el first
				if(node.getNext()!=null) {//Si node(el primero) tiene siguiente entonces que al siguiente le quite la relacion con node
					node.getNext().setPrevious(null);
					first=node.getNext();
					node.setNext(null);
				}else {//Si la lista ordenada solo tiene un elemento
					first=null;
				}			
			}
		}	
	}
	
	public Node<Objets> getNode(Node<Objets>searchedNode){
		if(first!=null) {
			return lookForNode(searchedNode, first);
		}else {
			return null;
		}	
	}
	
	private Node<Objets> lookForNode(Node<Objets>searchedNode, Node<Objets>actualNode){
		if(searchedNode==actualNode) {
			return actualNode;
		}
		else {
			if(actualNode.getNext()!=null) {
				return lookForNode(searchedNode, actualNode.getNext());
			}else {
				return null;
			}
		}
	}
	
	
	
	
	
}
