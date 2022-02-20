//10.	Write a java program to take an input array of integers and sort the elements in a descending order using selection sort

import java.util.*;

public class SelectionSort {
	void sort(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			int min = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[min] < arr[j])
					min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	void printArray(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		SelectionSort ob = new SelectionSort();
		ob.sort(arr);
		System.out.println("Sorted array in descending order is:");
		ob.printArray(arr);
	}
}