package POO.Produto;
import java.util.Scanner;

// fazer alterações na lógica do codigo

public class Estoque {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Produto produtoA;
        produtoA = new Produto();

        System.out.println("Digite o nome do produto: ");
        produtoA.setNome(ler.next());
        System.out.println("Digite o preço do produto: ");
        produtoA.setPreco(ler.nextFloat());
        System.out.println("Digite a quantidade em estoque: ");
        produtoA.setQuant(ler.nextInt());


        System.out.println("---- dados do produto -----");
        System.out.println("Nome: "+produtoA.getNome());
        System.out.println("Preço: "+produtoA.getPreco());
        System.out.println("Estoque: "+produtoA.getQuant());

        System.out.println("---- dados do produto  atualizados-----");
        System.out.println("Nome: "+produtoA.getNome());
        System.out.println("Preço: "+produtoA.getPreco());
        // testar com adixição no estoque por meio de if e scanner
        System.out.println("---Inserindo e retirando do estoque-----");
        System.out.println("Inserindo mais no estoque: "+produtoA.getAdiciona(500));
        System.out.println("Retirando do estoque, quantidade final: "+produtoA.getSaida(100));

    }
}
