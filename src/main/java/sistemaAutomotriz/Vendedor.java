package sistemaAutomotriz;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter

public class Vendedor extends Persona{
	private String direccion;

	public Vendedor(String rut, String nombre, Integer edad, String direccion){
		super(rut, nombre, edad);
		this.direccion = direccion;
	}


}
