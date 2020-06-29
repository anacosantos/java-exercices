package br.com.animalzinho;

public class Ave extends Animal{

	private String corPena;
	
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	public void fazerNinho() {
		System.out.println("Contruiu um ninho");
	}

	@Override
	public void locomover() {
		System.out.println("Voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som da ave");
		
	}
}
