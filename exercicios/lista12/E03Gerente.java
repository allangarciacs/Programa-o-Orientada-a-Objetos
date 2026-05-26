package lista12;

public class E03Gerente extends E03Funcionario {
	
	public E03Gerente(double salarioFuncionario) {
		super(salarioFuncionario);
	}
	
	@Override
	public void calcularSalario() {
		double salarioGerente = salarioFuncionario * 1.5;
		System.out.println("Salario do gerente (bonus de 50%): "
				+salarioGerente);
		
	}
}
