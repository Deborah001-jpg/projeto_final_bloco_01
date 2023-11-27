package Menu;

import java.util.Scanner;

public class lojaDeAcessorios {

	public static void main(String[] args) {
		
		// Variáveis

		Scanner leia = new Scanner(System.in);
		int opcao;

		// Loop principal
		do {
			// Exibir menu
			System.out.println("==== Menu da Loja ====");
			System.out.println("1. Visualizar Catálogo");
			System.out.println("2. Adicionar Produto ao Carrinho");
			System.out.println("3. Visualizar Carrinho");
			System.out.println("4. Finalizar Compra");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");

			// Entrada de dados
			
			opcao = leia.nextInt();

			// Processar escolha do usuário
			
			switch (opcao) {
			case 1:
				visualizarCatalogo();
				break;
			case 2:
				adicionarAoCarrinho();
				break;
			case 3:
				visualizarCarrinho();
				break;
			case 4:
				finalizarCompra();
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

	// Métodos

	private static void visualizarCatalogo() {
		System.out.println("==== Catálogo ====");
		System.out.println("1. Capa para Celular");
		System.out.println("2. Fone de Ouvido");
		System.out.println("3. Película Protetora");
	}

	private static void adicionarAoCarrinho() {
		System.out.println("Produto adicionado ao carrinho!");
	}

	private static void visualizarCarrinho() {
		System.out.println("==== Carrinho ====");
		
		//  Exibir itens no carrinho
	}

	private static void finalizarCompra() {
		System.out.println("Compra finalizada. Obrigado!");
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:DeborahRodrigues ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/Deborah001-jpg/projeto_final_bloco_01.git");
		System.out.println("*********************************************************");

	}

	public static void keyPress() {

	}
	
}
