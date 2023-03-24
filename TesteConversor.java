package fiap;

import java.util.Scanner;

public class TesteConversor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Conversor cv = new Conversor();
		double celsius, fahrenheit;
		
		System.out.println("*-* Conversor *-*");
		System.out.println("1 - Celsius para Fahrenheit");
		System.out.println("2- Fahrenheit para Celsius");
        System.out.println("Opção: ");
        int op = input.nextInt();
        
        if (op == 1) {
        	System.out.println("Celsius: ");
        	celsius = input.nextDouble();
        	fahrenheit = cv.celsiusParaFahrenheit(celsius);
        	System.out.println(celsius + " graus Celsius é equeivalente à " + fahrenheit + " fahrenheit");
        	
        } else if (op == 2) {
        	System.out.println("Fahrenheit: ");
        	fahrenheit = input.nextDouble();
        	celsius = cv.fahrenheitParaCelsius(fahrenheit);
        	System.out.println(fahrenheit + " graus Fahrenheit é equivalente à " + celsius + " Celsius");
       
        } else { 
        	System.out.println("Opção invalida.");
        }
		
		
	}

}
