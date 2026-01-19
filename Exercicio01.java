import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] vetor = new double[5];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Entre um número: ");
			vetor[i] = scanner.nextDouble();
		}
		
		System.out.println("VETOR ANTES DA ORDENAÇÃO");
		Imprimir(vetor);
		System.out.println("VETOR DEPOIS DA ORDENAÇÃO");
		BubbleSort(vetor);
	}
	
	public static void BubbleSort(double[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i; j < vetor.length; j++) {
				if(vetor[i] > vetor[j]) {
					double aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
		Imprimir(vetor);
	}
	
	public static void Imprimir(double[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}
}