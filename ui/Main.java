package ui;

import model.*;
import java.util.*;

public class Main {
	
	private Zoo relacion;
	private Scanner entrada;
	
	public Main() {
		
		init();
		entrada = new Scanner(System.in);
	}
	
	public static void main (String[] args) {
		Main miob = new Main();
		miob.showMenu();
		//miob.showMessageExample();
		
	}
	
	public void showMenu(){
			int repeticiones = 0;
			while (repeticiones!=6){
				System.out.println("======================================================================" );
				System.out.println("              Bienvenido al menu del Zoologico de Cali");
				System.out.println("======================================================================\n" );
				System.out.println("Elija la accion que desea realizar: \n\n1. Eliminar un canguro. \n2. Crear canguro. \n3. Cambiar canguro de ambiente. \n4. Ver los canguros cuyos nombres empiezan y terminan en vocal.\n5. Ver un reporte de las fechas de vacunacion.\n6. Salir."); // cuando cree el canguro pregunte en que ambiente lo quiere
				System.out.println(" ");
		
			int opcionElegida = entrada.nextInt();
			//System.out.println("Opcion elegida -> "+opcionElegida);
		
			switch (opcionElegida){
				case 1:
					System.out.println("A continuacion se encuentran todos los canguros existentes en cada ambiente, por favor busque el que desea eliminar..." );
					System.out.println(" ");
					System.out.println("Los canguros del ambiente 1 son:"+"\n"+relacion.getAustralia().getZ1().getA1().getC1().ShowNameCanguro()+"\n"+relacion.getAustralia().getZ1().getA1().getC2().ShowNameCanguro()+"\n"+relacion.getAustralia().getZ1().getA1().getC3().ShowNameCanguro());
					System.out.println(" ");
					System.out.println("Los canguros del ambiente 2 son:"+"\n"+relacion.getAustralia().getZ1().getA2().getC1().ShowNameCanguro()+"\n"+relacion.getAustralia().getZ1().getA2().getC2().ShowNameCanguro()+"\n"+relacion.getAustralia().getZ1().getA2().getC3().ShowNameCanguro());
					System.out.println(" ");
					System.out.println("Los canguros del ambiente 3 son:"+"\n"+relacion.getAustralia().getZ1().getA3().getC1().ShowNameCanguro()+"\n"+relacion.getAustralia().getZ1().getA3().getC2().ShowNameCanguro()+"\n"+relacion.getAustralia().getZ1().getA3().getC3().ShowNameCanguro());
					System.out.println(" ");
	
					System.out.println("Introduzca el nombre del canguro a eliminar");
					String nameE = entrada.next();
			
					if (nameE == relacion.getAustralia().getZ1().getA1().getC1().ShowNameCanguro()){
						relacion.getAustralia().getZ1().getA1().setC1(null);
					}
					else if (nameE == relacion.getAustralia().getZ1().getA1().getC2().ShowNameCanguro()){
						relacion.getAustralia().getZ1().getA1().setC2(null);
					}
					else if (nameE == relacion.getAustralia().getZ1().getA1().getC3().ShowNameCanguro()){
						relacion.getAustralia().getZ1().getA1().setC3(null);
					}
					else if (nameE == relacion.getAustralia().getZ1().getA2().getC1().ShowNameCanguro()){
						relacion.getAustralia().getZ1().getA2().setC1(null);
					}
					else if (nameE == relacion.getAustralia().getZ1().getA2().getC2().ShowNameCanguro()){
						relacion.getAustralia().getZ1().getA2().setC2(null);
					}
					else if (nameE == relacion.getAustralia().getZ1().getA2().getC3().ShowNameCanguro()){
						relacion.getAustralia().getZ1().getA2().setC3(null);
					}
					else if (nameE == relacion.getAustralia().getZ1().getA3().getC1().ShowNameCanguro()){
						relacion.getAustralia().getZ1().getA3().setC1(null);
					}
					else if (nameE == relacion.getAustralia().getZ1().getA3().getC2().ShowNameCanguro()){
						relacion.getAustralia().getZ1().getA3().setC2(null);
					}
					else if (nameE == relacion.getAustralia().getZ1().getA3().getC3().ShowNameCanguro()){
						relacion.getAustralia().getZ1().getA3().setC3(null);
					}
					else{
					System.out.println("ingrese un nombre existente");
					}
			
					System.out.println("Se ha eliminado el canguro con exito");
		
				break;
		
					//crear canguro
				case 2:
					System.out.println("introduce el ambiente al que quieres que pertenezca el nuevo canguro...");//mensaje = 
					int ambiente = entrada.nextInt();//por relaciones nos vamos al ambiente que ingrese
			
			if (ambiente == 1 && relacion.getAustralia().getZ1().getA1().verificarSiExiten() == true){
					System.out.println("introduce el nombre del canguro...");
					String name = entrada.next(); 
			
					System.out.println("introduce la estatura del canguro...");
					double height = entrada.nextDouble();
		
					System.out.println("introduce el peso del canguro...");
					double weight = entrada.nextDouble();
		
					System.out.println("introduzca 1 = masculino o 2 = femenino");
					int sex = entrada.nextInt();
				
					System.out.println("inngrese el tipo de sangre");
					String bloodType = entrada.next();
			
					System.out.println("introduzca el numero de dias que lleva de vida");
					int dayBorn = entrada.nextInt();
		
					System.out.println("introduce el dia de nacimiento...");
					int day = entrada.nextInt();
		
					System.out.println("introduce el mes de nacimiento...");
					int month = entrada.nextInt();
		
					System.out.println("introduce el año de nacimiento...");
					int year = entrada.nextInt();
					Fecha fn = new Fecha(day, month, year);
					Canguro cn = new Canguro (name, height, weight,sex, bloodType, weight/Math.pow (height, 2), fn);
					System.out.println("Se ha creado el canguro con exito");
			}
			else if (ambiente == 2 && relacion.getAustralia().getZ1().getA2().verificarSiExiten() == true){
					System.out.println("introduce el nombre del canguro...");
					String name = entrada.next(); 
			
		
					System.out.println("introduce la estatura del canguro...");
					double height = entrada.nextDouble();
		
					System.out.println("introduce el peso del canguro...");
					double weight = entrada.nextDouble();
		
					System.out.println("introduzca 1 = masculino o 2 = femenino");
					int sex = entrada.nextInt();
				
					System.out.println("inngrese el tipo de sangre");
					String bloodType = entrada.next();
			
					System.out.println("introduzca el numero de dias que lleva de vida");
					int dayBorn = entrada.nextInt();
		
					System.out.println("introduce el dia de nacimiento...");
					int day = entrada.nextInt();
		
					System.out.println("introduce el mes de nacimiento...");
					int month = entrada.nextInt();
		
					System.out.println("introduce el año de nacimiento...");
					int year = entrada.nextInt();
					Fecha fn = new Fecha(day, month, year);
					Canguro cn = new Canguro (name, height, weight,sex, bloodType, weight/Math.pow (height, 2), fn);
					System.out.println("Se ha creado el canguro con exito");
			}
			else if (ambiente == 3 && relacion.getAustralia().getZ1().getA3().verificarSiExiten() == true){
					System.out.println("introduce el nombre del canguro...");
					String name = entrada.next(); 
			
		
					System.out.println("introduce la estatura del canguro...");
					double height = entrada.nextDouble();
		
					System.out.println("introduce el peso del canguro...");
					double weight = entrada.nextDouble();
		
					System.out.println("introduzca 1 = masculino o 2 = femenino");
					int sex = entrada.nextInt();
				
					System.out.println("inngrese el tipo de sangre");
					String bloodType = entrada.next();
			
					System.out.println("introduzca el numero de dias que lleva de vida");
					int dayBorn = entrada.nextInt();
		
					System.out.println("introduce el dia de nacimiento...");
					int day = entrada.nextInt();
		
					System.out.println("introduce el mes de nacimiento...");
					int month = entrada.nextInt();
		
					System.out.println("introduce el año de nacimiento...");
					int year = entrada.nextInt();
					Fecha fn = new Fecha(day, month, year);
					Canguro cn = new Canguro (name, height, weight,sex, bloodType, weight/Math.pow (height, 2), fn);
				
					System.out.println("Se ha creado el canguro con exito");
			}
				break;
		
		
				case 3:
					System.out.println("a continuacion se encuentran todos los canguros existentes clasificados por ambientes, por favor busque el que desea cambiar..." );
					System.out.println(" ");
					System.out.println("los canguros del ambiente 1 son:"+"\n"+relacion.getAustralia().getZ1().getA1().getC1().ShowInfoCanguro()+"\n"+relacion.getAustralia().getZ1().getA1().getC2().ShowInfoCanguro()+"\n"+relacion.getAustralia().getZ1().getA1().getC3().ShowInfoCanguro());
					System.out.println(" ");
					System.out.println("los canguros del ambiente 2 son:"+"\n"+relacion.getAustralia().getZ1().getA2().getC1().ShowInfoCanguro()+"\n"+relacion.getAustralia().getZ1().getA2().getC2().ShowInfoCanguro()+"\n"+relacion.getAustralia().getZ1().getA2().getC3().ShowInfoCanguro());
					System.out.println(" ");
					System.out.println("los canguros del ambiente 3 son:"+"\n"+relacion.getAustralia().getZ1().getA3().getC1().ShowInfoCanguro()+"\n"+relacion.getAustralia().getZ1().getA3().getC2().ShowInfoCanguro()+"\n"+relacion.getAustralia().getZ1().getA3().getC3().ShowInfoCanguro());
					System.out.println(" ");
		
				break;
		
		
				case 4:
					System.out.println("las siguientes canguros son los que tienen una vocal en su nombre al iniciar y al terminar:");
					System.out.println("funciona:"+relacion.vo());
					//System.out.println("los canguros del ambiente 1 son:"+"\n"+relacion.getAustralia().getZ1().getA1().getC1().vowel()+"\n"+relacion.getAustralia().getZ1().getA1().getC2().vowel()+"\n"+relacion.getAustralia().getZ1().getA1().getC3().vowel());
					//System.out.println(" ");
					//System.out.println("los canguros del ambiente 2 son:"+"\n"+relacion.getAustralia().getZ1().getA2().getC1().vowel()+"\n"+relacion.getAustralia().getZ1().getA2().getC2().vowel()+"\n"+relacion.getAustralia().getZ1().getA2().getC3().vowel());
					//System.out.println(" ");
					//System.out.println("los canguros del ambiente 3 son:"+"\n"+relacion.getAustralia().getZ1().getA3().getC1().vowel()+"\n"+relacion.getAustralia().getZ1().getA3().getC2().vowel()+"\n"+relacion.getAustralia().getZ1().getA3().getC3().vowel());
					//System.out.println("Los canguros que tienen una vocal al inicio y al final de su nomre son:");
			
					if (relacion.getAustralia().getZ1().getA1().getC1().vowel() == true){
						System.out.println(" "+relacion.getAustralia().getZ1().getA1().getC1().getName());
					}
					else if (relacion.getAustralia().getZ1().getA1().getC2().vowel() == true){
						System.out.println(" "+relacion.getAustralia().getZ1().getA1().getC2().getName());
					}
					else if (relacion.getAustralia().getZ1().getA1().getC3().vowel() == true){
						System.out.println(" "+relacion.getAustralia().getZ1().getA1().getC3().getName());
					}
					else if (relacion.getAustralia().getZ1().getA2().getC1().vowel() == true){
						System.out.println(" "+relacion.getAustralia().getZ1().getA2().getC1().getName());
					}
					else if (relacion.getAustralia().getZ1().getA2().getC2().vowel() == true){
						System.out.println(" "+relacion.getAustralia().getZ1().getA2().getC2().getName());
					}
					else if (relacion.getAustralia().getZ1().getA2().getC3().vowel() == true){
						System.out.println(" "+relacion.getAustralia().getZ1().getA2().getC3().getName());
					}
					else if (relacion.getAustralia().getZ1().getA3().getC1().vowel() == true){
						System.out.println(" "+relacion.getAustralia().getZ1().getA3().getC1().getName());
					}
					else if (relacion.getAustralia().getZ1().getA3().getC2().vowel() == true){
						System.out.println(" "+relacion.getAustralia().getZ1().getA3().getC2().getName());
					}
					else if (relacion.getAustralia().getZ1().getA3().getC3().vowel() == true){
						System.out.println(" "+relacion.getAustralia().getZ1().getA3().getC3().getName());
					}
					else{
					System.out.println("No hay canguros con nombre que inicie y termine en vocal");
					}
		
				break;
		
				case 5:
		
				break;
		
				case 6:
		
					System.out.println("======================================================================" );
					System.out.println("                             BYE BYE...");
					System.out.println("======================================================================\n\n" );
					repeticiones = 6;
				break;
		
				default: 
				System.out.println("___________________________________________________");
				System.out.println("la opcion ingresada no es valida");
				System.out.println("___________________________________________________\n\n");
			}
		
		}
	}

	
	public void showMessageExample(){
		
		System.out.println("el "+relacion.getName()+" tiene:"); 
		
		System.out.println(relacion.getQantitySpecies()+" especies "+"y una tienda que se llama: "+relacion.getStore());
		
		System.out.println("va a estrenar una exhibicion llamada : "+relacion.getAustralia().getName()+","+" la cual va a obtener 2 zonas (z1 y z2)" );
		
		System.out.println("la z1 va a ser de canguros y va a tener los siguientes parametros: \nTemperature: "+relacion.getAustralia().getZ1().getTemperature()+" \nHumidity:"+relacion.getAustralia().getZ1().getHumidity()+" \nWater:"+relacion.getAustralia().getZ1().getWater()+" Ltrs"+"\ny tiene 3 ambientes (a1, a2. a3) los cuales tienen un area que varia segun los canguros que esten en el:"+"\nal tiene un area de:"+relacion.getAustralia().getZ1().getA1().getArea()+" \na2 tiene un area de:"+relacion.getAustralia().getZ1().getA2().getArea()+"\na3 tiene un area de:"+relacion.getAustralia().getZ1().getA3().getArea());
		
		System.out.println("la z2 va a ser de dragones y va a tener los siguientes parametros: \nTemperature: "+relacion.getAustralia().getZ2().getTemperature()+" \nHumidity:"+relacion.getAustralia().getZ2().getHumidity()+" \nWater:"+relacion.getAustralia().getZ2().getWater()+" Ltrs"+"\ny tiene una pareja de dragones barbados (d1 y d2) \nd1 esta identificado con los siguientes parametros: \nname:"+relacion.getAustralia().getZ2().getD1().getName()+"\nweigth:"+relacion.getAustralia().getZ2().getD1().getWeigth()+" g."+"\nheigth: "+relacion.getAustralia().getZ2().getD1().getHeigth()+" cm."+"\nsex: "+relacion.getAustralia().getZ2().getD1().getSex()+" (1 = masculino, 2 = femenino)"+"\nblood type:"+relacion.getAustralia().getZ2().getD1().getBloodType()+"\nimc:"+relacion.getAustralia().getZ2().getD1().getImc()+"\ny el d2 esta identificado con los siguientes parametros: \nname: "+relacion.getAustralia().getZ2().getD2().getName()+"\nweigth:"+relacion.getAustralia().getZ2().getD2().getWeigth()+" g."+"\nheigth: "+relacion.getAustralia().getZ2().getD2().getHeigth()+" cm."+"\nsex: "+relacion.getAustralia().getZ2().getD2().getSex()+" (1 = masculino, 2 = femenino)"+"\nblood type:"+relacion.getAustralia().getZ2().getD2().getBloodType()+"\nimc:"+relacion.getAustralia().getZ2().getD2().getImc() );
		
	}
	
