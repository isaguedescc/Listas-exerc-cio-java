package EstruturasSelecao;
/* Faça um programa em Linguagem Java, para ler a temperatura de uma
pessoa e exibir a mensagem “ESTÁ COM FEBRE” ou “NÃO ESTÁ
COM FEBRE”. Considere o valor da base como 36.5*/

import java.util.Scanner;
public class Febre {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double temperatura;

        System.out.println("Digite sua temperatura: ");
        temperatura = leitor.nextDouble();

        if(temperatura >=36.5){
            System.out.println("Estar com febre!");
        }else{
            System.out.println("Não está com febre!");
        }

    }
}
