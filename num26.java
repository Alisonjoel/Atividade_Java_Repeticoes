import java.util.Scanner;
public class num26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);

		System.out.print("Quantidade de produtos : ");
		int qtd = entrada.nextInt ();

		System.out.print("Valor unit�rio : ");
		float vlu = entrada.nextFloat ();

		int i = 0;

		//		for (i = 0; i <=10; i++)
		for (i = 0; i <= qtd; i++) {
			System.out.println("-------");
			System.out.println("Q - " + i +" "+ "Valor - " + i*vlu);
		}
		entrada.close();
	}
}