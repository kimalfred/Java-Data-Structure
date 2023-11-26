package Sorting2;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllSort2 {
static int arr[] = {};
static int elem, i, dec,ctr;

 
  // Quick Sort
  public static void quickSort(int[] arr, int left, int right) 
  {
    if (left < right) 
    {
      int pivot = partition(arr, left, right);
      quickSort(arr, left, pivot - 1);
      quickSort(arr, pivot + 1, right);
    }
  }
  
  
  private static int partition(int[] arr, int left, int right) 
  {
    int pivot = arr[right];
    int i = left - 1;
    for (int j = left; j < right; j++) 
    {
      if (arr[j] <= pivot) 
      {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[right];
    arr[right] = temp;
    System.out.println(Arrays.toString(arr) + "    ");
    return i + 1;
    }
  
  // Shell Sort
    public static void shellSort(int[] arr) 
     {
    int n = arr.length;
    for (int gap = n/2; gap > 0; gap /= 2) 
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
        System.out.println(Arrays.toString(arr) + "    ");
      }
    }
    }
  
    
  // Radix Sort
  public static void radixSort(int[] arr) 
  {
    int max = Arrays.stream(arr).max().getAsInt();
    for (int exp = 1; max / exp > 0; exp *= 10) 
    {
      countSort(arr, exp);
    }
  }
  
  private static void countSort(int[] arr, int exp) 
  {
    int n = arr.length;
    int[] output = new int[n];
    int[] count = new int[10];
    Arrays.fill(count, 0);
    
    for (int i = 0; i < n; i++) 
    {
      count[(arr[i] / exp) % 10]++;
    }
    
    for (int i = 1; i < 10; i++) 
    {
      count[i] += count[i - 1];
    }
    
    for (int i = n - 1; i >= 0; i--) 
    {
      output[count[(arr[i] / exp) % 10] - 1] = arr[i];
      count[(arr[i] / exp) % 10]--;
    }
    
    for (int i = 0; i < n; i++) 
    {
      arr[i] = output[i];
      System.out.println(Arrays.toString(arr) + "    ");
    }
  
  }
  
//Main====================================================================================================
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean shouldContinue = true;
    int ctr = 0;

    while (shouldContinue) {
        System.out.print("Enter numbers to sort separated by spaces: ");
        String input = br.readLine();
        String[] nums = input.split("\\s+");
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            try {
                arr[i] = Integer.parseInt(nums[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter only integers.");
                break;
            }
        }

        if (arr[0] == 0) {
            continue; 
        }

        System.out.println("");
        System.out.println("The numbers you entered: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "     ");
        }

        System.out.println("");
        System.out.println("");
        int dec = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("What sorting method do you want to use?");
            System.out.println("[1] Shell Sorting");
            System.out.println("[2] Quick Sorting");
            System.out.println("[3] Radix Sorting");
            System.out.print("Type the number of the sorting method you want to use: ");
            try {
                dec = Integer.parseInt(br.readLine());
                if (dec >= 1 && dec <= 3) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input! Please enter a number 1 to 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }

        System.out.println("");

        if (dec == 1) {
            shellSort(arr);
            System.out.println("Sorted using Shell Sort: " + Arrays.toString(arr));
        } else if (dec == 2) {
            quickSort(arr, 0, arr.length - 1);
            System.out.println("Sorted using Quick Sort: " + Arrays.toString(arr));
        } else if (dec == 3) {
            radixSort(arr);
            System.out.println("Sorted using Radix Sort: " + Arrays.toString(arr));
        }

        System.out.println("");
        System.out.print("Want to sort again? [y/n]: ");
        String again = br.readLine();

        if (again.equalsIgnoreCase("y")) {
            System.out.println("");
            ctr++;
        } else if (again.equalsIgnoreCase("n")) {
            System.out.println("");
            System.out.println("******You ran the program " + (ctr + 1) + " time/s******");
            System.out.println("Program Done........");
            shouldContinue = false;
        }
    }
}

}