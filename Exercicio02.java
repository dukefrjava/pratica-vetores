import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Entre um número: ");
			vetor[i] = scanner.nextInt();
		}
		
		System.out.println("VETOR RECEBIDO");
		Imprimir(vetor);
		System.out.println("VETOR DEVOLVIDO");
		PercorreVetor(vetor);
		
		scanner.close();
	}
	
	public static void PercorreVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				vetor[i] = vetor[i] * 2;
			} else {
				vetor[i] = (int) Math.pow(vetor[i], 2);
			}
		}
		Imprimir(vetor);
	}
	
	public static void Imprimir(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}
}