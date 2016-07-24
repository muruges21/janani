package gweek;

import java.util.Scanner;

public class NaturalFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter n value upto which to find sum : ");
		int n=sc.nextInt();
		System.out.println("sum of given natural number is : "+(n*(n+1))/2);
		sc.close();
			}
}