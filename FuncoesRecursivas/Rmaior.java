package FuncoesRecursivas;
/*Faça uma função em Linguagem Java que receba por parâmetro
dois números e retorne o maior deles. */
import java.math.*;
public class Rmaior {
    public static int Maior(int num1, int num2){
        return Math.max(num1, num2);
    }
    public static void main(String[] args) {
        int num1=9;
        int num2=89;

        int maior = Maior(num1, num2);

        System.out.println("O maior número é: "+maior);
    }
}
