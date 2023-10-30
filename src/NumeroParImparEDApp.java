import java.util.Scanner;

public class NumeroParImparEDApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el numero:");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.print("El numero es: "+ ((num1%2 == 0) ? "PAR":"IMPAR"));
		sc.close();

	}

}
