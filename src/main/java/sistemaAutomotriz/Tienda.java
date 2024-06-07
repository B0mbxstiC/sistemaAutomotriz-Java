package sistemaAutomotriz;
//Se importa Lombok, una librería que nos permite ahorrar escritura de código en relación a la construcción de clases.

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Tienda {
	private List<Vendedor> vendedor;
	private List<Vehiculo> vehiculo;
	private Integer stock;

	public String existeStock(){
		String cadena = String.format("El stock existente es de: %d", stock );
		return cadena;
	}


}
