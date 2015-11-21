package br.com.memory.bean;

import javax.inject.Inject;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String dataNascimento;
	
	@Inject
	private Endereco endereco;
	
	private Telefone telefoneFixo;
	private Telefone telefoneCelular;
	private Telefone telefoneFax;
	
	public Cliente(){
		telefoneFixo = new Telefone("Fixo");
		telefoneCelular = new Telefone("Celular");
		telefoneFax = new Telefone("Fax");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(Telefone telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public Telefone getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(Telefone telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public Telefone getTelefoneFax() {
		return telefoneFax;
	}
	public void setTelefoneFax(Telefone telefoneFax) {
		this.telefoneFax = telefoneFax;
	}

	public void limpaCampos(){
	
		this.nome = "";
		this.cpf = "";
		this.dataNascimento = "";
		this.endereco.limpaCampos();
		this.telefoneFixo.setNumero("");
		this.telefoneCelular.setNumero("");
		this.telefoneFax.setNumero("");
	}

}
