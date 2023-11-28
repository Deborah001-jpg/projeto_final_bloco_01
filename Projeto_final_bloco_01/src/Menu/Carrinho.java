package Menu;

import java.util.ArrayList;
import java.util.List;

import Produtos.model.Produtos;

public class Carrinho {
	private List<Produtos> itens;

	public Carrinho() {
		this.itens = new ArrayList<>();
	}

	public void adicionarProduto(Produtos produtoSelecionado) {
		itens.add(produtoSelecionado);
	}

	public void mostrarCarrinho() {
		System.out.println("==== Carrinho ====");
		for (Produtos produto : itens) {
			System.out.println(produto.getNome() + " - R$" + produto.getPreco());
		}
	}

	public float calcularTotal() {
		float total = 0.0f;
		for (Produtos produto : itens) {
			total += produto.getPreco();
		}
		return total;
	}

	public void limparCarrinho() {
		itens.clear();
		System.out.println("Carrinho limpo.");
	}
}
