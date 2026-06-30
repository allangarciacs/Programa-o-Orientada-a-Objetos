import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			Socket s = new Socket("localhost", 2222);
			System.out.println("Conexao estabelecida com SUCESSO!");
			
			System.out.print("Digite o TITULO do livro: ");
            String titulo = teclado.nextLine();
            String ttt = (String) titulo;
            
            System.out.println("1 - CONSULTAR");
            System.out.println("2 - REALIZAR EMPRESTIMO");
            System.out.print("Opcao: ");
            int opcao = teclado.nextInt();
            teclado.nextLine();
			
			ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(s.getInputStream());
		
            if (opcao == 1) {
            	out.writeObject(ttt);
    			String resposta = (String) in.readObject();
    			System.out.println(resposta);
            } else if (opcao == 2) {
            	System.out.println("\nRealizando emprestimo");
            } else {
            	System.out.println("\nOpcao INVALIDA");
            }

			//Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, kms);
			
			//out.writeObject(veiculo);
			
			in.close();
			out.close();
			s.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		teclado.close();
		
	}
}
