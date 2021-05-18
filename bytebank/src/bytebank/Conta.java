package bytebank;

public class Conta {
	
	//Atributos
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

}
