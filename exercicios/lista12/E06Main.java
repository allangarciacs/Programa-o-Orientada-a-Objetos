package lista12;

public class E06Main {

	public static void main(String[] args) {
		E06Funcionario[] funcionarios = new E06Funcionario[3];
		
		funcionarios[0] = new E06Desenvolvedor("Allan", 1000, 20);
		funcionarios[1] = new E06Gerente("Fabio", 5000, 1000);
		funcionarios[2] = new E06Desenvolvedor("Luis", 2000, 10);
	
		for (E06Funcionario f : funcionarios) {
			f.aumentarSalario(0.1); // 10% d aumento p todos
		}
		
		for (E06Funcionario f : funcionarios) {
			System.out.println("-------------------------");
			System.out.println(f.toString());
		}
		
	}

}
