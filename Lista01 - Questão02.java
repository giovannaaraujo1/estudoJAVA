//Lista 01 - Questão 02
//Escreva um programa que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	//Declaração de variáveis:
	int a, b, c;
	Scanner dado;
	dado = new Scanner (System.in);
	
	//Atribuição de valores:
	
	System.out.println ("Digite um valor para A:");
	a = dado.nextInt();
	System.out.println ("Digite um valor para B:");
	b = dado.nextInt();
	System.out.println ("Digite um valor para C");
	c= dado.nextInt();
	
	
	//Rodando o programa:
	
	if (a+b<c){
	   System.out.println("A soma de A e B é menor do que C.");
	}
	else {
	    System.out.println ("A soma de A e B é maior do que C.");
	}
	}
}