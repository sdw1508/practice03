package prob3;

public class CurrencyConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dollar = 1000;
		CurrencyConverter.setRate(0.3);
		System.out.println(CurrencyConverter.toKRW(dollar));
		
	}

}
