package Sorting;
import java.util.Scanner;
/**
*Author: Kim Alfred A. Molina
*Course: BSCS-A2022
* Date: February 22 2023
*/
public class BubbleSort 
{
    public static void bubbleSort(int[] arr) 
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

    public static void selectionSort(int[] arr) 
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

    public static void insertionSort(int[] arr) 
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

            System.out.println("Select a sorting algorithm:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    bubbleSort(numbers);
                    break;
                case 2:
                    selectionSort(numbers);
                    break;
                case 3:
                    insertionSort(numbers);
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            scanner.nextLine();
            System.out.print("Do you want to input again? (Y/N): ");
            String input2 = scanner.nextLine();
            if (input2.equalsIgnoreCase("N")) {
                break;
            }
        }

        scanner.close();
    }
}