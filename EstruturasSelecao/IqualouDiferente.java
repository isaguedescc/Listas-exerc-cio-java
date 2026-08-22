package EstruturasSelecao;
/* 53.Faça um programa em Linguagem Java, para ler dois números e
imprimir uma mensagem dizendo se são iguais ou diferentes.*/

import java.util.Scanner;

public class IqualouDiferente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int n1 = ler.nextInt();

        System.out.println("Digite outro numero: ");
        int n2 = ler.nextInt();

        if (n1 == n2) {
            System.out.println("São iguais!");
        }else{
            System.out.println("Sao diferentes");
        }
    }
}
