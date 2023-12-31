package bufferedreader1;
import java.io.*;
/**
 *Author: Kim Alfred A. Molina
 *Course: BSCS-A2022
 *Date: January 25 2023
 */
public class BufferedReader3 
{
    static int loop = 0;
   
    public static void main(String[] args) throws IOException 
    { 
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      
           for(int x=1;x<4;x++)
           {
               System.out.println();
               System.out.println("Input Password: ");
               String pass = in.readLine();
               
               if (pass.equals("1234"))
               {
                   System.out.println("");
                   System.out.println("WELCOME!!!");
                   System.out.println("");
                   x=5;
                } 
                else 
                {
                   int attempt = 3;
                   attempt = attempt-x;
                   
                   if (attempt==0)
                    {
                       System.out.println("");
                       System.out.println("You typed the password incorrectly 3 times.");
                       System.out.println("Shutting down...");
                       System.out.println("");
                       System.exit(0);
                    }
                   System.out.println("");
                   System.out.println("You still have "+attempt+" attempts remaining!");
                   System.out.println("");
                }
            }
            while (loop==0)
            {
            String[] input = new String[2];
            int a, b, c, d;
            System.out.println("");
            System.out.println("Enter two Numbers");
            input = in.readLine().split(" ");
      
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
      
            c = a/b;
            d = a%b;
      
            System.out.println("");
            System.out.println("The quotient is: " + c + " and the Remainder is: " + d);
            System.out.println("");
      
            for (int y=0;y<1;)
            {
            System.out.println("");
            System.out.println("Do you want to run it again?");
            System.out.println("1 = YES, 2 = NO");
            System.out.println("");
            double operation = Double.parseDouble(in.readLine());
          
            if (operation==1)
            {
            y=2;
            }
                else if (operation==2)
                {
                loop=2;
                System.out.println("");
                System.out.println("Thank you!");
                System.out.println("");
                y=2;
                }
                else
                {
                System.out.println("");
                System.out.println("INVALID INPUT");
                System.out.println("");
                }
            }
        }
      
    }
    
}
