package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Employee;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//RECTANGLE
		/*Rectangle rectangle = new Rectangle();
		//rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f\n", rectangle.area());
		System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal());*/
		
		
		//EMPLOYEE
		/*Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double input = sc.nextDouble();
		
		employee.increaseSalary(input);
		
		System.out.println();
		System.out.println("Update data: " + employee);*/
		
		//Aluno
		/*Aluno aluno = new Aluno();
		System.out.print("Name: ");
		aluno.name = sc.nextLine();
		System.out.print("Note 1: ");
		aluno.note1 = sc.nextDouble();
		System.out.print("Note 2: ");
		aluno.note2 = sc.nextDouble();
		System.out.print("Note 3: ");
		aluno.note3 = sc.nextDouble();
		
		aluno.finalGrade();*/
		
		
		
		sc.close();
	}

}
