package lista01.Exercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

import custom.Exceptions.OutOfBoundsException;

public class Produtorios {

	/*Escreva um algoritmo que leia um limite natural n a partir do teclado e que calcule os
	 * produt�rios abaixo. O algoritmo deve imprimir cada termo e os resultados dos
	 * produt�rios.
	 */

	static Scanner entrada = new Scanner(System.in);
	private int limite;


	public Produtorios(){

		this.leituraLimite();
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void produtorioA(){

		int produto = 1;

		for (int i = 1; i <= this.limite; i++){

			produto *= i;
			System.out.print("\nEtapa: " + (i-1) + " Produto: " + produto);
		}
	}


	/*<--------------------------------------------------------------------------------------->*/


	public void produtorioB(){

		double produto = 1;

		for (int i = 0; i <= this.limite; i++){

			produto *= i + 12;
			System.out.print("\nEtapa: " + (i) + " Produto: " + produto);
		}
	}


	/*<--------------------------------------------------------------------------------------->*/

	public void produtorioC(){

		double produto = 1;

		for (int i = 3; i <= this.limite; i++){

			produto *= Math.pow(i/3, 4) / (i-2);
			System.out.print("\nEtapa: " + (i-3) + " Produto: " + produto);
		}

	}

	/*<--------------------------------------------------------------------------------------->*/


	public void leituraLimite(){

		boolean repetir = true;

		while(repetir){

			try{

				System.out.print("\nInsira o limite natural do produtorio: ");
				this.limite = entrada.nextInt();

				if (this.limite < 1 || this.limite > 10000){
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