package sistemaAutomotriz;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
	//Instanciando y definiendo los valores de las listas respectivas y sus consecuentes objetos
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		List<Bus> buses = new ArrayList<Bus>();
		List<MiniBus> miniBuses = new ArrayList<MiniBus>();
		List<Tienda> tiendas = new ArrayList<Tienda>();
		List<Persona> personas = new ArrayList<Persona>();
		List<Cliente> clientes = new ArrayList<Cliente>();
		List<Vendedor> vendedores = new ArrayList<Vendedor>();

		//Agregando elementos a las listas respectivas
		Vehiculo vehiculoUno = new Vehiculo("Rojo", "ABBA-23");
		vehiculos.add(vehiculoUno);
		Vendedor vendedorUno = new Vendedor("19594775-9", "Joel Alarcón", 27, "Av. JAJA");
		vendedores.add(vendedorUno);
		MiniBus miniBusUno = new MiniBus("Azul", "FSDS-12", 34, "Concepcion-Santiago");
		miniBuses.add(miniBusUno);
		Tienda tiendaUno = new Tienda(vendedores, vehiculos, 20);
		tiendas.add(tiendaUno);
		//Testeando si se encuentra bien la herencia y los getters y setters
		System.out.println(miniBusUno.getColor());
		miniBusUno.setColor("Verde");
		System.out.println(miniBusUno.getColor());
		System.out.println(miniBusUno.getTipoViaje());
		System.out.println(miniBusUno.getPatente());
		System.out.println(miniBusUno.getCantidadAsientos());
		System.out.println(tiendaUno.getVendedor());
		System.out.println(tiendaUno.getVehiculo());
		System.out.println(tiendaUno.existeStock());
		System.out.println(vendedorUno.getNombre());
		System.out.println(miniBusUno.imprimeBus());


	}
}