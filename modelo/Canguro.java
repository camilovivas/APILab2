package model;
public class Canguro{
	
	//Atributos
	private String name;
	private double weight;
	private double height;
	/** 1 = masculino, 2 = femenino */
	private int sex;
	private String bloodType;
	private double imc;
	private double areaCanguro;
	
	
	//Relacion
	private Fecha birhDate;
	
	//Metodos
	public Canguro (String name, double weight, double height, int sex, String bloodType, double imc, Fecha birhDate) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.sex = sex;
		this.bloodType = bloodType;
		this.imc = imc;
		this.birhDate = birhDate;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	
	public double getWeigth() {
		return weight;
	}
	public void setWeigth (double weight) {
		this.weight = weight;
	}
	
	
	public double getHeigth() {
		return height;
	}
	public void setHeigth (double height){
		this.height = height;
	}
	
	
	public int getSex(){
		return sex;
	}
	public void setSex (int sex) {
		this.sex = sex;
	}
	
	
	public String getBloodType() {
	return bloodType;
	}
	public void setBloodType (String bloodType){
		this.bloodType = bloodType;
	}
	
	
	public double getImc() {
		return weight/Math.pow (height, 2);
	}
	public void setImc (double imc) {
		this.imc = imc;
	}
	
	
	public Fecha getBirhDate() {
		return birhDate;
	}
	public void setBirhDate (Fecha birhDate) {
		this.birhDate = birhDate;
	}
	
	
	public double getAreaCanguro() {
		return height*8;
	}
	public void setAreaCanguro (double areaCanguro) {
		this.areaCanguro = areaCanguro;
	}
	
	public String ShowInfoCanguro(){
		String mensaje = (" ");
		
		mensaje += ("el noombre del canguro es:"+"\n"+getName()); //+"\n"+relacion.getAustralia().getZ1().getA1().getC2().getName()+"\n"+relacion.getAustralia().getZ1().getA1().getC3().getName()");
		mensaje += ("el peso del canguro es:"+"\n"+getWeigth());
		mensaje += ("la altura del canguro es:"+"\n"+getHeigth());
		mensaje += ("el sexo del canguro es:"+"\n"+getSex());
		mensaje += ("Tipo de sangre del canguro:"+"\n"+getBloodType());
		mensaje += ("el imc del canguro es:"+"\n"+getImc());
		
		return mensaje;
		
	}
	public String ShowNameCanguro(){
		 String mensaje = (" ");
		 
		mensaje += ("el noombre del canguro es:"+"\n"+getName());
		
		return mensaje;
	}
	
	public boolean vowel(){
		boolean haveVowels= false;
		
		if (getName().charAt(0) == 'a' || getName().charAt(0) == 'e' || getName().charAt(0) == 'i' || getName().charAt(0) == 'o' || getName().charAt(0) == 'u'|| getName().charAt(0) == 'A' || getName().charAt(0) == 'E' || getName().charAt(0) == 'I' || getName().charAt(0) == 'O' || getName().charAt(0) == 'U' && getName().charAt(getName().length()-1)=='a' || getName().charAt(getName().length()-1)=='e' || getName().charAt(getName().length()-1)=='i' || getName().charAt(getName().length()-1)=='o' || getName().charAt(getName().length()-1)=='u') { 
		haveVowels = true ;
		}
		else {
		haveVowels = false;
		}			
		return haveVowels;
	}
	public String printName(boolean haveVowels){
		String name = (" ");
		
		if (haveVowels == true){
			name = getName();
			
		}
		else{
			name = "no tiene vocales al inicio y al final";
		}
		return name;
	}
	
	public double calcularComida(){
		double mensaje = (0.0);
		
		if(weight < 30) {
			mensaje = weight*0.8;
		} 
		else if (weight >= 30 && weight <= 48){
			mensaje = weight*1.1;
		}
		else { 
		mensaje =0.4*(weight-48)+40;
		}
		return mensaje;
	}
	
	//public String carcularFecha (){
		//String mensaje = (" ");
	
		//if (dayBorn > 7){
		
			//mensaje = ("las semanas del canguro son")+dayBorn/7;
		
		//}
		//else if (dayBorn < 7){
			
			//mensaje = ("el canguro tiene menos de una semana");
			
		//}
	
		//return mensaje;
	
	//}
	public void newCanguro(){
		//setName;
		//setSex;
		//setWeigth;
		//setBloodType;
		//setBirhDate;
	}
	
}	