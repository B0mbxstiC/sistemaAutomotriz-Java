package sistemaAutomotriz;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Taxi extends Vehiculo {
	private Double valorPasaje;

	public Taxi(String color, String patente, Double valorPasaje) {
		super(color, patente);
		this.valorPasaje = valorPasaje;
	}

	public Double pagarPasaje(double monto){
		if(monto > valorPasaje){
			return monto - valorPasaje;
		} else {
			return valorPasaje;
		}
	}


}
