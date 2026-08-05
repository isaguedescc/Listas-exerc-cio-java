//Faça um programa em Linguagem Java, para ler um valor em reais e
//exibir o equivalente em dólares. Considere que um dólar vale R$ 5.50.

import java.util.Scanner;

public class Real {
     public static void main(String[] args){
    @SuppressWarnings("resource")
	Scanner ler = new Scanner(System.in);

    double real;

    System.out.println("Digite um numero real: ");
    real = ler.nextDouble();

    System.out.println("Numero: "+ real);
     }
}
