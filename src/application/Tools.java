package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools {
	public static Scanner scan = new Scanner(System.in);
	
	public static void menu(String one, String two, String three, String four, String five) {
		menu(one, two, three, four);
		show("5 - " + five);
	}
	
	public static void menu(String one, String two, String three, String four) {
		menu(one, two, three);
		show("4 - " + four);
	}
	
	public static void menu(String one, String two, String three) {
		menu(one, two);
		show("3 - " + three);
		
	}
	public static void menu(String one, String two) {
		show("1 - " + one);
		show("2 - " + two);
	}
	
	public static void show(String mensagem) {
		System.out.println(mensagem);
	}
	
	public static int input() {
		int num = 0; 
		try {
			num = scan.nextInt();
		} catch (InputMismatchException e) {
			show("Só são permitidos números");
			scan.next();
		} catch (Exception e) {
			show(e.getMessage());
		}
		return num;
	}
}
