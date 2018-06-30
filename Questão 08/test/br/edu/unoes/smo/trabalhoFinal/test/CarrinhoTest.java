package br.edu.unoes.smo.trabalhoFinal.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.edu.unoesc.smo.trabalhoFinal.Carrinho;
import br.edu.unoesc.smo.trabalhoFinal.Produto;
import br.edu.unoesc.smo.trabalhoFinal.TipoProduto;

public class CarrinhoTest {
   
	@Test
	public void incluirProdutoCarrinho() {
	  Carrinho carrinho = new Carrinho();
	  Produto produto = new Produto(1, "Calça Jeans", 300.00, TipoProduto.VESTUARIO);
	  carrinho.incluirProduto(produto, 1);
	  
	  assertEquals(1, carrinho.getQuantidadeProdutos());
	}
	
	@Test
	public void removerProdutoCarrinho() {
	  Carrinho carrinho = new Carrinho();
	  Produto produto1 = new Produto(1, "Calça Jeans", 300.00, TipoProduto.VESTUARIO);
	  carrinho.incluirProduto(produto1, 1);
	  
	  Produto produto2 = new Produto(2, "BANANA", 2.75, TipoProduto.ALIMENTO);
	  carrinho.incluirProduto(produto2, 1);	  
	  
	  assertEquals(2, carrinho.getQuantidadeProdutos());
	  
	  carrinho.removerProduto(produto1);
	  carrinho.removerProduto(produto2);
	  
	  assertEquals(0, carrinho.getQuantidadeProdutos());
	}	
	
	@Test
	public void verificarDescontoVestuario() {
	  Carrinho carrinho = new Carrinho();
	  Produto produto1 = new Produto(1, "Calça Jeans", 300.00, TipoProduto.VESTUARIO);
	  carrinho.incluirProduto(produto1, 1);
	  
	  Produto produto2 = new Produto(2, "Camiseta polo", 150.10, TipoProduto.VESTUARIO);
	  carrinho.incluirProduto(produto2, 1);	  
	  	  
	  assertEquals(Double.valueOf(337.575), carrinho.valorTotal());
	}	
	
	@Test
	public void verificarDescontoBebidas() {
	  Carrinho carrinho = new Carrinho();
	  Produto produto1 = new Produto(1, "Coca cola", 6.75, TipoProduto.BEBIDA);
	  carrinho.incluirProduto(produto1, 3);
	  
	  Produto produto2 = new Produto(2, "Dreher", 15.99, TipoProduto.BEBIDA);
	  carrinho.incluirProduto(produto2, 1);	  
	  	  
	  assertEquals(Double.valueOf(34.428), carrinho.valorTotal());
	}		
	
	@Test
	public void verificarDescontoEmVariosProdutos() {
	  Carrinho carrinho = new Carrinho();
	  Produto produto = new Produto(1, "Coca cola", 6.75, TipoProduto.BEBIDA);
	  carrinho.incluirProduto(produto, 1);
	  produto = new Produto(2, "Dreher", 15.99, TipoProduto.BEBIDA);
	  carrinho.incluirProduto(produto, 1);	 
	  produto = new Produto(3, "Calça Jeans", 300.00, TipoProduto.VESTUARIO);
	  carrinho.incluirProduto(produto, 1);	
	  produto = new Produto(4, "Camiseta polo", 150.10, TipoProduto.VESTUARIO);
	  carrinho.incluirProduto(produto, 1);	
	  produto = new Produto(5, "BANANA", 2.75, TipoProduto.ALIMENTO);
	  carrinho.incluirProduto(produto, 1);	 	  
	  	  
	  assertEquals(Double.valueOf(361.928), carrinho.valorTotal());
	}
	
	@Test
	public void ordeanacaoProdutosPorValorCrescente() {
	  Carrinho carrinho = new Carrinho();
	  Produto produto = new Produto(1, "Coca cola", 6.75, TipoProduto.BEBIDA);
	  carrinho.incluirProduto(produto, 1);
	  produto = new Produto(2, "Dreher", 15.99, TipoProduto.BEBIDA);
	  carrinho.incluirProduto(produto, 1);	 
	  produto = new Produto(3, "Calça Jeans", 300.00, TipoProduto.VESTUARIO);
	  carrinho.incluirProduto(produto, 1);	
	  produto = new Produto(4, "Camiseta polo", 150.10, TipoProduto.VESTUARIO);
	  carrinho.incluirProduto(produto, 1);	
	  produto = new Produto(5, "BANANA", 2.75, TipoProduto.ALIMENTO);
	  carrinho.incluirProduto(produto, 1);	 
	  List<Produto> produtos = carrinho.listaProdutosValorCrescente();
	  
	  assertEquals("BANANA", produtos.get(0).getDescricao());
	  assertEquals("Coca cola", produtos.get(1).getDescricao());
	  assertEquals("Dreher", produtos.get(2).getDescricao());
	  assertEquals("Camiseta polo", produtos.get(3).getDescricao());
	  assertEquals("Calça Jeans", produtos.get(4).getDescricao()); 
	}	
	
	@Test
	public void ordeanacaoProdutosPorValorDecrescente() {
	  Carrinho carrinho = new Carrinho();
	  Produto produto = new Produto(1, "Coca cola", 6.75, TipoProduto.BEBIDA);
	  carrinho.incluirProduto(produto, 1);
	  produto = new Produto(2, "Dreher", 15.99, TipoProduto.BEBIDA);
	  carrinho.incluirProduto(produto, 1);	 
	  produto = new Produto(3, "Calça Jeans", 300.00, TipoProduto.VESTUARIO);
	  carrinho.incluirProduto(produto, 1);	
	  produto = new Produto(4, "Camiseta polo", 150.10, TipoProduto.VESTUARIO);
	  carrinho.incluirProduto(produto, 1);	
	  produto = new Produto(5, "BANANA", 2.75, TipoProduto.ALIMENTO);
	  carrinho.incluirProduto(produto, 1);
	  
	  List<Produto> produtos = carrinho.listaProdutosValorDecrescente();
	  
	  assertEquals("Calça Jeans", produtos.get(0).getDescricao());
	  assertEquals("Camiseta polo", produtos.get(1).getDescricao());
	  assertEquals("Dreher", produtos.get(2).getDescricao());
	  assertEquals("Coca cola", produtos.get(3).getDescricao());
	  assertEquals("BANANA", produtos.get(4).getDescricao());	 	  
	}	
	
}
