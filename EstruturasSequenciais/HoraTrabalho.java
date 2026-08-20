/*A empresa Hipothelicus paga R$ 10,00 por hora normal trabalhada, e
R$ 15,00 por hora extra. Faça um programa em Linguagem Java, para
calcular e imprimir o salário bruto e o salário líquido do funcionário.
Considere que o salário líquido do funcionário é igual ao salário bruto
descontado 10 % de impostos. */

import java.util.Scanner;

public class HoraTrabalho{
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        float liquido, bruto;

        System.out.println("Digite quantas hora(s) normais trabalhadas:");
        float horaNormal = leitor.nextFloat();

        System.out.println("Digite a(s) hora(s) extras trabalhadas: ");
        float extra = leitor.nextFloat();

        bruto = (horaNormal*10.00f)+ (extra*15.00f);

        liquido = bruto -(bruto*0.10f);

        System.out.println("Salário do funcionário");
        System.out.println("Salário bruto: R$ "+bruto);
        System.out.println("Salário líquido: R$ "+liquido);

    }
}