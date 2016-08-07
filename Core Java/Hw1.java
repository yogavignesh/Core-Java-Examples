// Homework 1
//Yoga Vignesh Surathi
//1001101504
//INSY 5309
// Age difference

import javax.swing.*;
import java.text.*;

public class Hw1
{
    public static void main( String[] arg )
    {
       // declare primitive variables
       int age1, age2;
       String per1Str, per2Str,per3Str,per4Str ,per5Str ,per6Str,ageDifference;
       int ageDiff;
       
       // prompt the user for 2 int values & initialize the variables
       per1Str = JOptionPane.showInputDialog( "Please enter First Name of first person" );
       per2Str = JOptionPane.showInputDialog( "Please enter Last Name of first person" );
       per3Str = JOptionPane.showInputDialog( "Please enter Age of first person" );
      per4Str = JOptionPane.showInputDialog( "Please enter First Name of second person" );
       per5Str = JOptionPane.showInputDialog( "Please enter Last Name of second person" );
       per6Str = JOptionPane.showInputDialog( "Please enter Age of second person" );
      age1 = Integer.parseInt( per3Str );
       age2 = Integer.parseInt( per6Str );
       
       // perform the operations of finding which person is older than the other
       ageDiff = age1 - age2;   
       if(ageDiff==0){
	ageDifference=per1Str +" is of same age as "+per4Str; 
	} 
  	else if(ageDiff<0){
	ageDifference=per1Str +" is younger than "+per4Str; 
	} 
	else{
	ageDifference=per1Str +" is older than "+per4Str; 
	}
       // create and display the output message as in the requirement
       String message = "";       
       message = message + "First Person: " + per2Str+ ", "+ per1Str +" ("+per3Str+")" ;
       message = message + "\nSecond Person: " + per5Str+ ", "+ per4Str +" ("+per6Str+")" ;   
       message = message + "\n"+ageDifference ;
      
       
       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}