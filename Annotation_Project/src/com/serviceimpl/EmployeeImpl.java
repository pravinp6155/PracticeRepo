package com.serviceimpl;

import java.util.Scanner;

import org.hibernate.Session;

import com.client.Test;
import com.hibernate.Dao;
import com.model.Employee;
import com.serviceI.I;

public class EmployeeImpl implements I {
	Scanner sc=new Scanner(System.in);
	Employee e=null;
	@Override
	public void create() {
		System.out.print("Enter How Many Emloyee Data Add : ");
		int input=sc.nextInt();
		for(int i=1;i<=input;i++)
		{
		Session s=Dao.connection();
		
		 e=new Employee();
		System.out.print("Enter Employee Name      : ");
		e.setName(sc.next());
		System.out.print("Enter Employee Email ID  : ");
		e.setEmail(sc.next());
		System.out.print("Enter Employee Address   : ");
		e.setAddress(sc.next());
		System.out.print("Enter Employee Mobile No : ");
		e.setMobno(sc.nextLong());
		s.save(e);
		s.beginTransaction().commit();
		s.close();
		
		System.out.println("Employee Data Added Successfully....");
		}
		
		
	}

	@Override
	public void select() {
		Session s=Dao.connection();
		System.out.print("Enter Employee Id : ");
		int id=sc.nextInt();
		 e=s.get(Employee.class, id);
		 System.out.println("Employee Id        : "+e.getId());
		 System.out.println("Employee Name      : "+e.getName());
		 System.out.println("Employee Email     : "+e.getEmail());
		 System.out.println("Employee Address   : "+e.getAddress());
		 System.out.println("Employee Mobile No : "+e.getMobno());
		
		 s.beginTransaction().commit();
			s.close();
	}

	@Override
	public void update() {
		Session s=Dao.connection();
		e=new Employee();
		System.out.print("Enter Employee ID : ");
		int id=sc.nextInt();
		e=s.get(Employee.class, id);
		System.out.println("1.For Name Update\n"+"2.For Address update\n"+"3.For Update Email  \n"+"4.For Update Mobile No");
		int input=sc.nextInt();
		switch (input) {
		case 1:System.out.print("Enter Updated Name : ");
			e.setName(sc.next());
			System.out.println("Name Updated Successfully....");
			
			break;
			
		case 2:System.out.print("Enter Updated Address : ");
		e.setAddress(sc.next());
		System.out.println("Address Updated Successfully....");
		
		break;
		case 3:System.out.print("Enter Updated Email Id : ");
		e.setEmail(sc.next());
		System.out.println("Email Id Updated Successfully....");
		
		break;
		case 4:System.out.print("Enter Updated Mobile No : ");
		e.setMobno(sc.nextLong());
		System.out.println("Mobile No Updated Successfully....");
		break;

		default:
			break;
		}
		s.update(e);
		s.beginTransaction().commit();
		s.close();
		
	}

	@Override
	public void delete() {
		Session s=Dao.connection();
		e=new Employee();
		System.out.print("Enter Employee ID : ");
		e.setId(sc.nextInt());
		s.delete(e);
		s.beginTransaction().commit();
		s.close();
	}

}
