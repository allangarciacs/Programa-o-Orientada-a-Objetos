package aula07;

import java.awt.MediaTracker;

public class Aluno {
	private String nome;
	private double nota1, nota2;

	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.setNota1(nota1);
		this.setNota2(nota2);
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	// sets para mudar os valores
	
	public void setNome(String nome) {
		if(nome.isBlank() || nome.isEmpty() || nome == null) {
			System.out.println("Nome invalido");
		} else {
			this.nome = nome;
		}
	}
	
	public void setNota1(double nota1) {
		if (nota1 < 0 || nota1 > 10) {
			System.out.println("Nota invalida");
		} else {
		this.nota1= nota1;
		}
	}
	
	public void setNota2(double nota2) {
		if (nota2 < 0 || nota2 > 10) {
			System.out.println("Nota invalida");
		} else {
		this.nota2= nota2;
		}
	}
	
	// metodo para calcular media
	
	public double calculaMedia(double nota1, double nota2) {
		double media = 0;
		if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
			System.out.println("Nota(s) invalida(s), n da pra fazer a nova media");
			return media;
		} else {
			double soma = 0;
			soma = nota1 + nota2;
			media = soma / 2;
			return media;
		}
	}
	
}


