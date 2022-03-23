package Generic;

public class Person implements Comparable<Person>{
	
	private String firstName;
	private String SurName;
	
	public Person(String firstName, String surName) {
		super();
		this.firstName = firstName;
		SurName = surName;
	}

	@Override
	public int compareTo(Person person) {
		// TODO Auto-generated method stub
		int result = firstName.compareTo(person.firstName);
		return result == 0 ? SurName.compareTo(person.SurName) : result;
	}

	@Override
	public String toString() {
		return firstName + "-" + SurName ;
	}
	
	
}
