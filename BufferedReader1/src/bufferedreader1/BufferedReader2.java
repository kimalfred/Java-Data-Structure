package bufferedreader1;
import java. io.*;
/**
 *Author: Kim Alfred A. Molina
 *Course: BSCS-A2022
 *Date: February 13 2023
 */
public class BufferedReader2 
{
    public static void main (String args [] ) throws Exception 
        {
	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
	int name = 0;
	System.out.println("How many name/s you want to input?");
	int num1 = Integer.parseInt(br.readLine());
		
		
	System.out.println ("Input " + num1 + " name/s");
			
	while (name < num1)
            {
		String names = br.readLine();		
		System.out.println(name);	
		name ++;
            }
                System.out.println("You reached the limit of names that can be inserted....");
		System.out.println("Program Done..........");
	}
}
