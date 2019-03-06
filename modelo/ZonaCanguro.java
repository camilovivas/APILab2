package modelo;
public class ZonaCanguro{
	
	//Atributos
	private double temperature;
	private double humidity;
	private double water;
	private double food;
	//relaciones
	private Ambiente a1;
	private Ambiente a2;
	private Ambiente a3;
	
	//Metodos
	public ZonaCanguro (int temperature, int humidity, double water, double food, Ambiente a1, Ambiente a2, Ambiente a3) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.water = water;
		this.food = food;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		
	}
	
	
	public double getWater() {
		return (getA1().getC1().getImc()*1.5 + getA1().getC2().getImc()*1.5 + getA1().getC3().getImc()*1.5)/3;
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
	
	
	public Ambiente getA1() {
		return a1;
	}
	public void setA1 (Ambiente a1) {
		this.a1 = a1;
	}
	
	
	public Ambiente getA2() {
		return a2;
	}
	public void setA2 (Ambiente a2) {
		this.a2 = a2;
	}
	
	
	public Ambiente getA3() {
		return a3;
	}
	public void setA3 (Ambiente a3) {
		this.a3 = a3;
	}
	public double getFood(){
		return food;
	}
	public void setFoot(double food){
		this.food = food;
	}
	
	public String showInfoFood(){
		String mensaje = (" ");
		mensaje += (getA1().getC1().calcularComida());
		mensaje += (getA1().getC2().calcularComida());
		mensaje += (getA1().getC3().calcularComida());
		mensaje += (getA2().getC1().calcularComida());
		mensaje += (getA2().getC2().calcularComida());
		mensaje += (getA2().getC3().calcularComida());
		mensaje += (getA3().getC1().calcularComida());
		mensaje += (getA3().getC2().calcularComida());
		mensaje += (getA3().getC3().calcularComida());
		
		return mensaje;
		
	}
	
	
	public String showInfoZonaCanguro (){
		String mensaje = (" ");
		
		mensaje += ("la temperatura es:"+"\n"+getTemperature());
		mensaje += ("la cantidad de agua del ambiente es"+"\n"+getWater());
		mensaje += ("la humedad del ambiente es:"+"/n"+getHumidity());
		
		return mensaje;
		
	}

	

}