package lista12;

public class E03Funcionario {
	protected double salarioFuncionario;
	
	public E03Funcionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	
	public void calcularSalario() {
		System.out.println("Salario do funcionario: "+salarioFuncionario);
	}

}
