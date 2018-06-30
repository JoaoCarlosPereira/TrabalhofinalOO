package br.edu.unoesc.smo.trabalhoFinal;

public enum TipoProduto {

	BEBIDA(new DescontoCinco()), 
	VESTUARIO(new DescontoVinteCinco()), 
	ALIMENTO(new SemDesconto());

	private ValorUnitario valorUnitario;

	TipoProduto(ValorUnitario valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Double obterValorUnitario(Produto produto) {
		return valorUnitario.obterValorUnitario(produto);
	}
}
