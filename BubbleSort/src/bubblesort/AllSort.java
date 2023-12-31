package Sorting;
import java.util.Scanner;

/**
*Author: Kim Alfred A. Molina
*Course: BSCS-A2022
* Date: March 8 2023
*/
public class AllSort
{
    
    public static void BubbleSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j+1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("Round " + (i+1) + " (Bubble Sort): " + arrayToString(arr));
        }
    }
    
    public static void SelectionSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++) 
            {
                if (arr[j] < arr[min_idx]) 
                {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
            System.out.println("Round " + (i+1) + " (Selection Sort): " + arrayToString(arr));
        }
    }
  
    public static void InsertionSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) 
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) 
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            System.out.println("Round " + i + " (Insertion Sort): " + arrayToString(arr));
        }
    }
    
    public static String arrayToString(int[] arr) 
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) 
        {
            sb.append(arr[i]);
            if (i < arr.length - 1) 
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    
    static void shuffleArray(int[] arr) 
    {
        System.out.println("Shuffling array...");
        for (int i = arr.length - 1; i > 0; i--) 
        {
            int j = (int)(Math.random() * (i + 1));
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner(System.in);

        while (true) 
        {
        System.out.print("Enter a list of numbers separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) 
        {
            numbers[i] = Integer.parseInt(input[i]);
        }

        System.out.println("Available sorting algorithms:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.print("Enter your choice: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) 
        {
            case 1:
                BubbleSort(numbers);                    
                break;
            case 2:
                SelectionSort(numbers);                    
                break;
            case 3:
                InsertionSort(numbers);                    
                break;
            default:
                System.out.println("Invalid choice");
                continue;
        }

        System.out.println("Sorted array: " + arrayToString(numbers));
        shuffleArray(numbers);            
        System.out.println("Shuffled array: " + arrayToString(numbers));

        System.out.print("Do you want to rerun the program? (y/n): ");
        String answer = scanner.nextLine();
        if (!answer.equals("y")) 
        {
            break;
        }
        
        }
    }
}
