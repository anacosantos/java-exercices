package br.com.novo.banco;

public class ContaBancoNovo {
	
	private int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	//metodo construtor criado abaixo:

	public ContaBancoNovo () {
		this.setSaldo(0);
		this.setStatus(false);
	}
	public void abrirConta(String t) {
		
	}
	public void fechar() {
		
	}
	public void depositar() {
		
	}
	public void sacar() {
		
	}
	public void pagarMensal() {
		
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}