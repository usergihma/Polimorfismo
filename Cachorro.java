package lpa_Polimorfismo_2_10;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O cachorro esta latindo.");
	}

}