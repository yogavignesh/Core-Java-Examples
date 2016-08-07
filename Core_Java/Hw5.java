////Homework 5
//Yoga Vignesh Surathi
//1001101504
//INSY 5309
//Palindrome

import javax.swing.*;
import java.text.*;

public class Hw5 {
	public static void main(String args[]){
		//initialize primitive variables
		int num=0,size=0;
		boolean palindrome=true;
		while(true){
			//get the input number from the user
			String number=JOptionPane.showInputDialog("Enter the number");
			num=Integer.parseInt(number);
			//condition to terminate the program when user hits -99
			if(num!=-99){
				//get the size of the number using a defined method
				size=getSize(num);						
				if(size>0){
					//allocate the int array with the size found
					int[] digits =new int[size];
					//fills the int array with the number in digits
					int[] intArray=fillArray(num,digits);
					//checks if the number is a palindrome or not
					palindrome=isPalindrome(intArray);
					if(palindrome){
						JOptionPane.showMessageDialog(null, num+" is a palindrome");
					}
					else{
						JOptionPane.showMessageDialog(null, num+" is not a palindrome");
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "Enter valid number");
				}
			}
			else
				break;
				 
		}
		JOptionPane.showMessageDialog(null,"Quit Program");
	   
	}
	//returns the number of digits in a number
	public static int getSize(int num){
		int noofdigits=0;
		if(num>0)
		noofdigits = (int)(Math.log10(num)+1);
		return noofdigits;
	}
	//fills an array with the digits in a number
	public static int[] fillArray(int num ,int[] intArray){
		int i=0;
		while(num!=0){
			intArray[i]=num%10;
			num = num/10;
			i++;
		}
		return intArray;
	}
	//returns true if the number is a palindrome or else false
	public static boolean isPalindrome( int[] intArray ){
		
		boolean palin=true;
		int j=intArray.length;
		for(int i=0;i<intArray.length;i++){
			if(intArray[j-1]!=intArray[i]){
				palin=false;
				break;
			}
			j--;
			if(j<i){
				break;
			}
		}	
		return palin;		
	}
}
