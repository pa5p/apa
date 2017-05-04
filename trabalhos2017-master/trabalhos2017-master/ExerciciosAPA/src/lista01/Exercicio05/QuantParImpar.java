package lista01.Exercicio05;

import custom.Objects.VetorInt;

public class QuantParImpar {

	/*
	 *  Escreva um algoritmo que preencha um vetor de 10 posi��es com n�meros inteiros
	 * gerados randomicamente. O algoritmo deve apresentar a quantidade de n�meros pares 
	 * e a quantidade de n�meros �mpares armazenados no vetor.
	 */

	private VetorInt vetorNumeros;

	public QuantParImpar(int tamanho){

		this.vetorNumeros = new VetorInt(tamanho);
		this.vetorNumeros.preencherAleatorio(200);
	}


	public QuantParImpar(int[] vetor){

		this.vetorNumeros = new VetorInt(vetor);
	}

	/*<--------------------------------------------------------------------------------------->*/


	public void countParImpar(){

		int par = 0, impar = 0;

		for (int i = 0; i < this.vetorNumeros.getTamanhoVetor(); i++){

			if (this.vetorNumeros.getValor(i) % 2 == 0){
				
				par ++;
			}
			else impar ++;
		}

		System.out.println("\nO vetor possui " + par + " numeros pares e " + impar + " numeros impares.");
	}


	/*<--------------------------------------------------------------------------------------->*/


	public VetorInt getVetorInt() {

		return this.vetorNumeros;
	}


	/*<--------------------------------------------------------------------------------------->*/
}