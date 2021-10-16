import java.util.Scanner;
public class num23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);

		System.out.println("Numero de turmas");
		int numt = entrada.nextInt ();

		System.out.println("Numero de alunos por turma");
		int numa = entrada.nextInt ();

		float media = (numa/numt);

		if (media<=40) {
			System.out.println("Turma OK");
		}
		else {
			System.out.println("Superlotação de alunos");
		}
		entrada.close();
	}	
}