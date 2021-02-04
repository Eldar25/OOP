package com.company;

public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public boolean equals(Object o){
		if(o == this) return true;
		if(o==null || o.getClass()!=this.getClass()) return false;
		Person p = (Person)o;
		return name.equals(p.name);
	}
	public int hashCode(){
		return 17+31*name.hashCode();
	}
	public String toString() {
		return "Name: " + name;
	}
}
