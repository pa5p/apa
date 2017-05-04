package lista01.Exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

import custom.Exceptions.OutOfBoundsException;

public class Somatorios {

	/* Escreva um algoritmo que leia um limite natural n a partir do teclado e que calcule os
	 * somat�rios abaixo. O algoritmo deve imprimir cada termo e os resultados dos
	 * somat�rios. 
	 */

	static Scanner entrada = new Scanner(System.in);
	private int limite;

	public Somatorios(){

		this.leituraLimite();
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void somatorioA(){

		int soma = 0;

		for (int i = 0; i < this.limite; i++){

			soma += i;
			System.out.print("\nEtapa: " + (i+1) + " Soma: " + soma);
		}
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void somatorioB(){

		int soma = 0;

		for (int i = 0; i < this.limite; i++){

			soma += i + 5;
			System.out.print("\nEtapa: " + (i+1) + " Soma: " + soma);
		}
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void somatorioC(){

		double soma = 0;

		for (int i = 2; i < this.limite; i++){

			soma += (Math.pow(i-3, 2)) / (i-1);
			System.out.printf("\nEtapa: %d   Soma: %.2f", (i-1), soma);
		}
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void leituraLimite(){

		boolean repetir = true;

		while(repetir){

			try{

				System.out.print("\nInsira o limite natural do somatorio: ");
				limite = entrada.nextInt();

				if (limite < 1 || limite > 10000){
					throw new OutOfBoundsException();
				}

				repetir = false;
			}
			catch(OutOfBoundsException e){}
			catch(InputMismatchException e){ System.out.println("Voce inseriu um caractere incorreto."); entrada.next();}
			catch(Exception e){ e.printStackTrace();}
		}
	}
}