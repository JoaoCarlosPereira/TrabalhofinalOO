package br.edu.unoesc.smo.trabalhoFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Carrinho {
	private List<Produto> produtos;

	public void incluirProduto(Produto produto, int quantidade) {
		if (produtos == null) {
			produtos = new ArrayList<>();
		}

		for (int i = 1; i <= quantidade; i++) {
			produtos.add(produto);
		}

	}

	public void removerProduto(Produto produto) {
		if (produtos != null) {
			produtos.remove(produto);
		}
	}

	public Double valorTotal() {
		Double valorTotal;
		valorTotal = 0.0;
		for (Produto produto : produtos) {
			valorTotal += produto.getTipo().obterValorUnitario(produto);
		}
		return valorTotal;
	}

	private class CompararValorCrescente implements Comparator<Produto> {
		@Override
		public int compare(Produto Obj1, Produto Obj2) {
			if (Obj1.getValor() > Obj2.getValor()) {
				return 1;
			} else if (Obj1.getValor() < Obj2.getValor()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	private class CompararValorDecrescente implements Comparator<Produto> {
		@Override
		public int compare(Produto Obj1, Produto Obj2) {
			if (Obj1.getValor() < Obj2.getValor()) {
				return 1;
			} else if (Obj1.getValor() > Obj2.getValor()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public List<Produto> listaProdutosValorCrescente() {
		this.produtos.sort(new CompararValorCrescente());
		return this.produtos;
	}

	public List<Produto> listaProdutosValorDecrescente() {
		this.produtos.sort(new CompararValorDecrescente());
		return this.produtos;
	}

	public int getQuantidadeProdutos() {
		return produtos.size();
	}
}
