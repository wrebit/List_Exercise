package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Exercise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.printf("Employee #%d%n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			System.out.println();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsearch = sc.nextInt();
		Integer pos = position(list, idsearch);
		if(pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).salaryIncrease(percentage);	 
		}
		
		System.out.println();
		System.out.println("List of employees");
		for(Employee x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
		
	}

}
