package br.unibh;

import java.util.Date;

public class Aluno extends Pessoa {

	private Long matrícula;
	private Date dataAniversario;

	public Aluno(Long matrícula, String nome, String cpf, Date dataAniversario) {
		super(nome,cpf);
		this.matrícula = matrícula;
		this.dataAniversario = dataAniversario;
	}

	public Aluno(Long matrícula, String nome, String cpf) {
		super(nome,cpf);
		this.matrícula = matrícula;

	}

	public Aluno(Long matrícula, String nome) {
		super(nome,null);
		this.matrícula = matrícula;
	
	}

	public Long getMatrícula() {
		return matrícula;
	}

	public void setMatrícula(Long matrícula) {
		this.matrícula = matrícula;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public String toString() {
		return super.toString()+"Aluno [matrícula=" + matrícula + ", dataAniversario="
				+ dataAniversario + "]";
	}

	
	

}
