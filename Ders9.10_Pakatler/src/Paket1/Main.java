package Paket1;

import java.util.Scanner;

import Paket2.student;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String adi=input.next();
		
		student student = new student(adi);
		student.calis();
		

		
	}
}
