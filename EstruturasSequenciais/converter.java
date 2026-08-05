// Faça um programa em Linguagem Java, para ler um valor em reais e
//exibir o equivalente em dólares. Considere que um dólar vale R$ 5.50.

import java.util.Scanner;

class converter {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double real, dolar;

        System.out.println("Digite um valor em reais: ");
        real = ler.nextDouble();

        dolar = real*5.5;

        System.out.println("DOLAR = "+ dolar);
    }    
}
