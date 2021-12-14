package modelo;

public class Empleado extends Persona{
	
	private float salario;
	
	public Empleado() {
		super();
		this.salario=0;
	}
	public Empleado(String nombre, int edad, String dni) {
		super(nombre,edad,dni);
		this.salario=0f;
	}
	public Empleado(String nombre, int edad, String dni,float salario) {
		super(nombre,edad,dni);
		this.salario=salario;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return "Empleado: "+getNombre()+
				//","+getEdad()+","+getDni();
		return "Empleado -> "+super.toString()+" salario:"+salario;
	}
	
}
