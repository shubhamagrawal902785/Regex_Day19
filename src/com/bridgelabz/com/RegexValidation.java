package com.bridgelabz.com;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class RegexValidation {

	//Regex validation rules
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the First name");
	        String str1 = sc.next();
	        

	        boolean b1 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str1).matches();
	       
	        
	        //Checking First name
	        if (b1 == true){
	            System.out.println("The first name is valid");
	        }else
	            System.err.println("The first name is Invalid");
}
}

	
