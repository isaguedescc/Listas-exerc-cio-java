package estruturadados;

public class PesquisaBinaria {
    public static int pesquisaBinaria(String []nomes, String x){
        int inicio = 0;
        int fim = nomes.length-1;

        while(inicio<=fim){
            int meio = inicio + (fim- inicio)/2;

            if(nomes[meio].equalsIgnoreCase(x)){
                return meio;
            }

            if(nomes[meio].compareToIgnoreCase(x)<0){
                inicio = meio +1;
            }else{
                fim = meio -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    String [] nomes= {"Ana", "Bia", "Carla", "Daniela", "Eduarda", "Felipe", "Gustavo", "Helio"};
    String nome = "Lia";

    int pesquisa = pesquisaBinaria(nomes, nome);

    System.out.println(pesquisa);

    }
}
