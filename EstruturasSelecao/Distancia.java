package EstruturasSelecao;
/*Faça um programa em Linguagem Java, para ler a distância (km) e o
tempo de viagem (horas) de um automóvel, e dizer se a velocidade
média for superior ao limite (110 km/h) ou não. */
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double km, media;
        int  horas;
        System.out.println("Digite a distância percorrida: ");
        km = leitor.nextDouble();

        System.out.println("Digite o tempo da viagem em horas:(somente horas completas) ");
        horas = leitor.nextInt();
        
        media = km/horas;

        if (media >110) {
            System.out.println("Velocidade media superior ao limite");
        }
    
    }
}
