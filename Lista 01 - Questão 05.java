//lista 01 - Questão 05
//Faça um programa que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar. Imprimir o resultado desta operação.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    //Declaração de váriaveis
	    int a;
	    Scanner dado;
        dado = new Scanner (System.in);
        
        //Atribuição de valores
        System.out.println ("Digite um valor:");
         a = dado.nextInt();
        
        //RODANDO O PROGRAMA 
        
        if (a%2 == 0){
            System.out.println("Este número é par! Por conta disso, serão somados 5 números a mais sobre ele.");
            System.out.println ("Tornando seu total:"); 
            System.out.println (a+5);
        }
        
        if (a%2 == 1) {
            System.out.println ("Este número é impar!Serão somados 8 números a mais sobre ele.");
            System.out.println ("Tornando seu total:"); 
            System.out.println (a+8);
        }
        
        
        
        
        
        
        
        
    }
}