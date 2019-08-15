package temperatureConverter;

public class Converter<Temperature> {

	public Fahrenheit convertCelsiusToFahrenheit(Celsius c, Class<Fahrenheit> f) {

		int result = (int) Math.round(c.value * 1.8 + 32);

		Fahrenheit r = new Fahrenheit(result);

		return r;
	}

	public Kelvin convertCelsiusToKelvin(Celsius c, Class<Kelvin> k) {

		int result = (int) Math.round(c.value + 273.15);

		Kelvin r = new Kelvin(result);

		return r;
	}

	public Celsius convertFahrenheitToCelsius(Fahrenheit f, Class<Celsius> c) {

		int result = (int) Math.round((f.value - 32) / 1.8);

		Celsius r = new Celsius(result);

		return r;
	}
	
	public Kelvin convertFahrenheitToKelvin(Fahrenheit f, Class<Kelvin> k) {

		int result = (int) Math.round((f.value - 32) / 1.8 + 273.15);

		Kelvin r = new Kelvin(result);

		return r;
	}
	
	public Celsius convertKelvinToCelsius(Kelvin k, Class<Celsius> c) {

		int result = (int) Math.round(k.value - 273.15);

		Celsius r = new Celsius(result);

		return r;
	}
	
	public Fahrenheit convertKelvinToFahrenheit(Kelvin k, Class<Fahrenheit> f) {

		int result = (int) Math.round((k.value - 273.15) * 1.8 + 32);

		Fahrenheit r = new Fahrenheit(result);

		return r;
	}
	
}
