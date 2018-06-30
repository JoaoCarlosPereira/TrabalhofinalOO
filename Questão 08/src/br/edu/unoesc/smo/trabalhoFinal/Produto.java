package br.edu.unoesc.smo.trabalhoFinal;

public class Produto {
	private int codigo;
	private String descricao;
	private Double valor;
	private TipoProduto tipo;

	public Produto(int codigo, String descricao, Double valor, TipoProduto tipo) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public TipoProduto getTipo() {
		return tipo;
	}

	public String getDescricao() {
		return descricao;
	}
}
