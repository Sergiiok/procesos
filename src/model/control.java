package model;

import java.util.Scanner;

public class control {

	private Dev dev;
	private String result;
	private Scanner s;
	
	public control() {
		dev = new Dev();
		result = "";
		s = new Scanner(System.in);
	}
	
	public String run() {
		
		String area = s.next();
		int a = s.nextInt();
		int b = s.nextInt();
		
		result += dev.interactador(a, b, area);
		
		return result;
	}
	
	public static void main(String[] args) {
		
		control c = new control();
		System.out.println("Introduzca, separado por espacios, el area de proceso, el nivel actual y el nivel que desea subir, respectivamente");
		System.out.println(c.run());
	}
}
