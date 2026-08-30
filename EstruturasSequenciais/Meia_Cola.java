/* 26.A fábrica de refrigerantes Meia-Cola vende seu produto em três
formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se
um comerciante compra uma determinada quantidade de cada
formato, faça um programa em Linguagem Java, para calcular quantos
litros de refrigerante ele comprou ao todo.*/
import java.util.Scanner;

public class Meia_Cola{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int lata = 350, gar6=600, gar2L = 2000;
        int quantLata, quantGar6, quant2L;
        int totalLitros;

        System.out.println("Digite quantas latas compradas : ");
        quantLata = ler.nextInt();
        System.out.println("Digite quantas garrafas de 600mL foram compradas: ");
        quantGar6 = ler.nextInt();
        System.out.println("Digite quantas garrafas de 2L foram compradas: ");
        quant2L = ler.nextInt();

        totalLitros = (quant2L*gar2L + quantGar6*gar6 + quantLata*lata)/1000;
        
        System.out.println("Foram comprados "+totalLitros+" Litros");
    }
}