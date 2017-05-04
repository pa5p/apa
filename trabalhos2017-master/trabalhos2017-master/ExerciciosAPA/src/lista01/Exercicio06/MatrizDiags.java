package lista01.Exercicio06;

import custom.Objects.MatrizInt;

public class MatrizDiags {

	/* 
	 * Escreva um algoritmo que preencha uma matriz 10 x 10 com n�meros reais gerados
	 * randomicamente. O algoritmo deve apresentar os elementos da diagonal principal e da
	 * diagonal secund�ria da matriz. Exemplo:
	 */

	private MatrizInt matrizNumeros;

	public MatrizDiags(int tamanho){

		this.matrizNumeros = new MatrizInt(tamanho);
		this.matrizNumeros.preencherAleatorio(200);
	}

	public MatrizDiags(int[][] matriz){

		this.matrizNumeros = new MatrizInt(matriz);
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void diagPri(){

		System.out.print("\nOs valores da diagonal principal s�o: ");

		for (int i = 0; i < this.matrizNumeros.getTamanhoMatriz() -1; i++){

			System.out.print(this.matrizNumeros.getValor(i, i) + ", ");
		}	

		System.out.print(this.matrizNumeros.getValor(this.matrizNumeros.getTamanhoMatriz() - 1, this.matrizNumeros.getTamanhoMatriz() - 1) + ".");
	}


	public static void diagPri(int[][] matriz){

		int tamanho = matriz.length;

		System.out.print("\nOs valores da diagonal principal s�o: ");

		for (int i = 0; i < tamanho -1; i++){

			System.out.print(matriz[i][i] + ", ");
		}	

		System.out.print(matriz[tamanho -1][tamanho -1] + ".");
	}

	/*<--------------------------------------------------------------------------------------->*/


	public void diagSec(){

		System.out.print("\nOs valores da diagonal secundaria s�o: ");

		for (int i = 0; i < this.matrizNumeros.getTamanhoMatriz() - 1; i++){

			System.out.print(this.matrizNumeros.getValor(i, this.matrizNumeros.getTamanhoMatriz() - i - 1) + ", ");
		}

		System.out.print(this.matrizNumeros.getValor(this.matrizNumeros.getTamanhoMatriz() - 1, 0) + ".");
	}	



	public static void diagSec(int[][] matriz){

		int tamanho = matriz.length;

		System.out.print("\nOs valores da diagonal secundaria s�o: ");

		for (int i = 0; i < tamanho - 1; i++){

			System.out.print(matriz[i][tamanho - i - 1] + ", ");
		}

		System.out.print(matriz[tamanho - 1][0] + ".");
	}


	/*<--------------------------------------------------------------------------------------->*/


	public MatrizInt getMatrizInt() {

		return this.matrizNumeros;
	}


	/*<--------------------------------------------------------------------------------------->*/

}