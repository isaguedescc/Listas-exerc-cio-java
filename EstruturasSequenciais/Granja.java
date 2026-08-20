/*.A Granja Frangotech possui um controle automatizado de cada frango
de sua produção. No pé direito do frango há um anel com um chip de
identificação; no pé esquerdo são dois anéis para indicar o tipo de
alimento que ele deve consumir. Sabendo que o anel com chip custa
R$ 4,00 e o anel de alimento custa R$ 3,50. Faça um programa em
Linguagem Java, para calcular o gasto total da granja para marcar
todos os seus frangos. */
import java.util.Scanner;

public class Granja {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int  granja;
        float total, anelAlimento = 3.50f, anelChip = 4.00f;

        System.out.println("Digite a quantidade  de frangos na granja:   ");
        granja = leitor.nextInt();

        total = (granja*anelChip) + ((granja*anelAlimento)*2);

        System.out.println("O gasto para marcar todos os frangos é de R$ "+total);
       
    }
}
