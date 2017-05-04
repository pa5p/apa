package lista02.Exercicio03;

import java.security.SecureRandom;

public class Exercicio03 {

	/*Escreva um algoritmo em Java que instancie uma matriz N x N. O algoritmo deve preencher
	 * 	todas as posi��es da Matriz com n�meros rand�micos. Crie um contador para contabilizar o
	 * 	n�mero de valores inseridos na Matriz. Ao final da execu��o, o algoritmo deve imprimir o valor
	 * 	de N seguido do valor do contador. Em seguida, repita o experimento com matrizes de tamanho
	 * 	100, 1.000, 10.000, 100.000 e 1.000.000. Construa um gr�fico "Tamanho do Vetor (N)" X
	 * 	"N�mero de Opera��es (OP)" no Excel.
	 */

	private int[][] matrizNumeros;
	private int contador;


	public Exercicio03(int tamanho){

		this.matrizNumeros = new int[tamanho][tamanho];
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void preencherMatriz(){

		SecureRandom aleatorio = new SecureRandom();
		this.contador = 0;

		for (int i = 0; i < this.matrizNumeros.length; i ++){
			for (int j = 0; j < this.matrizNumeros.length; j ++){

				this.matrizNumeros[i][j] = aleatorio.nextInt(1000);
				this.contador++;
			}	
		}
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void printResultado(){

		System.out.println("\nTamanho da matriz: " + this.matrizNumeros.length);
		System.out.println("Valor do contador: " + this.contador);
	}
}