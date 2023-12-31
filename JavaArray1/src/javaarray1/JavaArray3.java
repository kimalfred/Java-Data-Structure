package javaarray1;
import java.util.Scanner;
/**
*Author: Kim Alfred A. Molina
*Course: BSCS-A2022
* Date: February 22 2023
*/
public class JavaArray3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[0];

        while (true) 
        {
            System.out.println("Array CRUDSI");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Insert");
            System.out.println("5. Delete");
            System.out.println("6. Exit Program");

            int choice;
            try 
            {
                choice = scanner.nextInt();
            } catch (Exception e) 
            {
                System.out.println("Invalid number");
                break;
            }

            if (choice == 1) 
            {
                System.out.println("Enter the number of elements in the array: ");
                int numElements = scanner.nextInt();

                numbers = new int[numElements];
                System.out.println("Enter the elements of the array: ");
                for (int i = 0; i < numElements; i++) 
                {
                    numbers[i] = scanner.nextInt();
                }
            } else if (choice == 2) 
            {
                if (numbers.length == 0) 
                {
                    System.out.println("No numbers added");
                } else 
                {
                    System.out.println("Current array: ");
                    for (int i = 0; i < numbers.length; i++) 
                    {
                        System.out.println("number " + (i + 1) + ": " + numbers[i]);
                    }
                }
            } else if (choice == 3) 
            {
                if (numbers.length == 0) 
                {
                    System.out.println("No numbers added");
                } else 
                {
                    System.out.println("Enter the number to search for: ");
                    int searchNumber = scanner.nextInt();

                    boolean found = false;
                    for (int i = 0; i < numbers.length; i++) 
                    {
                        if (numbers[i] == searchNumber) 
                        {
                            System.out.println("Number found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Number not found");
                    }
                }
            } else if (choice == 4) 
            {
                if (numbers.length == 0) 
                {
                    System.out.println("No numbers added");
                } else 
                {
                    System.out.println("Enter the index where you want to insert the number: ");
                    int insertIndex = scanner.nextInt();

                    if (insertIndex < 0 || insertIndex > numbers.length) 
                    {
                        System.out.println("Invalid index");
                    } else 
                    {
                        System.out.println("Enter the number to insert: ");
                        int insertNumber = scanner.nextInt();

                        int[] newNumbers = new int[numbers.length + 1];
                        for (int i = 0; i < insertIndex; i++) 
                        {
                            newNumbers[i] = numbers[i];
                        }
                        newNumbers[insertIndex] = insertNumber;
                        for (int i = insertIndex + 1; i < newNumbers.length; i++) 
                        {
                            newNumbers[i] = numbers[i - 1];
                        }

                        numbers = newNumbers;

                        System.out.println("Number inserted successfully");
                    }
                }
            } else if (choice == 5) 
            {
                if (numbers.length == 0) 
                {
                    System.out.println("No numbers added");
                } else {
                    System.out.println("Enter the index of the number to delete: ");
                    int deleteIndex = scanner.nextInt();

                    if (deleteIndex < 0 || deleteIndex >= numbers.length) 
                    {
                        System.out.println("Invalid index");
                    } else 
                    {
                        int[] newNumbers                    = new int[numbers.length - 1];
                    for (int i = 0; i < deleteIndex; i++) 
                    {
                        newNumbers[i] = numbers[i];
                    }
                    for (int i = deleteIndex + 1; i < numbers.length; i++) {
                        newNumbers[i - 1] = numbers[i];
                    }

                    numbers = newNumbers;

                    System.out.println("Number deleted successfully");
                    }
            }
        } else if (choice == 6) {
            System.out.println("Thank you, program exiting...");
            break;
        } else {
            System.out.println("Invalid choice");
        }
        }

    scanner.close();
    }
}