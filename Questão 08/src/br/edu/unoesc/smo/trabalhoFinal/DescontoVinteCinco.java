package br.edu.unoesc.smo.trabalhoFinal;

public class DescontoVinteCinco implements ValorUnitario {

	@Override
	public Double obterValorUnitario(Produto produto) {
		return produto.getValor() - (produto.getValor() * 0.25);
	}

}
