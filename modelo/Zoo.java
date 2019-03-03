package modelo;
public class Zoo{
	
	//Atributos
	private int quantitySpecies;
	private String name;
	private String store;
	
	//Relaciones
	private Exhibicion australia;
	
	//Metodos
	
	public Zoo (int quantitySpecies, String name, String store, Exhibicion australia){
		this.quantitySpecies = quantitySpecies;
		this.name = name;
		this.store = store;	
		this.australia = australia;
	}
	
	public int getQantitySpecies() {
		return quantitySpecies;
	}
	public void setQantitySpecies (int quantitySpecies){
		this.quantitySpecies = quantitySpecies;
	}
	
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	public String getStore(){
		return store;
	}
	public void setStore (String store) {
		this.store = store;
	}
	
	public Exhibicion getAustralia() {
		return australia;
	}
	public void setAustralia (Exhibicion australia) {
		this.australia = australia;
	}
}