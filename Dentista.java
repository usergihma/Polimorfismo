package lpa_Polimorfismo_2_10;

public class Dentista extends ProfissionalSaude {
	private String cro;
	
	public Dentista(String nome, String especialidade, int valorConsulta, String cro) {
		super(nome,especialidade, valorConsulta);
		this.cro = cro;
	}
	@Override //subescrevendo
	public void agendarConsulta() {
		System.out.println("Agendando consulta Dentista");
	}
}

