package Menu.controller;

import java.util.List;

import Produtos.model.Produtos;
import Produtos.repository.CarrinhoRepository;

public class MenuController implements CarrinhoRepository {

	private CarrinhoRepository carrinhoRepository;

	public MenuController(CarrinhoRepository carrinhoRepository) {
		this.carrinhoRepository = carrinhoRepository;
	}

	@Override
	public void adicionarProduto(Produtos produto) {
		carrinhoRepository.adicionarProduto(produto);
		System.out.println("Produto adicionado ao carrinho!");
	}

	@Override
	public List<Produtos> obterItens() {
		List<Produtos> itens = carrinhoRepository.obterItens();
		try {
			if (itens.isEmpty()) {
				System.out.println("Carrinho vazio.");
			} else {
				System.out.println("==== Itens no Carrinho ====");
				for (Produtos produto : itens) {
					System.out.println(produto.getNome() + " - R$" + produto.getPreco());
				}
			}
		} catch (Exception e) {
			System.out.println("Erro ao obter itens do carrinho: " + e.getMessage());
		}
		return itens;
	}

	@Override
	public float calcularTotal() {
		float total = 0;
		try {
			total = carrinhoRepository.calcularTotal();
			System.out.println("Total do Carrinho: R$" + total);
		} catch (Exception e) {
			System.out.println("Erro ao calcular total do carrinho: " + e.getMessage());
		}
		return total;
	}

	@Override
	    public void limparCarrinho() {
	        try {
	            carrinhoRepository.limparCarrinho();
	            System.out.println("Carrinho limpo.");
	        } catch (Exception e) {
	            System.out.println("Erro ao limpar carrinho: " + e.getMessage());
	        }
	}
}
