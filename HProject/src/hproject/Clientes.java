package hproject;

import hproject.Adm;

//classe de clientes vinculados independente de plano
public class Clientes extends Adm {

	private boolean planoAtivo;
	private boolean planoMaisSeguranca;
	private int dependentes;

	// construtor necessario 
	public Clientes(boolean planoAtivo, boolean planoMaisSeguranca, int dependentes) {
		super();
		this.planoAtivo = planoAtivo;
		this.planoMaisSeguranca = planoMaisSeguranca;
		this.dependentes = dependentes;
	}

	// getters e setters
	public boolean isPlanoAtivo() {
		return planoAtivo;
	}

	public void setPlanoAtivo(boolean planoAtivo) {
		this.planoAtivo = planoAtivo;
	}

	public boolean isPlanoMaisSeguranca() {
		return planoMaisSeguranca;
	}

	public void setPlanoMaisSeguranca(boolean planoMaisSeguranca) {
		this.planoMaisSeguranca = planoMaisSeguranca;
	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	@Override
	public String toString() {
		return "Clientes: Plano Ativo = " + planoAtivo + ", Plano Mais Segurança = " + planoMaisSeguranca
				+ ", dependentes = " + dependentes;
	}

}