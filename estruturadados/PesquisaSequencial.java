package estruturadados;

public class PesquisaSequencial {
    public static int buscaSequencial(double [] vetor, double x){
            for(int i =0; i<vetor.length; i++){
                if(vetor[i]==x){
                    return i;
                }
            }

            return -1;
        }    
        public static void main(String[] args) {
            double [] vetor = {12.3, 9.9, 78.5, 2.3, 10.98};
            
            double alvo = 12.3;
            
            int pesquisa;
            pesquisa = buscaSequencial(vetor, alvo);
            
            if(pesquisa>=0){
                System.out.println("O alvo está no índice: "+pesquisa);
            }else{
                System.out.println(pesquisa);
            }
                   }
}
