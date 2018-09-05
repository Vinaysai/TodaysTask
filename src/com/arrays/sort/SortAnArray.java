package com.arrays.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array:");
		int i = sc.nextInt();

		int a[] = new int[i];

		for (int j = 0; j < a.length; j++) {
			a[j] = sc.nextInt();
		}
		
		System.out.println("your array is ::" + Arrays.toString(a));
		
		SortAnArray.select(a);
		
		System.out.println("your array is ::" + Arrays.toString(a));
		
		sc.close();
	}

	public static void select(int arr[]) {

		int n = arr.length - 1;

		for (int i = 0; i < n; i++) {
			int index = i;

			for (int j = i; j < arr.length; j++) {
				index = j;

				if (arr[i] > arr[index]) {
					int temp;

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

	}
}
