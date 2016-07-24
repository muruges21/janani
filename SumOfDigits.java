package gweek;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number to find sum of digits : ");
		int num=sc.nextInt();
		int sum=0,rem;
		for(;num>=1;num/=10)
		{
			rem=num % 10;
			sum+=rem;
		}
		System.out.println("The sum of digits of given number is : "+sum);
		sc.close();
			}
}