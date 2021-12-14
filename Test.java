import modelo.Empleado;
import modelo.Persona;

public class Test {

	public static void main(String[] args) {

		Persona p1=new Persona("María",25,"123");
		Empleado e1=new Empleado("María",25,"123",1900);
	
		Persona x1= new Empleado();
		Empleado e2=(Empleado)x1;
		
		
		System.out.println(p1==e1);
		
		System.out.println(p1.equals(e1));
		System.out.println(e1.equals(p1));
	}

}
