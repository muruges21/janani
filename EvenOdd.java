package gweek;
import java.io.*;
public class EvenOdd {
	public static void main(String[] args)throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter Number to check whether even or odd : ");
		int num = br.read(); 
		if( num == 0 )
			System.out.println("The given number is neither even nor odd .");
		else if( num % 2 == 0 )
			System.out.println("The given number is even number.");
		else
			System.out.println(" The given number is odd number.");
		br.close();
		is.close();
			}
	}
