package EstruturaRepeticao;
/*73.Faça um programa em Linguagem Java, para escrever os números de
0 a 50. */

/* 74.Faça um programa em Linguagem Java, para escrever os números de
50 a 0.*/
public class Contagem {
    
    public static void main(String[] args) {
        // questão 73
       System.out.println("De forma crescente----");
        for(int i=1; i<=50; i++){
            System.out.println(i);
        }
      
          //questão 74
        System.out.println("De forma decrecente------");
      
           for(int i=50; i>=1; i--){
            System.out.println(i);
        }
      
    }

}
