package modelo;
public class Exhibicion{
	
	//Atributos
	private String name;
	
	//Relaciones
	private ZonaCanguro z1; //canguros
	private ZonaDragon z2; //dragones
	
	//Metodos
	public Exhibicion (String name, ZonaCanguro z1, ZonaDragon z2) {
		this.name = name;
		this.z1 = z1;
		this.z2 = z2;
	}
	
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	
	public ZonaCanguro getZ1() {
		return z1;
	}
	public void setZ1 (ZonaCanguro z1) {
		this.z1 = z1;
	}
	
	
	public ZonaDragon getZ2() {
		return z2;
	}
	public void setZ2 (ZonaDragon z2) {
		this.z2 = z2;
	}
}

