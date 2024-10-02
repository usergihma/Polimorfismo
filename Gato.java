package lpa_Polimorfismo_2_10;

public class Gato extends Animal { //herança
	
	public Gato(String nome, String sexo, String raca) { 
		super(nome, sexo, raca); //método construtor - encapsulamento
	}
	@Override //subscreve o método
	public void emitirSom() {
		System.out.println("O gato esta miando.");
	}

}
