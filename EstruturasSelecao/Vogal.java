package EstruturasSelecao;
/*Faça um programa em Linguagem Java, para ler uma letra e imprimir
a mensagem “É UMA VOGAL” se condizente. Assume que as letras
são sempre maiúsculas. */

import java.util.Scanner;

public class Vogal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char letra;
        System.out.println("digite uma letra: ");
        letra = leitor.next().charAt(0);

        if (letra == 'A' || letra == 'E' || letra=='I' || letra == 'O' || letra == 'U' ) {
            System.out.println("É UMA VOGAL");
        }
    }
}
