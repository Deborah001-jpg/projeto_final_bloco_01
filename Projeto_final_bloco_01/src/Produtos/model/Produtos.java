package Produtos.model;

public class Produtos {

	private String nome;
	private float preco;

	public Produtos(String nome, float preco) {

		this.nome = nome;
		this.preco = preco;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return (float) preco;
	}

	public void setPreco(float preco) {
		this.preco = (float) preco;
	}

	public String getMarca() {
		return getMarca();
	}

	public void setMarca(String marca) {
	}

	// Método para exibir informações do produto

	public void mostrarProduto() {
		System.out.println("Produto: " + this.nome);
		System.out.println("Preço: R$" + this.preco);

	}

}
