import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private FileWriter arqw;
	private BufferedWriter escritor;
	private FileReader arqr;
	private BufferedReader leitor;
	private List<Livro> listLivro;
	public String nomeArquivo;
	
	public Biblioteca(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;	
		listLivro = new ArrayList<>();
	}
		
	public void listarLivros() {
		for (Livro l : listLivro) {
			System.out.println(l);
		}
	}
	
	public void gravaArquivo(List<Livro> lista) {
		try {
			arqw = new FileWriter(nomeArquivo+".txt");
			escritor = new BufferedWriter(arqw);
			
			for (Livro l : lista) {
				escritor.write(l.getTitulo() + "," + l.getAutor() + ","
						+ l.getAnoPublicacao() + "," + l.isEmprestado());
				
				escritor.newLine();
			}
			
			escritor.close();
			arqw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Livro> leArquivo() {
	    listLivro.clear(); 

	    try {
	        arqr = new FileReader(nomeArquivo + ".txt");
	        leitor = new BufferedReader(arqr);

	        String linha;
	        
	        while ((linha = leitor.readLine()) != null) {
	            String[] campos = linha.split(",");

	            Livro l = new Livro(campos[0], campos[1],
	            Integer.parseInt(campos[2]), false);
	            listLivro.add(l);
	        }

	        leitor.close();
	        arqr.close();

	    } catch(IOException e) {
	    	e.printStackTrace();
	    }
	    
	    return listLivro;
	}
	

}
