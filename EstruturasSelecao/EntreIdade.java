package EstruturasSelecao;
/*Faça um programa em Linguagem Java, para ler a idade de uma
pessoa e exibir uma mensagem dizendo se ela está compreendida entre
18 e 65 anos.*/
import java.util.Scanner;

public class EntreIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        if(idade>18 && idade<65){
            System.out.println("Está entre 18 e 65 anos!");
        }else{
            System.out.println("Não está entre 18 e 65 anos!");
        }
    }
}
