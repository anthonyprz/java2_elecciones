//import elecciones;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		String opcion;
		Scanner sc = new Scanner (System.in);

			System.out.println("elige una opcion 'habitante''ayuntamiento''zona publica' 'inmueble''partido'");
			opcion = sc.next();
	if (opcion.equalsIgnoreCase("habitante")){
		String nombre;
		String apellido;
		int edad;

		System.out.println("ingrese un nombre:");
		nombre = sc.next();
		System.out.println("ingrese un apellido:");
		apellido = sc.next();
		System.out.println("ingrese una edad:");
		edad = sc.nextInt();

		//SETTER habitante
		Habitante habitante = new Habitante();
		habitante.setnombre(nombre);
		habitante.setapellido(apellido);
		habitante.setedad(edad);

		System.out.println("sus datos son:");
		System.out.println("nombre:"+nombre);
		System.out.println("apellido:"+apellido);
		System.out.println("edad:"+edad);
		}
	if (opcion.equalsIgnoreCase("ayuntamiento")){
		String pueblo;
		String direccion;
		int habitantes;

		//SETTER ayuntamiento
		Ayuntamiento ayunt = new Ayuntamiento();
		ayunt.setpueblo(pueblo);
		ayunt.setdireccion(direccion);
		ayunt.sethabitantes(habitantes);

		System.out.println("ingrese el pueblo:");
		pueblo = sc.next();
		System.out.println("ingrese una direccion:");
		direccion = sc.next();
		System.out.println("ingrese un numero de habitantes:");
		habitantes = sc.nextInt();

		System.out.println("el pueblo y sus datos son:");
		System.out.println("pueblo:"+pueblo);
		System.out.println("direccion:"+direccion);
		System.out.println("habitantes:"+habitantes);
		}
	}
	
}
