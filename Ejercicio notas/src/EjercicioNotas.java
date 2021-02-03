import java.util.Scanner;

public class EjercicioNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1, n2, nf;
		Scanner sc = new Scanner(System.in);

		System.out.println("Que nota tienes en el primer examen:");
		n1 = Double.parseDouble(sc.nextLine());

		System.out.println("Que nota deseas sacar de media:");
		nf = Double.parseDouble(sc.nextLine());

		n2 = (nf - 0.4 * n1) / 0.6;
		System.out
				.println("Para tener un " + nf + " en el trimestre necesitas sacar un " + n2 + " en el segundo examen");
		sc.close();
	}

}
