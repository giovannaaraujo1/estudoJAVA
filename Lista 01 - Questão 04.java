//Lista 01 - Questão 04
//Faça um programa para encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.


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
        
        //Rodando o programa
        
        if (a>0) {
            System.out.println ("O número é positivo, seu dobro é:");
            System.out.println (a*2);
        }
        if(a<=0){
            System.out.println ("O número é negativo, seu triplo é:");
            System.out.println (a*3);
        }
        
	    
	   
	    
	}
}