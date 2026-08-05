//Faça um programa em Linguagem Java, para ler um número inteiro e
//escreva o seu cubo.

import java.util.Scanner;

public class cubo {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner ler = new Scanner(System.in);

        int num, cubo;

        System.out.println("Digite um numero: ");
        num = ler.nextInt();

        cubo = num*num*num;

        System.out.printf("CUbo = %d\n", cubo);
       }
}
