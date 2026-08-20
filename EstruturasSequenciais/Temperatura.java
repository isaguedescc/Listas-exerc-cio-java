/* 
Alguns países medem a temperatura em graus Celsius e outros em
fahrenheit. Faça um programa em Linguagem Java, para ler uma
temperatura em Celsius e imprimir em fahrenheit. (Pesquise como
fazer esse tipo de conversão).
*/
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double Celsius, fahrenheit;

        System.out.println("Digite uma temperatura em graus Celcius: ");
        Celsius = leitor.nextDouble();

        fahrenheit = (Celsius*1.8) + 32;

        System.out.println("O valor "+Celsius+" °C em Fahrenheit é "+fahrenheit);
    }
}