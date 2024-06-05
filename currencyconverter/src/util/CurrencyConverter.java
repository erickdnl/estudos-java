package util;

public class CurrencyConverter {

	public static double converter(double prc, double bght) {
		return prc * bght;
	}
	
	public static double iof(double converted) {
		return (6.0 / 100) * converted;
	}
}
