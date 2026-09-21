package poo.paralelepipedo;

import java.util.Scanner;

public class AppCalculo {
   public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
    Paralelepipedo paralelepipedo = new Paralelepipedo();

        System.out.println("Digite a altura do paralelepipedo: ");
        paralelepipedo.setAltura(entrada.nextFloat());

        System.out.println("Digite a largura do paralelepipedo: ");
        paralelepipedo.setLargura(entrada.nextFloat());

        System.out.println("Digite o comprimento do paralelepipedo: ");
        paralelepipedo.setComprimento(entrada.nextFloat());

        System.out.println("----------------------------");
        System.out.println(paralelepipedo);
        
        
   }

    
}
