package hproject;

public class Fornecedores {
	private String nome, descricao;
	private int quantidade;
	private double preco;


	//construtor necessario
	public Fornecedores(String nome, String descricao, int quantidade, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}


	public double getPreco() {
		return preco;
	}
	
	

	@Override
	public String toString() {
		return  nome + "--" + descricao + ", quantidades: " + quantidade + " e custo R$ "
				+ preco;
	}
}
	
	