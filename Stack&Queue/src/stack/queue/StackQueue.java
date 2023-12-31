package stack.queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    stackOperations();
                    break;
                case 2:
                    queueOperations();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
        
        scanner.close();
        System.out.println("Program exited.");
    }
    
    public static void stackOperations() {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Back");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter value to push:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    System.out.println("Value " + value + " pushed to stack.");
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        int poppedValue = stack.pop();
                        System.out.println("Value " + poppedValue + " popped from stack.");
                    }
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        int peekedValue = stack.peek();
                        System.out.println("Value " + peekedValue + " is at the top of the stack.");
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack: " + stack);
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
        
        scanner.close();
        System.out.println("Exited stack operations.");
    }
    
    public static void queueOperations() {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Back");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter value to enqueue:");
                    int value = scanner.nextInt();
                    queue.offer(value);
                    System.out.println("Value " + value + " enqueued.");
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        int dequeuedValue = queue.poll();
                                        System.out.println("Value " + dequeuedValue + " dequeued from queue.");
                }
                break;
            case 3:
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    int peekedValue = queue.peek();
                    System.out.println("Value " + peekedValue + " is at the front of the queue.");
                }
                break;
            case 4:
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    
                }
            }
        }
    }
}