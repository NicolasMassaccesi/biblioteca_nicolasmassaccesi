import java.util.Scanner;

public class SumarDosNumerosEDApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el primer numero:");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.print("Ingrese el segundo numero:");
		double num2 = Double.parseDouble(sc.nextLine());
		System.out.println("La suma es: " + (num1 + num2));
		sc.close();
	}

}
