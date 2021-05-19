
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(100);
		System.out.println(contaDaAna.saca(101));
		
		contaDaAna.saca(101);
		
		System.out.println(contaDaAna.getSaldo());
	}
}
