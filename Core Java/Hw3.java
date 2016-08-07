//Homework 3 
//Yoga Vignesh Surathi
//1001101504
//INSY 5309
//Display Kwh usage for customers


import javax.swing.*;
import java.text.*;
public class Hw3 {

		public static void main (String[] arg){
			//declaring and initializing variables
			int customer_no=0,kwh_usage=0,total_kwh_usage=0;
			int no_of_cust=0;
			double total_charges=0.00;
			String customer,customer_kwh;
			//set the decimal format to 2 decimal places
			DecimalFormat d=new DecimalFormat("#.00");	
			//Initialize the JtextArea to display the table format
			JTextArea cust_table=new JTextArea();
			cust_table.setText("Customer No.\tUsage in KWh\tTotal Charges\t\n\n");
			cust_table.append("------------------------------------------------\n\n");
			while(true){
			customer=JOptionPane.showInputDialog("Please enter customer number or -999 to quit:");
			customer_no=Integer.parseInt(customer);
				if(customer_no!=-999){//get customers until the the user enters -999
					no_of_cust++;//calculates the no of customers
					customer_kwh=JOptionPane.showInputDialog("Please enter the usage KWH");
					kwh_usage=Integer.parseInt(customer_kwh);
					//passing the kwh usage to method to calculate the charges
					double total = findCharge(kwh_usage);
					cust_table.append(customer_no+" \t "+kwh_usage + " \t "+ d.format(total)+"\n");
					total_charges+=total;//calculates the total charges
					total_kwh_usage+=kwh_usage;//calculates the total kwh usage
				}
				else
				{
					break;
				}
			}
			
			cust_table.append("---------------------------------------------------\n\n");
			
			cust_table.append(no_of_cust+" \t "+total_kwh_usage+" \t "+d.format(total_charges)+"\n");
			JOptionPane.showMessageDialog(null,cust_table);
		}
		//method to calculate the charges for each customer per KWh usage
		public static double findCharge(int kwh){
			double total=0.00;
			//9 cents per kilowatt-hour (kwh) for the first 300 kwh 
			if(kwh<=300){
				total=kwh * 0.09;
			}
			//8 cents per kwh for the next 300 kwh (up to 600 kwh) 
			if(kwh>300 && kwh<=600){
				total=300 * 0.09 + (kwh-300) * 0.08;
			}
			//6 cents per kwh for the next 400 kwh (up to 1000 kwh)
			if(kwh>600 && kwh<=1000)
			{
				total=(300 * 0.09) + (300 * 0.08) + (kwh-600)*0.06;
				
			}
			//5 cents per kwh for all electricity used over 1000 kwh
			if(kwh>1000)
			{
				total=(300 * 0.09) + (300 * 0.08) + (400 * 0.06) + (kwh-1000)*0.05;
			}
			return total;			
		}
}
