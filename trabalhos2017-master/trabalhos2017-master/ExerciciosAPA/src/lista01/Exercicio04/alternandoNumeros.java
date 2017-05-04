package lista01.Exercicio04;

import custom.Objects.VetorInt;

public class alternandoNumeros {

	/*
	 * Escreva um algoritmo que preencha um vetor de 10 posi��es com n�meros inteiros
	 * gerados randomicamente. O algoritmo deve trocar o elemento da primeira posi��o do
	 * vetor com o elemento da �ltima posi��o do vetor. O algoritmo deve imprimir os
	 * n�meros da primeira e da �ltima posi��o do vetor antes e ap�s a troca.
	 */

	private VetorInt vetorNumeros;

	public alternandoNumeros(int tamanho){

		this.vetorNumeros = new VetorInt(tamanho);
		this.vetorNumeros.preencherAleatorio(200);
	}


	public alternandoNumeros(int[] vetor){

		this.vetorNumeros = new VetorInt(vetor);
	}

	/*<--------------------------------------------------------------------------------------->*/


	public void flipFlop(){

		int auxiliar = this.vetorNumeros.getValor(0);

		System.out.println("\nAlternando o primeiro e o ultimo numeros");		

		this.vetorNumeros.setValor(0, this.vetorNumeros.getValor(this.vetorNumeros.getTamanhoVetor() - 1));
		this.vetorNumeros.setValor(this.vetorNumeros.getTamanhoVetor() - 1, auxiliar);
	}


	/*<--------------------------------------------------------------------------------------->*/


	public VetorInt getVetorInt() {

		return this.vetorNumeros;
	}


	/*<--------------------------------------------------------------------------------------->*/
}