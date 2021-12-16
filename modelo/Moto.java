package modelo;

public class Moto extends Vehiculo {
	
	private String patilla;

	public Moto(String matricula, double kms, String marca, String modelo, String patilla) {
		super(matricula, kms, marca, modelo);
		this.patilla = patilla;
	}

	public Moto() {
		super("", 0, "", "");
		this.patilla="";
	}
	
	public String getPatilla() {
		return patilla;
	}

	public void setPatilla(String patilla) {
		this.patilla = patilla;
	}

	@Override
	public String toString() {
		return "Moto\n" + super.toString() + "\nPatilla:" + patilla;
	}
}
