package pkg; //mostrar vetor

public class Exemplo02 {

	public static void main(String[] args) {
		
		int[] vetor = new int[5]; //int vetor[5]
		vetor[0] = 5; 	//coloca o valor dos elementos
		vetor[1] = 10;	//de um vetor individualmente
		vetor[2] = 15;
		vetor[3] = 20;
		vetor[4] = 25;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Elemento "+i+" = "+vetor[i]);
		}
		
	}

}
