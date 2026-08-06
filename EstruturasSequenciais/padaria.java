/*A padaria Hotpão vende uma certa quantidade de pães franceses e
uma quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a
broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto
arrecadou com a venda dos pães e broas(juntos), e quanto deve
guardar em uma poupança (10% do arrecadado). Você foi contratado
para fazer os cálculos para o dono. Com base nestes fatos, faça um
programa em Linguagem Java, para ler as quantidades de pães e de
broas, e depois calcular e mostrar os dados solicitados. */

import java.util.Scanner;

public class padaria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float paes, broas, total, poupanca;
        float Vpao = 0.12f, Vbroa= 1.5f;

        System.out.println("Quantos paes foram vendidos: ");
        paes = ler.nextFloat();

        System.out.println("Quantas broas foram vendidas: ");
        broas =ler.nextFloat();

        total = (paes*Vpao) + (broas*Vbroa);
        poupanca = total*0.10f;

        System.out.println("TOTAL = "+total);
    System.out.println("POUPANCA = "+poupanca);


    }
}
