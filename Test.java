import modelo.Empleado;
import modelo.Persona;

public class Test {

	public static void main(String[] args) {

		Persona p1=new Persona("María",25,"123");
		Persona p2=new Persona("María",25,"123");
		Persona p3=new Persona();		
		
		Empleado e1=new Empleado();
		e1.setDni("1"); e1.setEdad(9); e1.setNombre("C");
		System.out.println(e1);
	
	}

}
