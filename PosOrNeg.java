package gweek;
import java.io.*;
public class PosOrNeg {
	public static void main(String[] args)throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter Number to check whether +ve or -ve : ");
		int num = br.read(); 
		if( num == 0 )
			System.out.println("The given number is neither +ve nor -ve .");
		else if( num > 0 )
			System.out.println("The given number is +ve .");
		else
			System.out.println(" The given number is -ve .");
			}
	}
