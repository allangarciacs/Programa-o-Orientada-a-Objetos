package lista08;

public class E10Tarefa {
	public String descricao;
	public boolean concluida;

	public E10Tarefa(String descricao, boolean concluida) {
		this.descricao = descricao;
		this.concluida = concluida;
	}
	
	public void concluirTarefa() {
		concluida = true;
	}
	
	public void exibirTarefa() {
		System.out.println("Descricao da tarefa: "+descricao);
		System.out.println("Concluida: "+concluida);
	}
	
}
