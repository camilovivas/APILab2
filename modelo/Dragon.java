package modelo;
public class Dragon{
	
	//Atributos
	private String name;
	private double weight;
	private double height;
	/** 1 = masculino, 2 = femenino */
	private int sex;
	private String bloodType;
	private double imc;
	
	//Relacion
	private Fecha birhDate;
	
	//Metodos
	public Dragon (String name, double weight, double height, int sex, String bloodType, double imc, Fecha birhDate) {
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
	
	public String getBloodType() {
	return bloodType;
	}
	public void setBloodType (String bloodType){
		this.bloodType = bloodType;
	}
	
	public int getSex(){
		return sex;
	}
	public void setSex (int sex) {
		this.sex = sex;
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
	
	public String ShowInfoDragon(){
		String mensaje = (" ");
		mensaje += ("el noombre del dragon es:"+"\n"+getName()); //+"\n"+relacion.getAustralia().getZ1().getA1().getC2().getName()+"\n"+relacion.getAustralia().getZ1().getA1().getC3().getName()");
		mensaje += ("el peso del dragon es:"+"\n"+getWeigth());
		mensaje += ("la altura del dragon es:"+"\n"+getHeigth());
		mensaje += ("el sexo del dragon es:"+"\n"+getSex());
		mensaje += ("Tipo de sangre del dragon:"+"\n"+getBloodType());
		mensaje += ("el imc del dragon es:"+"\n"+getImc());
		
		return mensaje;
	}

	
	public boolean vowel(){
		boolean haveVowels= false;
		
		if (getName().charAt(0) == 'a' || getName().charAt(0) == 'e' || getName().charAt(0) == 'i' || getName().charAt(0) == 'o' || getName().charAt(0) == 'u' || getName().charAt(0) == 'A' || getName().charAt(0) == 'E' || getName().charAt(0) == 'I' || getName().charAt(0) == 'O' || getName().charAt(0) == 'U' && getName().charAt(getName().length()-1)=='a' || getName().charAt(getName().length()-1)=='e' || getName().charAt(getName().length()-1)=='i' || getName().charAt(getName().length()-1)=='o' || getName().charAt(getName().length()-1)=='u') { 
		haveVowels = true ;
		}
		else {
		haveVowels = false;
		}			
		return haveVowels;
	}
}