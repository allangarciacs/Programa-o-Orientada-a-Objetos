package lista12;

public class E06Funcionario {
	protected String nome;
	protected double salario;
	
	public E06Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void aumentarSalario(double porcentagemAumento) {
		salario += salario * porcentagemAumento; 
		System.out.println("Salario apos o aumento: "+salario);
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
}
