package array1;

import java.util.Scanner;

/**
 *Author: Kim Alfred A. Molina
 *Course: BSCS-A2022
 * Date: February 8 2023
 */
public class JavaArray2 {
        
    static int loop=0;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true){
       
        for(int y=0;y<1;){
            System.out.println("Enter your Choice");
            System.out.println("1: Create 2: Exit");
            int oper = scan.nextInt();
            
            if(oper==1){
               System.out.println("Size of an Array: ");
        int size=scan.nextInt();
        int [] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter Elements: ");
            array[i]=scan.nextInt();
        }
        
        
            System.out.println("Do you want to");
            System.out.println("1: Recreate 2: Display 3: Stop");
            int ans= scan.nextInt();
            
            if(ans==1){
                continue;
            }
            else if (ans==2){
                System.out.println("Elements: ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
            }
            }
            else if (ans==3){
                System.out.println("Thanks for using this Program");
                return;
            }
            else{
                System.out.println("Try answering again.");
                System.out.println("Read the directions");
                continue;
            }
            }
            else if(oper==2){
                System.out.println("Thank you");
                return;
            }
            else{
                System.out.println("Invalid Input");
             
            }
            
        }
        
            scan.close();
        }
        
    }
    
}