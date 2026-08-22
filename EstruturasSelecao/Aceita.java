package EstruturasSelecao;
/* 52.Faça um programa em Linguagem Java, para ler o nome, sexo (M ou
F) e a idade de uma pessoa. Se a pessoa for do sexo feminino e tiver
menos que 25 anos, imprimir o nome da pessoa e a mensagem
“ACEITA”. Caso Contrário, imprimir o nome da pessoa e a mensagem
“NÃO ACEITA”. (Considerar f ou F).*/
import java.util.Scanner;

public class Aceita {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = ler.next();

        System.out.println("Digite seu sexo(F ou M): ");
        char sexo = ler.next().charAt(0);

        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();

        if (sexo =='F' || sexo == 'f' && idade<25) {
            System.out.println(nome+" ACEITA");
        }else{
            System.out.println(nome+" NAO ACEITA");
        }
    }
}
