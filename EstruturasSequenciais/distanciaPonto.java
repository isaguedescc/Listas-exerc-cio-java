/* Faça um programa em Linguagem Java, para calcular a distância entre
dois pontos do plano cartesiano. Cada ponto é um par ordenado*/

public class distanciaPonto {
    public static void main(String[] args) {
        
        double x1=8, x2=6, y1=4.5, y2=6, distancia;

        distancia = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2 - y1, 2));

        System.out.println("Distancia = "+ distancia);
        


    }
}
