/*Faça um programa em Linguagem Java, para ler três notas de um
aluno em uma disciplina e imprimir a sua média ponderada (as notas
têm pesos 1, 2 e 3 respectivamente).*/

import java.util.Scanner;

public class mediaPonderada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float n1, n2, n3, media;
        int peso1 = 1, peso2 = 2, peso3 = 3;
        
        System.out.println("Digite a nota 1 do aluno: ");
        n1 = ler.nextFloat();

        System.out.println("Digite a nota 2 do aluno: ");
        n2 = ler.nextFloat();

        System.out.println("Digite a nota 3 do aluno: ");
        n3 = ler.nextFloat();

        media = (n1*peso1 + n2*peso2 + n3*peso3)/(peso1+peso2+peso3);

        System.out.println("Media ponderada do Aluno: "+ media);
    
    }
}
