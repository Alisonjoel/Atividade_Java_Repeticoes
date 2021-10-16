import java.util.Scanner;
public class num16	 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro numero : ");
		int num1 = entrada.nextInt();

		System.out.print("Digite o segundo numero : ");
		int num2 = entrada.nextInt();

		if (num1 > num2) {
			System.out.println("o maior numero é : " + num1);
		} else {
			System.out.println("o maior numero é : " + num2);
		}
		int soma = (num1+num2);
		System.out.println("Soma dos valores : " + soma);
		entrada.close();
	}
}