package ui;

import model.MyLinkedList;
import model.Objets;


public class Main {

	public static void main(String[] args) {
		
		MyLinkedList<Objets> list = new MyLinkedList<Objets>();
		list.createNode(new Objets("Andrea",15));
		System.out.println("SI1");
		list.createNode(new Objets("Camila",11));
		System.out.println("SI2");
		list.createNode(new Objets("Bonilla",9));
		System.out.println("SI3");
		list.createNode(new Objets("Daniela",1));		
		System.out.println("SI4");
		
		
		
		
		
		

	}

}
