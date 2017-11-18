package org.pkk.service;

import net.webservicex.temp.ConvertTemperature;
import net.webservicex.temp.TemperatureUnit;

public class TempConverter {

	public static void main(String[] args) {
		float temp = (float) 56.3;
		ConvertTemperature temp1 = new ConvertTemperature();
		double result = temp1.getConvertTemperatureSoap().convertTemp(temp, TemperatureUnit.DEGREE_CELSIUS, TemperatureUnit.DEGREE_FAHRENHEIT);
		System.out.println(result);
		}

}
