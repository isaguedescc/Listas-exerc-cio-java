package EstruturasSelecao;
/* Faça um programa em Linguagem Java, para ler o sexo de uma pessoa
(“M” ou “F”) e exibir a mensagem (“MASCULINO” ou
FEMININO)”. Assuma somente entrada válida.*/

import java.util.Scanner;

public class EleouEla {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char sexo;

        System.out.println("Digite F(feminino) ou M(masculino) para o sexo: ");
        sexo = leitor.next().charAt(0);

        if (sexo == 'F' || sexo == 'f') {
            System.out.println("FEMININO");
        }else{
            System.out.println("MASCULINO");
        }
        }


    }

