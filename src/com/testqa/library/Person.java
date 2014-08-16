package com.testqa.library;

public class Person {
	String personName;
	String contactNo;
	String address;

	public Person(String personName, String contactNo, String Address) {
		this.personName = personName;
		this.contactNo = contactNo;
		this.address = address;

	}

	public void personDetails() {
		System.out.println("personName");
		System.out.println("contactNo");
		System.out.println("address");

	}

}
