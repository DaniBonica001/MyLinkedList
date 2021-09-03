package model;

public class Node<T extends Comparable<T>> {
	
	private T variableT;
	private Object object;
	private Node<T>previous;
	private Node<T>next;
	
	public Node(T element, Object object) {
		setVariableT(element);
		this.setObject(object);
		previous = null;
		next = null;		
	}

	
	//Getters and Setters
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getNext() {
		return next;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	public Node<T> getPrevious() {
		return previous;
	}
	
	public void setVariableT(T variableT) {
		this.variableT = variableT;
	}

	public T getVariableT() {
		return variableT;
	}
	

	public void setObject(Object object) {
		this.object = object;
	}

	public Object getObject() {
		return object;
	}


	public int compareTo(T variableT2) {		
		return this.variableT.compareTo(variableT2);
	}






 












}
