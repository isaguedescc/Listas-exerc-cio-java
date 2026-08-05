//Faça um programa em Linguagem Java, para ler um número inteiro e
//mostrar ele na tela.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner ler = new Scanner(System.in);
        int num; 
        
        System.out.println("Informe um numero: ");
        num = ler.nextInt();
        
        System.out.printf("%d \n", num);
    }
}