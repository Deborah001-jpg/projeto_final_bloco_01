package Produtos.repository;

import Produtos.model.Produtos;
import java.util.List;

public interface CarrinhoRepository {
	
    void adicionarProduto(Produtos produto);
    List<Produtos> obterItens();
    float calcularTotal();
    void limparCarrinho();
    

}
