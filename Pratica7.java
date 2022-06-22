package lista_monitoria;

import java.util.Scanner;

public class Pratica7 {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia dois valores inteiros (X e Y) e apresente o resultado do
quadrado da soma dos valores lidos.*/
		
		Scanner input = new Scanner(System.in); 
		//Declarando variáveis 
		int x, y, soma, raiz; 
		//Impressão
		System.out.println("Informe dois valores interios para X e Y: ");
		//Obter váriável 
		x = input.nextInt(); 
		y = input.nextInt(); 
		
		//Calcular x e y e utilizar a biblioteca math para a raiz quadrada 
		soma = x + y; 
		raiz = (int) Math.sqrt(soma); 
		
		System.out.println("O valor da sua soma é: " + soma + " e o valor da raiz é: " + raiz);
		
	}

}
