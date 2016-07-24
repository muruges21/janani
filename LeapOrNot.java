package gweek;

import java.util.Scanner;

public class LeapOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year to find leap or not : ");
		int yr=sc.nextInt();
		if(( yr % 4) == 0)
			System.out.println(yr+" is leap.");
		else
			System.out.println(yr+" is not  leap.");
		sc.close();
		
	}
}