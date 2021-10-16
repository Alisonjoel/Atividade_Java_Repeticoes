import java.util.Scanner;
public class num2	 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean logico = true;

		Scanner entrada = new Scanner(System.in);

		while (logico == true) {

			System.out.print("Informe o nome :");
			String nome = entrada.next();

			System.out.print("Informe a senha :");
			String senha = entrada.next();

			if (nome == senha) {
				System.out.println("Dados inválidos");
				System.out.println("-----------------");

			} else {
				System.out.println("Dados válidos");
				logico = false;
			}
		}
		entrada.close();
	}
}