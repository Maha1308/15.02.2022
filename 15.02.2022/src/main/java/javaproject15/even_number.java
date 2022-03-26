package javaproject15;

import java.util.Scanner;

public class even_number {

	public static void main(String[] args) {
		int s,e;
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the s number:");
		s= scanner.nextInt();
		System.out.println("enter the e number:");
		e=scanner.nextInt();
	 
		for(s=100;s<=e;s++)
		{
			if(s%2==0)
			{
		
     System.out.println(+s);
		
	}
		}
		scanner.close();

	 }

	}


