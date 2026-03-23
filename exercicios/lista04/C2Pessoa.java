package lista04;

public class C2Pessoa {

	public static void main(String[] args) {
		
		C1Pessoa p1 = new C1Pessoa();
		C1Pessoa p2 = new C1Pessoa();
		
		p1.atribuirDados("Allan", "allan.gmail", "21/06/2006", "Andradas", false);
		p2.atribuirDados("Pedro", "pedro.gmail", "10/10/2010", "Centro", true);
		
		System.out.println("Metodo retornaEmail:");
		p1.retornaEmail();
		p2.retornaEmail();
		
		System.out.println("\nDADOS INICIAIS:\n");
		p1.mostrarDados();
		System.out.println("------------------------------");
		p2.mostrarDados();
		
		p1.promoverAdmin();
		p2.promoverAdmin();
		
		System.out.println("\nDADOS FINAIS:\n");
		
		p1.mostrarDados();
		System.out.println("------------------------------");
		p2.mostrarDados();
		
	}

}
