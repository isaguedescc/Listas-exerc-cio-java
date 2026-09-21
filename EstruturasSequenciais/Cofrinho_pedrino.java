
/*27.Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos
reais ele conseguiu poupar. Faça um programa em Linguagem Java,
para ler a quantidade de cada tipo de moeda e imprimir o valor total
economizado, em reais. Considere que existem moedas de 1, 5, 10, 25
e 50 centavos, e ainda moedas de 1 real. Não havendo moeda de um
tipo a quantidade respectiva é zero.*/
import java.util.Scanner;

public class Cofrinho_pedrino {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de 1 centavo: ");
        int centavo1 = entrada.nextInt();

        System.out.println("Digite a quantidade de 5 centavos: ");
        int centavo5 = entrada.nextInt();
        
        System.out.println("Digite a quantidade de 10 centavos: ");
        int centavo10 = entrada.nextInt();
        
        System.out.println("Digite a quantidade de 25 centavos: ");
        int centavo25 = entrada.nextInt();
        
        System.out.println("Digite a quantidade de 50 centavos: ");
        int centavo50 = entrada.nextInt();
        
        System.out.println("Digite a quantidade de 1 real: ");
        int real = entrada.nextInt();

        double total = (real*1)+(centavo1*0.01)+(centavo10*0.1)+(centavo25*0.25)+(centavo5*0.05)+(centavo50*0.5); 

        System.out.println("Parabens! Voce conseguiu poupar R$ "+total);
        
    }
    
}
