package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		//Aqui referenciando deixa o número na memoria igual
		// Na referencia segundaConta está referenciando ao numero de memoria da primeiraConta
		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		//Se referencia para o mesmo objeto
		segundaConta.saldo +=100;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
			}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		}
	}

