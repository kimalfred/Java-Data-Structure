/**package sorting2;
import java.util.Scanner;

public class ShellSort {
    
public static void shellSort(int[] arr) 
{
    int n = arr.length;
    for (int gap = n / 2; gap > 0; gap /= 2) 
    {
        for (int i = gap; i < n; i++) 
        {
            int temp = arr[i];           
            int j;
            for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
            {
                arr[j] = arr[j - gap];
            }          
            arr[j] = temp;
        }
    }
}
    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();
    
    int[] arr = new int[n];
    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i += 1) 
    {
      arr[i] = scanner.nextInt();
    }
    
    System.out.println("Original array:");
    for (int i = 0; i < n; i += 1) 
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    
    shellSort(arr);
    
    System.out.println("Sorted array:");
    for (int i = 0; i < n; i += 1) 
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    }
}*/
import java.util.Scanner;

public class ShellSort {
    
    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];           
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }          
                arr[j] = temp;
            }
            // print the array after each iteration of the outer loop
            System.out.print("Array after gap " + gap + " iteration: ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i += 1) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Original array:");
        for (int i = 0; i < n; i += 1) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        shellSort(arr);
        
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i += 1) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


