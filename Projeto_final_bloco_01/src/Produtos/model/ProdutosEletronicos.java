package Produtos.model;

public class ProdutosEletronicos extends Produtos {
	private String marca;

	public ProdutosEletronicos(String nome, float preco, String marca) {
		super(nome, preco);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;

	}

	@Override
	public void mostrarProduto() {
		super.mostrarProduto();
		System.out.println("Marca: " + marca);

	}
}
