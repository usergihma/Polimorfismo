package lpa_Polimorfismo_2_10;

public class Horista extends Funcionario {
	private int valorHora;
	private int horasTrab;
	
	public Horista(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome,telefone, matricula, endereco);
	}
	@Override //subescrevendo
	public double calcularSalario(double valorHora, double horasTrab) {
		return valorHora*horasTrab;
	}

}
