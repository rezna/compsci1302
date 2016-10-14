package gitcode.compsci1302;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Backtracking {

	public static void main(String[] args) {
	
		
		int[] repub1 = new int[10];
		int[] repub2 = new int[10];
		int[] demo1 = new int[10];
		int[] demo2 = new int[10];
		// Generates 10 Random Numbers

		repub1 = listCreate();
		repub2 = listCreate();
		demo1 = listCreate();
		demo2 = listCreate();

		int sum1 = sumUp(repub1), sum2 = sumUp(repub2), sum3 = sumUp(demo1), sum4 = sumUp(demo2);

		int sumre = sum1 + sum2;

		System.out.println("Total number of republican votes =" + " " + sumre);

		int sumde = sum3 + sum4;

		System.out.println("Total number of democratic votes = " + " " + sumde);

		if (sumre > sumde) {
			System.out.println("Republican win");
		} else
			System.out.println("Democrats win");
	}

	private static int sumUp(int[] Ar) {
		System.out.println("Numbers Generated: " + Arrays.toString(Ar));
		int sum = IntStream.of(Ar).sum();
		System.out.println("Total number of votes for republicans " + " " + sum);
		return sum;
	}

	private static int[] listCreate() {
		int[] temp = new int[10];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int) (Math.random() * 5000 + 1);
		} // end for loop
		return temp;
	}
}
