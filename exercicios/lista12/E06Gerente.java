package lista12;

public class E06Gerente extends E06Funcionario {
	private double bonus;

	public E06Gerente(String nome, double salario, double bonus) {
		super(nome, salario);
		this.bonus = bonus;
	}
	 
	@Override
	public void aumentarSalario(double porcentagemAumento) {
		salario += salario * porcentagemAumento; // aumento d 10% para todos
		salario += bonus; // bonus do gerente (assado por parametro)
		
		System.out.println("Salario apos o aumento: "+salario);
	}

	@Override
	public String toString() {
		return "Gerente [bonus=" + bonus + ", nome=" + nome + ", salario=" + salario + "]";
	}	
}
