import java.util.Scanner;
public class num20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);

	
		System.out.println("Nota 1");
		int idade1 = entrada.nextInt ();
		
		System.out.println("Nota 2");
		int idade2 = entrada.nextInt ();
		
		System.out.println("Nota 3");
		int idade3 = entrada.nextInt ();
		
		
		
		float media = ((idade1+idade2+idade3) / 3);
		
		
		
		System.out.println("Média : " + media);
		
		entrada.close();
	}
}	