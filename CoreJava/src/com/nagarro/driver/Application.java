package com.nagarro.driver;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.nagarro.computepremium.Car;
import com.nagarro.selectcar.*;

public class Application {

	public static void main(String[] args) {
		 String confirm="";
		 
		do{
		Scanner sc =new Scanner(System.in);
		
		
		String carType ="";
	    while(!carType.equalsIgnoreCase("Hathback") && !carType.equalsIgnoreCase("Sedan") && !carType.equalsIgnoreCase("SUV")) {   
	        System.out.print("Enter the name of car for which the premium will be generated: ");
	         carType=sc.nextLine();
	         if (!carType.equalsIgnoreCase("Hathback") && !carType.equalsIgnoreCase("Sedan") && !carType.equalsIgnoreCase("SUV")) { 
					System.out.println("Invalid car type");
				}
	     }
	        
	    
	        int carModel =0;
	        System.out.print("Enter car model: ");
            carModel=sc.nextInt();
	         
	      
	        double cost= 0;
	        while(cost<=0) {
	             try{ 
	            	 System.out.print("Enter the cost of car: ");
	        	     cost=sc.nextDouble();
	        	 
	        	 if (cost <=0) {
						System.out.println("Invalid car price. ");
						
					}
	             }catch(InputMismatchException e) {
	        	 System.out.println("cost must be in numbers");	 
	        	 sc.nextLine();
	        	 }
	        }
	        sc.nextLine();
	         
	        boolean flag =true;
	         String premiumType ="";
	              try {
	         while(flag) {
	            	  System.out.print("Enter Insurance Type:");
	            	  
	            	   premiumType=sc.nextLine();
	            	   
	            	    if(premiumType.equalsIgnoreCase("BASIC") || premiumType.equalsIgnoreCase("PREMIUM")){
	            		 
	            	    	flag=false;
	            	    }else{
	            	    	System.out.println("Insurance Type is invalid");     
	            	  }
	              }
	              }catch(InputMismatchException e) {
	            	  System.out.println("premium type can not be a number ");
	              }
	              
	        
	        
	      
	       


   
	          GetCarFactory obj = new GetCarFactory();

	        //get an object of sedan and call its getType()method.

     
	        Car p = obj.getType(carType);

	         p.getRate();
	         
	         System.out.print("Premium amount for "+carType+" model "+carModel+" of cost "+cost+"  is: ");
	        
	         if(premiumType.equalsIgnoreCase("PREMIUM")) {
	        	 double ans = p.calculatePremium(cost);
	        	 System.out.print(ans);
	         }else if(premiumType.equalsIgnoreCase("BASIC")) {
	        	 double ans = p.calculateBasicPremium(cost);
	        	 System.out.print(ans);
	        }
	         
	         System.out.println('\n' );  
	         System.out.println("Do you want to enter details of another car ? (Yes/No)");
		     confirm =sc.nextLine();
		     sc.nextLine();
		    
		}while(confirm.equalsIgnoreCase("YES"));
		
		
	}

}
