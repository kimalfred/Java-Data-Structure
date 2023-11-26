package bufferedreader1;

import java.io.*;
/**
 *Author: Kim Alfred A. Molina
 *Course: BSCS-A2022
 *Date: February 13 2023
 */
public class BufferedReader1 
{
    public static void main (String args []) throws Exception 
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
	while (true)
        {
            System.out.println("Enter your name:");
            String name = br.readLine();
            System.out.println("");
            try
                {
                System.out.println("Enter your birth year: ");
                int year = Integer.parseInt (br.readLine());
				
				
                System.out.println("");
				
                System.out.println("Enter the current year: ");
                int curr = Integer.parseInt(br.readLine());
				
				
                System.out.println("");
				
                System.out.println("Your year of birth is : " + year);
                System.out.println("The current year is: " + curr);
                System.out.println("");				
                System.out.println("Hello " + name +", your age this year is  "  + (curr - year) + " years old.");
                break;
				
                }
                    catch(Exception e) 
                    {
                    System.out.println("");				
                    System.out.println("--------Please enter an Integer--------");
                    System.out.println("Try Again........");
                    System.out.println("");
                    }
				
        }
	

    }
}
