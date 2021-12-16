package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		boolean salir = false, error = false;

		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1.Sumar      \t2.Restar");
			System.out.println("3.Multiplicar\t4.Dividir");
			System.out.println("\n5.Salir");
			System.out.print("\n->: ");
			do {
				switch (Integer.parseInt(sc.nextLine())) {
				case 1:
					error = false;
					System.out.print("Primer numero: ");
					num1 = Integer.parseInt(sc.nextLine());
					System.out.print("Segundo numero: ");
					num2 = Integer.parseInt(sc.nextLine());
					System.out.println("El resultado es " + sumar(num1, num2));
					break;
					
				case 2:
					error = false;
					System.out.print("Primer numero: ");
					num1 = Integer.parseInt(sc.nextLine());
					System.out.print("Segundo numero: ");
					num2 = Integer.parseInt(sc.nextLine());
					System.out.println("El resultado es " + restar(num1, num2));
					break;
					
				case 3:
					error = false;
					System.out.print("Primer numero: ");
					num1 = Integer.parseInt(sc.nextLine());
					System.out.print("Segundo numero: ");
					num2 = Integer.parseInt(sc.nextLine());
					System.out.println("El resultado es " + multiplicar(num1, num2));
					break;
					
				case 4:
					error = false;
					System.out.print("Primer numero: ");
					num1 = Integer.parseInt(sc.nextLine());
					System.out.print("Segundo numero: ");
					num2 = Integer.parseInt(sc.nextLine());
					System.out.println("El resultado es " + dividir(num1, num2));
					break;
					
				case 5:
					error = false;
					salir = true;
					break;
					
				default:
					System.out.println("Introduce una opcion correcta");
					error = true;
				}
			} while (!error);
		} while (!salir);

	}

	private static double sumar(double num1, double num2) {
		return num1 + num2;
	}

	private static double restar(double num1, double num2) {
		return num1 - num2;
	}
	
	private static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	private static double dividir(double num1, double num2) {
		return num1 / num2;
	}

}
