package gweek;
import java.util.Scanner;
public class GreaterNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number for comparition.. : ");
		int fNo=sc.nextInt();
		int sNo=sc.nextInt();
		int tNo=sc.nextInt();
		if(fNo>sNo && fNo>tNo)
			System.out.println(fNo+" is greater than other.");
		else if(sNo>tNo)
			System.out.println(sNo+" is greater than other.");
		else
			System.out.println(tNo+" is greater than other.");
		sc.close();
			}
	}
