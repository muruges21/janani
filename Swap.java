package gweek;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter first no & second no : ");
		int fNo=sc.nextInt();
		int sNo=sc.nextInt();
		int temp;
		System.out.println("Before swapping first number is "+fNo+ "second number is "+sNo);
		temp=fNo;
		fNo=sNo;
		sNo=temp;
		System.out.println("After swapping first number is "+fNo+" second number is "+sNo);
		sc.close();
			}
}