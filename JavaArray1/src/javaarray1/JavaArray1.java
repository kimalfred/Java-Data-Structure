package array1;

import java.util.Scanner;
/**
 *Author: Kim Alfred A. Molina
 *Course: BSCS-A2022
 * Date: February 1 2023
 */
public class JavaArray1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    
      System.out.println("Enter the number of rows:");
      int rows = sc.nextInt();
      System.out.println("Enter the number of columns:");
      int cols = sc.nextInt();
      int[][] arr = new int[rows][cols];
      System.out.println("Enter the items in the index:");
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          System.out.println("Enter item for row " + (i) + " and column " + (j ) + ":");
          arr[i][j] = sc.nextInt();
        }
      }
      boolean runAgain = true;
    while (runAgain) {
      count++;
      System.out.println("Choose an operation (1-3):");
      System.out.println("1. Addition");
      System.out.println("2. Product");
      System.out.println("3. Average");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          int sum = 0;
          for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              sum += arr[i][j];
            }
          }
          System.out.println("Sum of all items: " + sum);
          break;
        case 2:
          int product = 1;
          for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              product *= arr[i][j];
            }
          }
          System.out.println("Product of all items: " + product);
          break;
        case 3:
          int sum2 = 0;
          for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              sum2 += arr[i][j];
            }
          }
          double avg = (double) sum2 / (rows * cols);
          System.out.println("Average of all items: " + avg);
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
      }

      System.out.println("Do you want to use the array again? (y/n)");
      String answer = sc.next();
      if (answer.equalsIgnoreCase("n")) {
        runAgain = false;
      }
    }

    System.out.println("You have used this program " + count + " times.");
  }
}


