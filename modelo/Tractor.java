 package modelo;

public class Tractor extends Vehiculo{
	
	private String remolque;

	public Tractor(String matricula, double kms, String marca, String modelo, String remolque) {
		super(matricula, kms, marca, modelo);
		this.remolque = remolque;
	}

	public Tractor() {
		super("", 0, "", "");
		this.remolque="";
	}

	public String getRemolque() {
		return remolque;
	}

	public void setRemolque(String remolque) {
		this.remolque = remolque;
	}
	
	@Override
	public String toString() {
		return "Tractor\n" + super.toString() + "\nRemolque: " + remolque;
	}

}
