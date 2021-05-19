
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente natalia = new Cliente();
		natalia.nome = "Natalia Cabrera";
		natalia.cpf = "222.222.222-22";
		natalia.profissao = "programador";
		
		Conta contaDaNatalia = new Conta();
		contaDaNatalia.deposita(100);
		
		// associa o cliente natalia a conta contaDaNatalia
		contaDaNatalia.titular = natalia;
		System.out.println(contaDaNatalia.titular.nome);
	}

}
