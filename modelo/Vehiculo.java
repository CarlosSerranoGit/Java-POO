package modelo;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	
	private String matricula;
	private double kms;
	private String marca;
	private String modelo;
	
	public Vehiculo(String matricula, double kms, String marca, String modelo) {
		this.matricula = matricula;
		this.kms = kms;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Vehiculo() {
		this("", 0, "", "");
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Matricula: " + matricula + "\nKms: " + kms + 
				"\nMarca: " + marca + "\nModelo: " + modelo;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if (obj != null) {
			if (this == obj) {
				result = true;
			} else {
				//if (this.getClass() == obj.getClass())
				if(obj instanceof Vehiculo){
					Vehiculo tmp = (Vehiculo) obj;
					if (tmp!=null && this.matricula!=null 
							&& this.matricula.equals(tmp.matricula)) {
						result = true;
					}
				}
			}
		}
		return result;
	}
}
