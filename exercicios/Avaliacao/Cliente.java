package avaliacao;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			Socket s = new Socket("localhost", 1111);
			System.out.println("Conexao estabelecida com SUCESSO!");
			
			ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(s.getInputStream());
			
            System.out.print("PLACA  : ");
            String placa = teclado.nextLine();

            System.out.print("MODELO : ");
            String modelo = teclado.nextLine();

            System.out.print("MARCA  : ");
            String marca = teclado.nextLine();

            System.out.print("ANO    : ");
            int ano = teclado.nextInt();
			teclado.nextLine();

            System.out.print("Quilometragem: ");
            double kms = teclado.nextDouble();
			teclado.nextLine();
			
			Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, kms);
			
			out.writeObject(veiculo);
			
			String resposta = (String) in.readObject();
			System.out.println(resposta);
			
			in.close();
			out.close();
			s.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		teclado.close();
		
	}
}
