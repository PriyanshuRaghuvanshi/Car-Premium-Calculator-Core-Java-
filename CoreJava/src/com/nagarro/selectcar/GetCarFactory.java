package com.nagarro.selectcar;

import com.nagarro.computepremium.Car;
import com.nagarro.computepremium.Hatchback;
import com.nagarro.computepremium.Sedan;
import com.nagarro.computepremium.Suv;

public class GetCarFactory {
	 public Car getType(String carType)
     {

             if(carType == null)
            {
              return null;
            }

 	      if(carType.equalsIgnoreCase("HATCHBACK"))
            {
 	    	 
              return new Hatchback();
            } 
    
            else if(carType.equalsIgnoreCase("SEDAN"))
           {
            	
             return new Sedan();
           } 

           else if(carType.equalsIgnoreCase("SUV"))
           {
        	   
             return new Suv();
           }
       

       return null;
    }

          
}
