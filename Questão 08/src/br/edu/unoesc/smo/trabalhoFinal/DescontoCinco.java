package br.edu.unoesc.smo.trabalhoFinal;

public class DescontoCinco implements ValorUnitario {

	@Override
	public Double obterValorUnitario(Produto produto) {
		return produto.getValor() - (produto.getValor() * 0.05);
	}

}
