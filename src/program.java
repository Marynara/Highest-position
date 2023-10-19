import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int n, posmaior;
		
		double maior;
		
		System.out.print("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		
		double [] vet = new double [n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero:");
			vet[i] =sc.nextDouble();
		}
		maior= vet [0];
		posmaior =0;
		
		for (int i=1; i<n; i++) {
			if (vet [i] > maior) {
			maior= vet [i];
			posmaior = i;
		}
		}
		System.out.printf ("Maior Valor = %.1f\n",maior);
		System.out.printf ("Posicao do Maior Valor = %d\n", posmaior);
		
		sc.close();
	}

}
