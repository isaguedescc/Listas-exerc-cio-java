package EstruturasSelecao;
/* Faça um programa em Linguagem Java, que leia a idade de uma
pessoa e escrever a mensagem ‘Você é maior de idade’ se ele tiver 18
anos ou mais, ou ‘Você é menor de idade’ caso contrário.*/
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        if(idade>=18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }
    }
}
