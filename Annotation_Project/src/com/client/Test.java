package com.client;

import java.util.Scanner;

import com.serviceI.I;
import com.serviceimpl.EmployeeImpl;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		I i=new EmployeeImpl();
		while(true)
		{
		System.out.println("*****SELECT*****\n"+"1.For Insert Data \n"+"2.For View Data \n"+"3.For Update Data \n"+"4.For Delete Data");
		int input=sc.nextInt();
		
		switch (input) {
		case 1:i.create();
			
			break;
		case 2:i.select();
		
		break;
		case 3:i.update();;
		
		break;
		case 4:i.delete();
		
		break;

		default:
			break;
		}
		}

	}

}
