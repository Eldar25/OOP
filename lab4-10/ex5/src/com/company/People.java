package com.company;
import java.util.Vector;

public class People {
	private Vector<Person> people = new Vector<Person>();
	
	public void Add(String name, String address) {
		Person p = new Person(name, address);
		people.add(p);
	}
	public void Add(String name, String address, String program, int year, double fee) {
		Student p = new Student(name, address, program, year, fee);
		people.add(p);
	}
	public void Add(String name, String address, String school, double pay) {
		Staff p = new Staff(name, address, school, pay);
		people.add(p);
	}
	public String toString() {
		String info = "";
		for(int i=0;i<people.size();i++) {
			info = info + people.get(i);
		}
		return info;
	}
}
