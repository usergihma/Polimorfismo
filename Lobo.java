package lpa_Polimorfismo_2_10;

public class Lobo extends Animal {
	
	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O lobo esta uivando.");
	}

}
