package sorting;

import static Sorting.BubbleSort.arrayToString;
import java.util.Scanner;
/**
*Author: Kim Alfred A. Molina
*Course: BSCS-A2022
* Date: March 1 2023
*/
public class InsertionSort 
{
    
    public static void InsertionSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) 
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println("Round " + (i+1) + " (Insertion Sort): " + arrayToString(arr));
        }
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

            System.out.println("Insertion Sort:");
            InsertionSort(numbers);

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