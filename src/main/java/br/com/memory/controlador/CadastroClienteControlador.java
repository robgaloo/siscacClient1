package br.com.memory.controlador;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.memory.bean.Cliente;

@Named
public class CadastroClienteControlador {
	
	@Inject
	private Cliente cliente;
	private List<String> estados;
	
	private List<Cliente> clientes;
	
	private static final String FW_LISTAR_CLIENTES = "listaCliente.jsf?faces-redirect=true";
	private static final String FW_CADASTRO_CLIENTE = "cadastroCliente.jsf?faces-redirect=true";
	
	
	public CadastroClienteControlador(){
		
		povoaListas();
		
	}
	
	public String salvar(){
		System.out.println("Nome: "+cliente.getNome());
		System.out.println("CPF: "+cliente.getCpf());
		System.out.println("Celular: "+cliente.getTelefoneCelular().getNumero());
		System.out.println("Fixo: "+cliente.getTelefoneFixo().getNumero());
		System.out.println("Log: "+cliente.getEndereco().getLogradouro());
		System.out.println("Numero: "+cliente.getEndereco().getNumero());
		
		return FW_LISTAR_CLIENTES;
		
	}
	
	public String editarCliente(Cliente cliente){		
		System.out.println("cpf do cliente a ser editado:"+cliente.getCpf());
		return FW_CADASTRO_CLIENTE;
	}
	
	public String excluirCliente(Cliente cliente){
		System.out.println("cpf do cliente a ser excluido:"+cliente.getCpf());
		return FW_CADASTRO_CLIENTE;
	}
	
	
	public void novoCliente(){
		cliente.limpaCampos();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<String> getEstados() {
		return estados;
	}

	public void setEstados(List<String> estados) {
		this.estados = estados;
	}
	
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	private void povoaListas(){
		
		estados = new ArrayList<String>();
		estados.add("DF");
		estados.add("MG");
		estados.add("SP");
		estados.add("RJ");
		
		clientes = new ArrayList<Cliente>();
		
		Cliente cliente = new Cliente();
		
		cliente.setCpf("555.444.777-99");
		cliente.setNome("Joao da Silva");
		cliente.setDataNascimento("01/01/1980");
		cliente.getTelefoneCelular().setNumero("(55) 89899-5412");
				
		clientes.add(cliente);
		cliente = new Cliente();
		
		cliente.setCpf("741.654.685-85");
		cliente.setNome("Maria Jose");
		cliente.setDataNascimento("15/12/1975");
		cliente.getTelefoneCelular().setNumero("(88) 25142-7411");
				
		clientes.add(cliente);
		cliente = new Cliente();
		
		cliente.setCpf("421.520.325-99");
		cliente.setNome("Pedro de Lara");
		cliente.setDataNascimento("31/10/1987");
		cliente.getTelefoneCelular().setNumero("(74) 85421-5274");
		
		clientes.add(cliente);
		cliente = new Cliente();
		
		cliente.setCpf("485.875.625-77");
		cliente.setNome("Antonio Rubens");
		cliente.setDataNascimento("14/05/1965");
		cliente.getTelefoneCelular().setNumero("(85) 52521-6543");
		
		clientes.add(cliente);
		cliente = new Cliente();
		
	}
}
