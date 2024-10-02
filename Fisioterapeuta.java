package lpa_Polimorfismo_2_10;

public class Fisioterapeuta extends ProfissionalSaude {
	private String crefito;
	
	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome,especialidade, valorConsulta);
		this.crefito = crefito;
	}
	@Override //subescrevendo
	public void agendarConsulta() {
		System.out.println("Agendando consulta Fisioterapeuta");
	}
}
