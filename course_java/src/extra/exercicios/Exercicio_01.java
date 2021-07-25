package extra.exercicios;

import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char genter = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %n %s which price is $ %.1f %n %s, whitch price is $ %.2f%n", product1,price1,product2,price2);
		System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age,code,genter);
		System.out.printf("%nMeasue with eitght decimal palces: %f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f", measure);
		
		Locale l = new Locale("pt","BR");
		NumberFormat virgula = NumberFormat.getInstance(l);
		
		System.out.printf("US decimal point: %s",virgula.format(measure));
		
		
	}

}
