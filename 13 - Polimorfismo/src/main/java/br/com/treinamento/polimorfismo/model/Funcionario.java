package br.com.treinamento.polimorfismo.model;

public class Funcionario {
	
	//ATRIBUTOS
	private String nome;
	private Double salario;
	
	public Double getBonificacao() {
		return this.salario*0.1;
	}
	
	
	//GGAS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