	public void init(){
		
		
		Fecha f1 = new Fecha(23, 9, 2014);
		Dragon d1 = new Dragon("Sofia", 400.0, 50.0, 2, "O", 0.16, f1);
		
		Fecha f2 = new Fecha(2, 10, 2014);
		Dragon d2 = new Dragon("Andres", 420.0, 60.0, 1, "B", 0.11, f2);
		
		ZonaDragon z2 = new ZonaDragon(40, 45, 0.30275,  d1, d2);
		
		
		Fecha f3 = new Fecha(21, 12, 2012);
		Canguro c1 = new Canguro("Camilo", 85.0, 1.5, 1, "AB", 37.0, f3);
		
		Fecha f4 = new Fecha(11, 1, 2013);
		Canguro c2 = new Canguro("Leidy", 78.0, 1.3, 2, "A", 46.1, f4);
		
		Fecha f5 = new Fecha(17, 2, 2013);
		Canguro c3 = new Canguro("Lorena", 80.0, 1.4, 2, "B", 40.8, f5);
		
		Fecha f6 = new Fecha(21, 12, 2012);
		Canguro c4 = new Canguro("Sebastian", 85.0, 1.5, 1, "AB", 37.0, f6);
		
		Fecha f7 = new Fecha(11, 1, 2013);
		Canguro c5 = new Canguro("Michel", 78.0, 1.3, 2, "A", 46.1, f7);
		
		Fecha f8 = new Fecha(17, 2, 2013);
		Canguro c6 = new Canguro("Daniela", 80.0, 1.4, 2, "B", 40.8, f8);
		
		Fecha f9 = new Fecha(21, 12, 2012);
		Canguro c7 = new Canguro("Johan", 85.0, 1.5, 1, "AB", 37.0, f9);
		
		Fecha f10 = new Fecha(11, 1, 2013);
		Canguro c8 = new Canguro("Karen", 78.0, 1.3, 2, "A", 46.1, f10);
		
		Fecha f11 = new Fecha(17, 2, 2013);
		Canguro c9 = new Canguro("Sidney", 80.0, 1.4, 2, "B", 40.8, f11);
		
		Ambiente a1 = new Ambiente(33.6, c7, c8, c9);
		Ambiente a2 = new Ambiente(33.6, c4, c5, c6);
		Ambiente a3 = new Ambiente(33.6, c1, c2, c3);
		ZonaCanguro z1 = new ZonaCanguro(38, 45, 185.85, 0.0, a1, a2 ,a3);  
		Exhibicion australia = new Exhibicion("Australia", z1, z2); 
		relacion = new Zoo(270, "Zoologico de Cali", "Zoositos", australia);
		
		//relacion.getAustralia().getZ2().getD1().getImc()
		
	}
}