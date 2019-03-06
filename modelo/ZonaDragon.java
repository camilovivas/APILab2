package model;
public class ZonaDragon{
	
	//Atributos
	private double temperature;
	private double humidity;
	private double water;
	
	//relaciones
	private Dragon d1;
	private Dragon d2;
	
	//Metodos
	public ZonaDragon (int temperature, int humidity, double water, Dragon d1, Dragon d2) {
		this.water = water;
		this.humidity = humidity;
		this.temperature = temperature;
		this.d1 = d1;
		this.d2 = d2;
	
	}
	
	
	public double getWater() {
		return (getD1().getImc()*0.75)*1.5;
	}
	public void setWater (double water) {
		this.water = water;
	}
	
	
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity (double humidity) {
		this.humidity = humidity;
	}
	
	
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature (double temperature) {
		this.temperature = temperature;
	}
	
	public Dragon getD1() {
		return d1;
	}
	public void setD1 (Dragon d1) {
		this.d1 = d1;
	}
	
	
	public Dragon getD2() {
		return d2;
	}
	public void setD2 (Dragon d2) {
		this.d2 = d2;
	}
	
	public String vocalD(){
		String mensaje = (" ");
		mensaje += getD1().printName();
		mensaje += getD2().printName();
				
		return mensaje;
	}

}