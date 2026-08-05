// Faça um programa em Linguagem Java, para ler dois números,
// calcular e mostrar a soma desses números.

import java.util.Scanner;

class soma{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Digite um numero: ");
        a = ler.nextInt();

        System.out.println("Digite um numero: ");
        b = ler.nextInt();

        soma = a + b;

        System.out.printf("Soma = %d\n", soma);
    }
}