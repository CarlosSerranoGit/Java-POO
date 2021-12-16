package modelo;

public class Coche extends Vehiculo{

	private String lunas;

	public Coche(String matricula, double kms, String marca, String modelo, String lunas) {
		super(matricula, kms, marca, modelo);
		this.lunas = lunas;
	}
	
	public Coche() {
		super("", 0, "", "");
		this.lunas="";
	}

	public String getLunas() {
		return lunas;
	}

	public void setLunas(String lunas) {
		this.lunas = lunas;
	}
	
	public boolean fakeEquals(Object obj) {
		return super.equals(obj);
	}
		
	@Override
	public String toString() {
		return "Coche\n" + super.toString() + "\nLunas: " + lunas;
	}
}
