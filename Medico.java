package lpa_Polimorfismo_2_10;

public class Medico extends ProfissionalSaude {
	private String crm;

	public Medico(String nome, String especialidade, int valorConsulta, String crm) {
		super(nome,especialidade, valorConsulta);
		this.crm = crm;
	}
	
	@Override //subescrevendo
	public void agendarConsulta() {
		System.out.println("Agendando consulta Médica");
	}
}
