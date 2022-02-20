//5.	Write a Java Program to find the second-highest number in an array.

import java.util.Arrays;
import java.util.Scanner;

public class Secondhighest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array size :");
    Integer numberOfElements = scanner.nextInt();
    int arr[] = new int[numberOfElements];
    System.out.println("Enter array elements :");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.println("Array elements are" + Arrays.toString(arr));
    int largest = arr[0];
    int secondLargest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest) {
        secondLargest = arr[i];
      }
    }
    System.out.println("Second highest element in array is :" + secondLargest);
    scanner.close();
  }
}