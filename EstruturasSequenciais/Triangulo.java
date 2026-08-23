import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int a = ler.nextInt();

        System.out.println("Digite um número inteiro: ");
        int b = ler.nextInt();

        System.out.println("Digite um número inteiro: ");
        int c = ler.nextInt();

        if(a+b > c && a+c> b && b+c > a){
            System.out.println(a+", "+b+" e " + c + " podem ser lados de um triângulo!");
        }


    }
}
