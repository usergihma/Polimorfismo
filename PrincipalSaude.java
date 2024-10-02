package lpa_Polimorfismo_2_10;

public class PrincipalSaude {

	public static void main(String[] args) {
		ProfissionalSaude profissionalS = new ProfissionalSaude("Marceline", "Enfermagem", 950);
		System.out.println(profissionalS.getEspecialidade());
		profissionalS.agendarConsulta();
		
		Medico medico = new Medico("Giovanna", "Neurocirurgia", 950, "Válido");
		System.out.println(profissionalS.getEspecialidade());
		medico.agendarConsulta();
		
		Dentista denstista = new Dentista("Giulia", "Aplicação de aparelho", 500, "Válido");
		System.out.println(denstista.getNome());
		denstista.agendarConsulta();
		
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta("Gabriel", "Preventiva", 950, "Válido");
		System.out.println(fisioterapeuta.getNome());
		fisioterapeuta.agendarConsulta();
	}
}