/* A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um
programa em Linguagem Java, para ler as dimensões e depois exibir a
área do terreno.*/
import java.util.Scanner;
class arearetan {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        java.util.Scanner ler = new Scanner(System.in);

        float b, h, A;

        System.out.println("Digite o valor da comprimento do terreno: ");
        b = ler.nextFloat();

        System.out.println("Digite o valor da largura do terreno: ");
        h = ler.nextFloat();

        A = b*h;

        System.out.println("AREA DO TERRENO = "+ A);
    }
}