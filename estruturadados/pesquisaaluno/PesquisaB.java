package estruturadados.pesquisaaluno;

public class PesquisaB {
     public static int pesquisaBinaria(Aluno []Aluno, int x){
        int inicio = 0;
        int fim = Aluno.length-1;

        while(inicio<=fim){
            int meio = inicio + (fim- inicio)/2;

            if(Aluno[meio].getMatricula()==x){
                return meio;
            }

            if(Aluno[meio].getMatricula()<x){
                inicio = meio +1;
            }else{
                fim = meio -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Aluno[] aluno = new Aluno[3];

        aluno[0]= new Aluno(123,"João","joao@gmail.com", "123,endereco","63992488940");
        aluno[1]= new Aluno(124,"Joana","joao@gmail.com", "123,endereco","63992488940");
        aluno[2]= new Aluno(125,"Juliana","juju@gmail.com", "14563,endereco","63992488940");

        int x = 125;
        int pesquisa;
        pesquisa = pesquisaBinaria(aluno, x);

        System.out.println("O indice do aluno é: "+pesquisa);
    }
}
