import java.util.Scanner;
public class num28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);

		System.out.print("informe uma temperatura : ");
		float temp1 = entrada.nextFloat ();

		System.out.print("informe mais uma temperatura : ");
		float temp2 = entrada.nextFloat ();

		System.out.print("informe mais uma temperatura : ");
		float temp3 = entrada.nextFloat ();

		float media = ((temp1+temp2+temp3)/3);
		
		if ((temp1>temp2)&&(temp1>temp3)) {
			System.out.println("A maior temperatura é : " + temp1);

		} else if ((temp2>temp1)&&(temp2>temp3)) {
			System.out.println("A maior temperatura é : " + temp2);

		}else { 
			System.out.println("A maior temperatura é : " + temp3);
		}
		
		System.out.println("Média das tempetaturas : " + media);

		entrada.close();
	}
}
