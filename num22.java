import java.util.Scanner;
public class num22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);


		System.out.println(" Vote para presidente |1 - Amauri | 2 - Samp| 3 - Arnaldo|");
		int voto1 = entrada.nextInt ();

		System.out.println(" Vote para presidente |1 - Amauri | 2 - Samp| 3 - Arnaldo|");
		int voto2 = entrada.nextInt ();

		System.out.println(" Vote para presidente |1 - Amauri | 2 - Samp| 3 - Arnaldo|");
		int voto3 = entrada.nextInt ();

		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;

		if (voto1 == 1) {
			cont1 = cont1+1;

		} else if (voto1==2){
			cont2 = cont2+1;

		} else {
			cont3 = cont2+1;
		}

		

		if (voto2 == 1) {
			cont1 = cont1+1;

		} else if (voto2==2){
			cont2 = cont2+1;

		} else {
			cont3 = cont2+1;
		}



		
		if (voto3 == 1) {
			cont1 = cont1+1;

		} else if (voto3==2){
			cont2 = cont2+1;

		} else {
			cont3 = cont3+1;
		}
		
		System.out.println("----------------");
		System.out.println("Numero total de votantes : " + 3);
		System.out.println("Votos 1º candidato : " + cont1);
		System.out.println("Votos 2º candidato : " + cont2);
		System.out.println("Votos 3º candidato : " + cont3);
		
		entrada.close();
	}
}	