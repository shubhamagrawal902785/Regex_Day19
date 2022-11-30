package com.bridgelabz.com;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {

	//Regex validation rules
	
	public static boolean checkValidName(String firstName) {
        String firstNameRegex= "^[A-Z]{1}[A-Za-z]{2,}$";
        Pattern obj= Pattern.compile(firstNameRegex);

	if(firstName==null) {
		return false;
	
	}
	 Matcher obj2 = obj.matcher(firstName);
     return obj2.matches();
}
	
	public static boolean checkValidLastName(String lastName) {
        String firstNameRegex= "^[A-Z]{1}[A-Za-z]{2,}$";
        Pattern obj= Pattern.compile(firstNameRegex);

        if(lastName==null) {
            return false;

        }
        Matcher obj2 = obj.matcher(lastName);
        return obj2.matches();
	}

	 public static void main(String[] args) {

	        System.out.println("----- -----Welcome First Name Validator ---------------------");

	        String firstName ="Shubham";
	        String lastName ="Agrawal";
	        boolean isfirstName = checkValidName(firstName);
	        boolean islastName = checkValidLastName(lastName);
	        if(isfirstName)
	            System.out.println(firstName+" is an Valid firstName");
	        else
	            System.out.println(firstName+" is an Invalid firstName");
	        
	       System.out.println("-------------Welcome Last Name validation------------------");
	 
	       

	        if (isfirstName)
	            System.out.println(lastName + " is a valid last name");
	        else
	            System.out.println(lastName + " is a valid last name");
	 
	 }
	 
	 
	 
}


	
