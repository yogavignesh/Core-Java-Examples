// Homework 2
//Yoga Vignesh Surathi
//1001101504
//INSY 5309
// Leap year or not

import javax.swing.*;
import java.text.*;

public class Hw2
{
    public static void main( String[] arg )
    {

	     // declare primitive variables
	     int year=0;//initialize the year value
	     String yr;
	     String message = ""; //initialize the message to be displayed
	   	  
	     // loop condition to keep prompting user for the year 
	     while(true){
	     // prompt the user for the year to be checked everytime
	    	 yr = JOptionPane.showInputDialog( "Please enter the year" );
	    	 //check if input is valid
	    	 if(!yr.isEmpty()){
			     year = Integer.parseInt(yr);
			     if(year==-99){
			    	//condition to terminate the program when user hits -99.
			    	 break;
			     }
			     //check if the year is divisble by 4 using % operator
		  	   	 if(year%4==0){
		  	   		 message = year + " is a leap year " ;	
		  	   		 if(year%100==0 && year%400!=0){
		  	   			 //check if the year is not divisible by 400 to confirm its not a leap year
		  	   			 message = year + " is not a leap year " ;	
		  	   		 }		  	   		 	  		   
		  	   		 JOptionPane.showMessageDialog( null, message ); 
		     	 }
		  	   	 else{
		  	   		 message = year + " is not a leap year " ;	  	
		  	   		 JOptionPane.showMessageDialog( null, message ); 
		  		 }
	    	 }
	    	 else{
	    		 message = "Enter a valid year " ;
	    		 JOptionPane.showMessageDialog( null, message ); 
	    	 }
	     } 
	     message="Quit Program";
	     JOptionPane.showMessageDialog( null, message );     
	     
	     System.exit( 0 );         
       
    }
    
}