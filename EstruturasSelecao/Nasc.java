package EstruturasSelecao;
/*.Faça um programa em Linguagem Java, para ler o ano de nascimento
de uma pessoa e escrever uma mensagem que diga se ele poderá ou
não votar na eleição municipal de 2022. (Não é necessário considerar
o mês em que nasceu). */

import java.util.Scanner;

public class Nasc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int ano = leitor.nextInt();

        // considerando que a idade mínima para votar é 16 anos
        if(2022 - ano == 16){
            System.out.println("Você poderá votar nas eleições.");
        }else{
            System.out.println("Você não poderá votar nas eleições.");
        }
    }
}
