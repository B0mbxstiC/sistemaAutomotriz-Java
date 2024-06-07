package sistemaAutomotriz;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bus extends Vehiculo {
	private Integer cantidadAsientos;

	public Bus(String color, String patente, Integer cantidadAsientos) {
		super(color, patente);
		this.cantidadAsientos = cantidadAsientos;
	}


	public Integer asientosDisponibles(Integer cantidadAsientos){
		Integer asientosDisponibles = this.cantidadAsientos - cantidadAsientos;
		return asientosDisponibles;
	}


}
