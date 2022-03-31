package Logical;

import java.util.Scanner;

public class SwapNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st No : ");
		int i=sc.nextInt();
		System.out.print("Enter 2nd No : ");
		int j=sc.nextInt();
		
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println(i);
		System.out.println(j);
		
	}

}
