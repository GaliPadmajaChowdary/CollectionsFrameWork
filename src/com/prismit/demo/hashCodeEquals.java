package com.prismit.demo;

public class hashCodeEquals {

	public static void main(String[] args) {
		/*
		 * Although the two instances have exactly the same attribute values, 
		 * they are stored in different memory locations. Hence, they are 
		 * not considered equal as per the default implementation of equals(). 
		 * The same applies for hash code()
		 */
		hashcodeExample display1 = new hashcodeExample(1, "Padmaja");
        hashcodeExample display2 = new hashcodeExample(1, "Padmaja");
        System.out.println(" hashcode = " + display1.hashCode());
        System.out.println(" hashcode = " + display2.hashCode());
        System.out.println("Checking equality between display1 and display2 = " +display1.equals(display2));
    }
	
}
