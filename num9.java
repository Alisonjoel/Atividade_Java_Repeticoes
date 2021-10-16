import java.util.Scanner;
public class num9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);

		System.out.println("Informe a tabuada: ");
		int tabuada = entrada.nextInt();
		System.out.println("--------------");

		int i;

		for (i = 0; i <=10; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}
	}
}	
