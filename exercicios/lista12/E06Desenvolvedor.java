package lista12;

public class E06Desenvolvedor extends E06Funcionario {
	private int horasExtras;
	
	public E06Desenvolvedor(String nome, double salario, int horasExtras) {
		super(nome, salario);
		this.horasExtras = horasExtras;
		
	}
	@Override
	public String toString() {
		return "Desenvolvedor [horasExtras=" + horasExtras + ", nome=" + nome + ", salario=" + salario + "]";
	}

}
