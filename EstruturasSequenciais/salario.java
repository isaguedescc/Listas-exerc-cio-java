// Faça um programa em Linguagem Java, para ler dois valores reais e
// exibir o primeiro com acréscimo de 30%, e o segundo com desconto
// de 25%.

import java.util.Scanner;

class salario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valor1, valor2, acresc1, desc;

        System.out.println("Digite um salario: ");
        valor1 = ler.nextDouble();

        System.out.println("Digite o segundo salario: ");
        valor2 = ler.nextDouble();

        acresc1 = (0.3*valor1) + valor1;
        desc = valor2 - (0.25*valor2);

        System.out.println("SALARIO COM ACRESCIMO: "+ acresc1);
        System.out.println("SALARIO COM DESCONTO: "+ desc);
    }
}
