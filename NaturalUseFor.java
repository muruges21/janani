package gweek;

import java.util.Scanner;

public class NaturalUseFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter n value upto which to find sum : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
			sum+=i;
		System.out.println("sum of n natural number using for loop : "+sum);
		sc.close();
			}
}