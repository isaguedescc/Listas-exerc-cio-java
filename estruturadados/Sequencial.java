package estruturadados;

public class Sequencial {
     public static int buscaSequencial(double [] vetor, double x){
            int count=0;
            for(int i =0; i<vetor.length; i++){
                if(vetor[i]==x){
                   count++;
                }
            }
            return count;
        }    
        
        public static void main(String[] args) {
            double [] vetor = {12.3, 9.9, 12.3, 78.5, 12.3, 12.3, 2.3, 10.98};
            
            double alvo = 1;
            
            int pesquisa;
            pesquisa = buscaSequencial(vetor, alvo);
            
                System.out.println("O valor "+alvo+" apareceu "+pesquisa+" vezes");
                
            }
}
