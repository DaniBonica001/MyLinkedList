package model;

public class Objets implements Comparable<Objets> {
	
	public String name;
	public int age;
	
	
	
	public Objets (String name, int age) {
		this.name = name;
		this.age = age;
	}



	@Override
	public int compareTo(Objets o) {		
		return this.name.compareTo(o.name);
	}

}
