package lpa_Polimorfismo_2_10;

public class Principal {

	public static void main(String[] args) {

		Lobo lobo = new Lobo("Jacob", "M", "Lobisomem");
		lobo.emitirSom();
		
		Leao leao = new Leao("Simba", "M", "leão-africano,");
		leao.caminhar();
		
		Tigre tigre = new Tigre("Rajah", "M", "de Bengala");
		tigre.dormir();
		
		Cachorro cachorro = new Cachorro("Vagabundo", "M", "Vira-lata");
		cachorro.correr();
		
		Gato gato = new Gato("Marrie", "F", "Angorá");
		gato.caminhar();

	}

}
