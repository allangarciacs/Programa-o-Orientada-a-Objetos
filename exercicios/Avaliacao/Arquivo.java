package avaliacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	private FileWriter arqw;
	private BufferedWriter escritor;
	private FileReader arqr;
	private BufferedReader leitor;
	private List<Veiculo> listVeiculos;
	public String nomeArquivo;
	
	public Arquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		listVeiculos = new ArrayList<>();
	}
	
	public void gravaArquivo(List<Veiculo> lista) {
		try {
			arqw = new FileWriter(nomeArquivo+".txt");
			escritor = new BufferedWriter(arqw);
			
			for (Veiculo v : lista) {
				escritor.write(v.getPlaca() + "," + v.getModelo() + "," + v.getMarca()
				+ "," + v.getAnoFab() + "," + v.getQuilometragem());
				
				escritor.newLine();
			}
			
			escritor.close();
			arqw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Veiculo> leArquivo() {
		// nessa parte tive q pesquisar, pq tava duplicando os itens da lista
		// dai adicionei o .clear
	    listVeiculos.clear(); 

	    try {
	        arqr = new FileReader(nomeArquivo + ".txt");
	        leitor = new BufferedReader(arqr);

	        String linha;
	        
	        while ((linha = leitor.readLine()) != null) {
	            String[] campos = linha.split(",");

	            Veiculo v = new Veiculo(campos[0], campos[1], campos[2], 
	            Integer.parseInt(campos[3]),Double.parseDouble(campos[4]));
	            listVeiculos.add(v);
	        }

	        leitor.close();
	        arqr.close();

	    } catch(IOException e) {
	    	e.printStackTrace();
	    }
	    
	    return listVeiculos;
	}
}
