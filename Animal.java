package lpa_Polimorfismo_2_10;

public class Animal {
	private String nome;
	private String sexo;
	private String raca;

	public Animal(String nome, String sexo, String raca) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}
	public void dormir() {
		System.out.println("Dormindo");
	}

	public void caminhar() {
	System.out.println("Caminhando");
	}
	public void correr() {
	System.out.println("Correndo");
	}

	public void emitirSom() {
	System.out.println("Emitindo Som");
	}

}