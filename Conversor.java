package fiap;

public class Conversor {
	
	//Converte Celsius para Fahrenheit
	
	public double celsiusParaFahrenheit(double tempCelsius) {
		return ((tempCelsius * 9) / 5) + 32;
		
		}
	
	//Converte Fahrenheit para Celsius
	
	public double fahrenheitParaCelsius (double tempFahren) {
		return ((tempFahren - 32) * 5) / 9;
		
	}





}
