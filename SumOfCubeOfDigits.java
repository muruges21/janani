package gweek;

import java.util.Scanner;

public class SumOfCubeOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Digits for Get sum of cube of number :");
		int num=sc.nextInt();
		int rem,sum=0;
		while(num>0)
		{
			rem=num%10;
			sum+=(rem*rem*rem);
			num/=10;
		}
		System.out.println("The sum of cube of Digits : "+sum);
		sc.close();

	}

}
