package avaliacao;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Servidor {
	
    public static void main(String[] args) {
    	
    	try {
    		ServerSocket servidor = new ServerSocket(1111);    
    		System.out.println("Socket servidor INICIADO com sucesso!");
    		
    		while (true) {
    			Socket cliente = servidor.accept();
    			System.out.println("Cliente CONECTADO!");
    			
    			ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
    			ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());
    			
    			Veiculo veiculo = (Veiculo) in.readObject();
    			Arquivo arquivo = new Arquivo("veiculos");
    			List<Veiculo> lista = arquivo.leArquivo();
    			boolean existe = false;
    			
    			for (Veiculo v : lista) {
    				if (v.getPlaca().equalsIgnoreCase(veiculo.getPlaca())) {
    					existe = true;
    					break;
    				}
    			}
    			
    			if (existe) {
    				out.writeObject("Veiculo JA CADASTRADO!");
    			} else {
    				lista.add(veiculo);
    				arquivo.gravaArquivo(lista);
    				out.writeObject("Cadastro REALIZADO");
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
