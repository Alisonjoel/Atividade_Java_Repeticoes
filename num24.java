import java.util.Scanner;
public class num24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);

		System.out.println("Quantidade de CDs : ");
		int qcd = entrada.nextInt ();

		System.out.print("Valor unit�rio : ");
		float vu = entrada.nextFloat ();

		float media = (qcd/vu);
		float total = (qcd*vu);
		
		System.out.println("Valor m�dio : " + media);
		System.out.println("Total ivestido : " + total);
		entrada.close();
	}	
}
