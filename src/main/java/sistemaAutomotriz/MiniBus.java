package sistemaAutomotriz;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MiniBus extends Bus{
	private String tipoViaje;

	public MiniBus(String color, String patente, Integer cantidadAsientos, String tipoViaje){
		super(color, patente, cantidadAsientos);
		this.tipoViaje = tipoViaje;
	}

	public String imprimeBus(){
		String cadena = String.format("Los atributos del bus son: Color:%s, Patente:%s, Cantidad de asientos:%d, Tipo " +
										"de viaje:%s.",	this.getColor(),
						this.getPatente(),
						this.getCantidadAsientos(), this.getTipoViaje());
		return cadena;
	}


}
