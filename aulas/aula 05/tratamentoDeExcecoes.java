public class Exemplo01 {

	public static void main(String[] args) {
		
		/* Exemplo 1: Tentando acessar um elemento fora do indice de um array
		int[] numeros = {1, 2, 3}; 
		System.out.println(numeros[3]); // ArrayIndexOutOfBoundsExcpetion */	
		
		/* Exemplo 2: Tentando dividir um numero por '0'
		int a = 10;
		int b = 0;
		System.out.println(a/b);  // ArithmeticException */
		
		/* Exemplo 3: Formatos de variaveis incompativeis
		String numero = "abc";
		int valor = Integer.parseInt(numero); // NumberFormatException. */
		
		// Resolvendo os exemplos
		
		// Exemplo 1 
		try {
			int[] numeros = {1, 2, 3}; 
			System.out.println(numeros[3]);
		} catch (Exception e) {
			System.out.println("Exceção: "+e.toString());
		}  
		
		// Dessa maneira, mesmo ocorrendo o erro, o codigo continuara 
		
		// Exemplo 2
		
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) { 
			System.out.println("Exceção: "+e.toString());
		}
		
		// Exemplo 3
		
		String numero = "abc";
		try {
			int valor = Integer.parseInt(numero);
		} catch (NumberFormatException e) {
			System.out.println("Exceção: "+e.toString());
		}
		
		/* Sempre que possível, usar exceções específicas no bloco catch,
		   como ArithmeticException em vez de Exception. Assim, somente
		   erros esperados são tratados, e outras falhas inesperadas não ficam
		   ocultas, ajudando na depuração e a identificação de problemas. */
		
	}

}
