import java.util.Scanner;
public class num11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont;
		int par = 0;
		int impar = 0;

		Scanner entrada = new Scanner (System.in);

			for (cont = 0; cont<=9; cont++) {

				System.out.println("Informe o numero");
				int k = entrada.nextInt();

				if (k % 2 == 0) {
					par++; 
				}
				else {
					impar++;
				}

				if (cont == 9) {
					System.out.println("Quantidade de numeros pares : " + par);
					System.out.println("Quantidade de numeros impares : " + impar);
				}
			}
		}
	}