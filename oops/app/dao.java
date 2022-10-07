package com.AQ.App.dao;
import com.AQ.App.dto.Appdto;
import java.util.Scanner;


public class Appdao  implements App1dao , App2dao{
	
	

	Appdto [] details = new Appdto[10];
	  
	  private int i;
	public void register(Appdto facebook) {
		details[i++]=instagram;
		
		}
	
		
	
	public String login (String name , String password) {
		for(i=0;i<details.length;i++) {
		if(details[i]!=null && details[i].getName().equals(name) && details[i].getPassword().equals(password)) {
		      return "login succesufully";
          }
	}
		
       return"login fail";
		
}

	public void login1 () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter contact number");
		sc.nextLong();
		System.out.println("Enter location details");
		sc.next();
	}
	
	
 public String accountdeleteByIndex(int index) {
	    if(details!=null) {
	    	details[0]=null;
	    }
	    return"account deleted";
	   
        	 
      }




