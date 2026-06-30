import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Servidor {

	public static void main(String[] args) {
    	try {
    		ServerSocket servidor = new ServerSocket(2222);    
    		System.out.println("Socket servidor INICIADO com sucesso!");
    		
    		while (true) {
    			Socket cliente = servidor.accept();
    			System.out.println("Cliente CONECTADO!");
    			
    			ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
    			ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());
    			
    			Livro livro = (Livro) in.readObject();
    			Biblioteca biblioteca = new Biblioteca("biblioteca");
    			List<Livro> lista = biblioteca.leArquivo();
    			

    			String titulo = (String) in.readObject();
    			
    			boolean existe = false;
    			for (Livro l : lista) {
				    if (l.getTitulo().equalsIgnoreCase(titulo)) {
				        existe = true;
				        break;
    				}
    			}
    			
    			if (existe) {
    				out.writeObject("Livro esta no sistema!");
    				out.writeObject(livro);
    			}
    			
    			in.close();
    			out.close();
    			cliente.close();
    			
    		}
    		
    	} catch (Exception e) {
    		e.printStackTrace();
		}
	}
}
