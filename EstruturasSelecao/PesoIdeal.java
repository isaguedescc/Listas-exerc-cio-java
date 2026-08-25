package EstruturasSelecao;
/*56.Segundo uma tabela médica, o peso ideal está relacionado com a altura
e o sexo. Fazer um programa em Linguagem Java, que receba a altura
e o sexo de uma pessoa, calcular e imprimir o seu peso ideal,
utilizando as seguintes fórmulas.
• Para homens: (72.7*Altura)-58
• Para Mulheres: (62.1*Altura)-44.7 */
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double peso;

        System.out.println("Digite F(feminino) ou M(masculino) para o sexo: ");
         char sexo = ler.next().charAt(0);

        System.out.println("Digite sua altura: ");
        double altura = ler.nextDouble();

        if (sexo == 'F' || sexo == 'f') {
            peso = (62.1*altura)-44.7;
            System.out.println("Seu peso ideal é: "+peso);
        }else if (sexo == 'M' || sexo =='m') {
            peso = (72.7*altura)-58;
            System.out.println("Seu peso ideal é: "+peso);
        }else{
            System.out.println("Informações erradas");
        }
        

    }
}
