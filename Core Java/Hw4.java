////Homework 4
//Yoga Vignesh Surathi
//1001101504
//INSY 5309
//Rectangle class

//package HW4;

import javax.swing.*;

import java.text.*;
import hw4.Rectangle;

public class Hw4 {
	public static void main( String args[] )
	 {  
		//declare primitive variables
		int length,width;
		String l,w,opt;
		int option=0;
		String message;
		boolean q=true;
		//new class object created 
		Rectangle r= new Rectangle();
		//loop to display the options all the time
		while(q){			
			
			opt=JOptionPane.showInputDialog("Please select menu option\n\n"
					+ "1 - to set the length \n2 - to set the width \n3 - to get the length\n"+
					"4 - to get the width \n5 - to get the perimeter \n6 - to get the area\n"+
					"7 - to print the object as string \n0 - to quit \n");
			option=Integer.parseInt(opt);
			//switch case to decide upon the menu action
			switch(option){
				case 0: q=false;
						break;
				case 1:l=JOptionPane.showInputDialog("Please enter the length of the rectangle");
						length=Integer.parseInt(l);
						r.setLength(length);
						break;
				case 2:w=JOptionPane.showInputDialog("Please enter the width of the rectangle");
						width=Integer.parseInt(w);
						r.setWidth(width);
						break;
				case 3:message="Length of the rectangle is "+r.getLength();
						JOptionPane.showMessageDialog(null, message);
						break;
				case 4:message="Width of the rectangle is "+r.getWidth();
						JOptionPane.showMessageDialog(null, message);
						break;
				case 5:message="Perimeter of the rectangle is "+r.getPerimeter();
						JOptionPane.showMessageDialog(null, message);
						break;	
				case 6:message="Area of the rectangle is "+r.getArea();
						JOptionPane.showMessageDialog(null, message);
						break;				
				case 7:	message=r.toString();
						JOptionPane.showMessageDialog(null, message);
						break;
				default:
						break;
				}
			}
				
	 }
}
