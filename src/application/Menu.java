package application;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Menu {
	
	public static void menu(String one, String two, String three, String four) {
		menu(one, two, three);
		System.out.println("4 - " + four);
	}
	
	public static void menu(String one, String two, String three) {
		menu(one, two);
		System.out.println("3 - " + three);
		
	}
	public static void menu(String one, String two) {
		System.out.println("1 - " + one);
		System.out.println("2 - " + two);
	}
	
	public static int input() {
		Scanner scan = new Scanner(System.in);
		scan.close();
		String s = scan.next();
		int num = Integer.parseInt(s);
		
		return num;
	}
	
	public static void show(String mensagem) {
		System.out.println(mensagem);
	}
}
