// Faça um programa em Linguagem Java, que mostre na tela a frase o
// seu nome.

import java.util.Scanner;

public class nome {
    public static void main(String[] args){
       Scanner ler = new Scanner (System.in);
       String nome;
         System.out.println("Digite seu nome: ");
         nome = ler.nextLine();

         System.out.printf("%s\n", nome);

    }
}
