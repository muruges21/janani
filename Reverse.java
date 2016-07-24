package gweek;

import java.io.*;

public class Reverse {
	public static void main(String[] args)throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader rb = new BufferedReader(is);
		System.out.println("Enter string for reverse : ");
		StringBuffer string = new StringBuffer(rb.readLine()); 
		System.out.println("Reverse of given string is : "+string.reverse());
		is.close();
		rb.close();
		}
	}
