import java.util.Scanner;
public class num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in);

		boolean logico = true;
		
		while (logico == true) {
			
			System.out.print("Informe uma nota :");
			int nota = entrada.nextInt();

			if ((nota>=0) && (nota <=10)) {
				System.out.println("Ok, nota válida");
				logico = false;
				
			} else {
				System.out.println("Nota inválida");
				System.out.println("-----------------");
			}
		}
	}
}

