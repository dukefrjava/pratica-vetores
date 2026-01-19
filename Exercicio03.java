import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Entre uma palavra para ser invertida: ");
			String palavra = scanner.nextLine();
		
			char[] palavraSeparada = palavra.toCharArray();
		
		System.out.println("VETOR INVERTIDO");
		Inverter(palavraSeparada);
		scanner.close();
	}
	
	public static void Inverter(char[] palavra) {
		int j = 0;
		char[] vetorInvertido = new char[palavra.length];
		
		for (int i = palavra.length - 1; i >= 0; i--) {
			vetorInvertido[j] = palavra[i]; 
			j++;
		}
		
		Imprimir(vetorInvertido);
	}
	
	public static void Imprimir(char[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
		}
		System.out.println();
	}
}