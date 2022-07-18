package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Progrem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			
			
			Integer id;
			String name;
			Double salary;
			
			System.out.println("\nEmployee #" + (i + 1) + ":");
			System.out.print("Id: ");
			id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			
			
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
			
			
			
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		//buscando na lista a primeira ocorrência igual ao id que digitei
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		//Integer pos = position(list, idsalary);
		
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		
		System.out.println("\nList of employees: ");
		for(Employee e : list) {
			System.out.println(e);
		} 
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	/*public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}*/

}
