import Utils.Storage;
import modelo.Coche;
import modelo.Moto;
import modelo.Tractor;
import modelo.Vehiculo;

public class Test {

	public static void main(String[] args) {
		Coche c1=new Coche("1",0,"Renault","Clio","Antilluvia");
		Tractor t1=new Tractor("2",10,"Lamborghini","Campestre","2 ejes");
		Moto m1= new Moto("3",20,"Yamaha","YZR","Si");
		
		Vehiculo[] vehiculos={c1,t1,m1};
		
		Vehiculo v=new Vehiculo("",0,"Cualquiera","otro");
		Storage.saveVehiculo(v, "db.txt");
		
		
		
		/*for(Vehiculo x:vehiculos) {
			if(x==null) {
				break;
			}
			System.out.println(x);  //vehiculos[i]
			System.out.println("----------");
		}*/
		/*
		boolean encontrado=false;
		for(int i=0;i<vehiculos.length && !encontrado;i++) {
			if(vehiculos[i]==null) {
				encontrado=true;
			}
			System.out.println(vehiculos[i]);
			System.out.println("------------");
			
		}*/

	}
}
