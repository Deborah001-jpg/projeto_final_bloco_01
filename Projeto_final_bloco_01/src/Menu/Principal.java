package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Produtos.model.Produtos;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;

		 List<Produtos> catalogo = inicializarCatalogo();
	        Carrinho carrinho = new Carrinho();

	        do {
	            exibirMenu();
	            opcao = leia.nextInt();

	            switch (opcao) {
	                case 1:
	                    visualizarCatalogo(catalogo);
	                    break;
	                case 2:
	                    adicionarAoCarrinho(catalogo, carrinho, leia);
	                    break;
	                case 3:
	                    visualizarCarrinho(carrinho);
	                    break;
	                case 4:
	                    finalizarCompra(carrinho);
	                    break;
	                case 5:
	                    System.out.println("Saindo do programa. Até logo!");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (opcao != 5);

	        leia.close();
	    }

	    private static List<Produtos> inicializarCatalogo() {
	        List<Produtos> catalogo = new ArrayList<>();
	        catalogo.add(new Produtos("Capa para Celular", 19.99f));
	        catalogo.add(new Produtos("Fone de Ouvido", 49.99f));
	        catalogo.add(new Produtos("Película Protetora", 9.99f));
	        return catalogo;
	       
	        
	    }

	    private static void exibirMenu() {
	        System.out.println("==== Menu da Loja ====");
	        System.out.println("1. Visualizar Catálogo");
	        System.out.println("2. Adicionar Produto ao Carrinho");
	        System.out.println("3. Visualizar Carrinho");
	        System.out.println("4. Finalizar Compra");
	        System.out.println("5. Sair");
	        System.out.print("Escolha uma opção: ");
	        
	        keypress();
	    }

	    private static void keypress() {
			
			
		}

		private static void visualizarCatalogo(List<Produtos> catalogo) {
	        System.out.println("==== Catálogo ====");
	        for (int i = 0; i < catalogo.size(); i++) {
	            System.out.println((i + 1) + ". " + catalogo.get(i).getNome());
	        }
	    }

	    private static void adicionarAoCarrinho(List<Produtos> catalogo, Carrinho carrinho, Scanner leia) {
	        visualizarCatalogo(catalogo);
	        System.out.print("Escolha o número do produto para adicionar ao carrinho: ");
	        int numeroProduto = leia.nextInt();
	        if (numeroProduto >= 1 && numeroProduto <= catalogo.size()) {
	            Produtos produtoSelecionado = catalogo.get(numeroProduto - 1);
	            carrinho.adicionarProduto(produtoSelecionado);
	            System.out.println("Produto adicionado ao carrinho!");
	        } else {
	            System.out.println("Número de produto inválido.");
	        }
	    }

	    private static void visualizarCarrinho(Carrinho carrinho) {
	        carrinho.mostrarCarrinho();
	    }

	    private static void finalizarCompra(Carrinho carrinho) {
	        System.out.println("==== Carrinho Final ====");
	        carrinho.mostrarCarrinho();
	        System.out.println("Total: R$" + carrinho.calcularTotal());
	        System.out.println("Compra finalizada. Obrigado!");
	        carrinho.limparCarrinho();
	    }
	}