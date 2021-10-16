import java.util.Scanner;

public class num29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);

		System.out.print("Informe a tabuada: ");
		int tabuada = entrada.nextInt();

		System.out.print	("Começa: ");
		int com = entrada.nextInt();

		System.out.print("Termina: ");
		int ter = entrada.nextInt();
	
		System.out.println("--------------");

		if (com < ter) {

			for (int i = com; i <=ter; i++) {
				System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
			}
		} else {
			System.out.println("Numero que termina maior que numero de começo, reinicie o programa e digite novamente");
		}
		entrada.close();
	}	
}