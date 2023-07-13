package com.simplilearn.array;

public class ArrayExample {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] a1 = new int[10];

		a1[0] = 0;
		a1[1] = 1;
		a1[2] = 2;

		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}

		
		
		int[][] b = {
				{2,4,6,8},
				{1,3}
		};
		
		System.out.println();
		System.out.println(b.length);
		System.out.println(b[0].length);
		// 2D Array iterations..
	}

}
