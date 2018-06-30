package br.edu.unoesc.smo.trabalhoFinal;

public class SemDesconto implements ValorUnitario {

	@Override
	public Double obterValorUnitario(Produto produto) {
		return produto.getValor();
	}

}
