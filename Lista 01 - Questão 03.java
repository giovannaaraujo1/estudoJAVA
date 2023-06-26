import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
//Declaração de variáveis: 

    int a,b,c;
    Scanner dado;
    dado = new Scanner (System.in);
    
//Atribuição de valor: 

    System.out.println("Digite um valor para A: ");
    a = dado.nextInt();
    
    System.out.println ("Digite o valor para B: ");
    b = dado.nextInt();
    
    
//Rodando o programa: 
    
    
       if (a==b){
       System.out.println ("Os valores são iguais, portanto sua soma é de:");
       System.out.println (c = a + b);
	}
	
	   else{
	       System.out.println ("Os valores são diferentes, portanto sua multiplicação é de:");
	       System.out.println (c = a * b);
	   }
	   
	  
}
}

