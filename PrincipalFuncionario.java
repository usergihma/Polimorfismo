package lpa_Polimorfismo_2_10;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(1, "Gio", "12345",9, "Rua x");
		System.out.println(funcionario.getNome());
		System.out.println( funcionario.calcularSalario(100000, 10));
		
		Horista horista = new Horista(1, "Gio", "12345",9, "Rua x");
		System.out.println( horista.calcularSalario(1000, 10));
		
		Jornada jornada = new Jornada(2, "Giu", "12345", 8, "Rua y");
		System.out.println(jornada.getNome());
		System.out.println( jornada.calcularSalario(2000, 100));
		
		Consultorpj consultorpj = new Consultorpj(3, "Gab", "12345", 7, "Rua z" );
		System.out.println(consultorpj.getNome());
		System.out.println(consultorpj.calcularSalario(1000, 100));
		
	

	}

}
