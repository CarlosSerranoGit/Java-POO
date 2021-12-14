package modelo;

public class Persona {
	private String nombre;
	private int edad;
	protected String dni;

	public Persona(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	public Persona() {
		this("", -1, "");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]" + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null) {
			if (this == obj) {
				result = true;
			} else {
				if (this.getClass() == obj.getClass()) {
					Persona tmp = (Persona) obj;
					if (tmp!=null && this.dni!=null 
							&& this.dni == tmp.dni) {
						result = true;
					}
				}
			}
		}
		return result;
	}

}
