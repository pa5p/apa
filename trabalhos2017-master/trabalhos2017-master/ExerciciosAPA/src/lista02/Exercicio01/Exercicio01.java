package lista02.Exercicio01;

import java.security.SecureRandom;

public class Exercicio01 {

	/*Escreva um algoritmo em Java que instancie um vetor de 10 posi��es. O algoritmo deve
	 * preencher as 5 primeiras posi��es do vetor com n�meros rand�micos. Crie um contador para
	 * contabilizar o n�mero de valores inseridos no vetor. Ao final da execu��o, o algoritmo deve
	 * imprimir o tamanho do vetor seguido do valor do contador. Em seguida, repita o experimento
	 * com vetores de tamanho 100, 1.000, 10.000, 100.000 e 1.000.000. Construa um gr�fico
	 * "Tamanho do Vetor (N)" X "N�mero de Opera��es (OP)" no Excel.
	 * */

	private int[] vetorNumeros;
	private int tamanhoVetor = 0;
	private int contador = 0;

	public Exercicio01(int tamanho){

		this.tamanhoVetor = tamanho;
		this.vetorNumeros = new int[tamanho];
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void preencherVetor(){

		SecureRandom aleatorio = new SecureRandom();
		this.contador = 0;

		for (int i = 0; i < 5; i ++){

			this.vetorNumeros[i] = aleatorio.nextInt(1000);
			this.contador++;
		}	
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void printResultado(){

		System.out.println("\nTamanho do vetor:  " + this.tamanhoVetor);
		System.out.println("Valor do contador: " + this.contador + "\n");
	}
}