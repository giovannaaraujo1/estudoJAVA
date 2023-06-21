//LISTA 01 - QUESTÃO 1

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    //DECLARAÇÃO DE VÁRIAVEIS
	    int x, res;
	    Scanner dado;
	    dado = new Scanner (System.in);
	    //ATRIBUIÇÃO DE VALORES
	    
	    //Programa para saber se o número é impar ou par:
	    
	    System.out.println("Digite um número inteiro.");
	    x = dado.nextInt();
	   
	    
	    //ATRIBUIÇÃO DE VALORES
	    res = x %2;
	    
	   
	    if (res == 0){
	        System.out.println("O número digitado é par.");
	    } 
	    
	    if (res == 1){
	        System.out.println("O número digitado é impar.");
	    }
	   
	    
	    
		
	}
}
