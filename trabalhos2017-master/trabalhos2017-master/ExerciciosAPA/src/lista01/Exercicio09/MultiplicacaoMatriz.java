package lista01.Exercicio09;

import custom.Objects.MatrizInt;

public class MultiplicacaoMatriz {

	/*
	 * Escreva um algoritmo que preencha uma matriz 4 x 4 com n�meros reais gerados
	 * randomicamente. O algoritmo deve apresentar o resultado da multiplica��o da primeira
	 * matriz pela segunda.
	 */

	private MatrizInt primeiraMatriz, segundaMatriz;

	public MultiplicacaoMatriz(int tamanho){

		this.primeiraMatriz = new MatrizInt(tamanho);
		this.primeiraMatriz.preencherAleatorio(200);

		this.segundaMatriz = new MatrizInt(tamanho);
		this.segundaMatriz.preencherAleatorio(200);		

		/*
		System.out.println("\nA primeira matriz gerada �:\n");
		printMatriz(primeiraMatriz);
		System.out.println("\nA segunda matriz gerada �:\n");
		printMatriz(segundaMatriz);
		 */
	}

	public MultiplicacaoMatriz(int[][] matriz1, int[][] matriz2){

		this.primeiraMatriz = new MatrizInt(matriz1);
		this.segundaMatriz = new MatrizInt(matriz2);		
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void prodMatriz(){

		int[][] matrizResultado = new int[this.primeiraMatriz.getTamanhoMatriz()][this.segundaMatriz.getTamanhoMatriz()];

		for (int k = 0; k < this.segundaMatriz.getTamanhoMatriz(); k++){
			for (int i = 0; i < this.primeiraMatriz.getTamanhoMatriz(); i ++){
				for (int j = 0; j < this.segundaMatriz.getTamanhoMatriz(); j++){

					matrizResultado[i][k] += this.primeiraMatriz.getValor(i, j) * this.segundaMatriz.getValor(j, k);
				}
			}
		}

		System.out.println("\nA matriz produto gerada �:\n");
		MatrizInt.printMatriz(matrizResultado);
	}


	/*<--------------------------------------------------------------------------------------->*/


	public MatrizInt getPrimeiraMatrizInt() {

		return this.primeiraMatriz;
	}

	public MatrizInt getSegundaMatrizInt() {

		return this.segundaMatriz;
	}


	/*<--------------------------------------------------------------------------------------->*/

}