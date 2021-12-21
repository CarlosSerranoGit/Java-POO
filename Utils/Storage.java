package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import modelo.Vehiculo;

public class Storage {
	public static boolean saveVehiculo(Vehiculo aguardar, String file) {
		boolean result=false;
		try {
			FileOutputStream f=new FileOutputStream(new File(file));
			ObjectOutputStream o=new ObjectOutputStream(f);
			o.writeObject(aguardar);
			o.close();
			f.close();
			result=true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static Vehiculo readVehiculo(String file) {
		Vehiculo result=null;
		try {
			FileInputStream f=new FileInputStream(new File(file));
			ObjectInputStream i=new ObjectInputStream(f);
			result=(Vehiculo)i.readObject();
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
}
