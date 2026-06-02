package aula15;

public class D3Smartphone implements D1Pc, D2Celular {
	String cel;
	String email;

	public D3Smartphone(String cel, String email) {
		super();
		this.cel = cel;
		this.email = email;
	}

	@Override
	public void realizaChamada() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verificaEmail() {
		// TODO Auto-generated method stub
		
	}

}
