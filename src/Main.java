//import elecciones;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		String opcion;
		Scanner sc = new Scanner (System.in);

			System.out.println("elige una opcion 'habitante''ayuntamiento''espaciopublico' 'inmueble''partido'");
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
		String alcalde;

		System.out.println("ingrese el pueblo:");
		pueblo = sc.next();
		System.out.println("ingrese una direccion:");
		direccion = sc.next();
		System.out.println("ingrese un numero de habitantes:");
		habitantes = sc.nextInt();
		System.out.println("ingrese un alcalde:");
		alcalde = sc.next();

		//SETTER ayuntamiento
		Ayuntamiento ayunt = new Ayuntamiento();
		ayunt.setpueblo(pueblo);
		ayunt.setdireccion(direccion);
		ayunt.sethabitantes(habitantes);
		ayunt.setalcalde(alcalde);

		System.out.println("el pueblo y sus datos son:");
		System.out.println("pueblo:"+pueblo);
		System.out.println("direccion:"+direccion);
		System.out.println("habitantes:"+habitantes);
		System.out.println("alcalde:"+alcalde);
		}
	if (opcion.equalsIgnoreCase("espaciopublico")){

			String calle;
			String municipio;

		System.out.println("ingrese el nombre de la calle:");
		calle = sc.next();
		System.out.println("ingrese el municipio:");
		municipio = sc.next();


			//setter Espacio publico
			Espaciopublico espacio = new Espaciopublico();
			espacio.setcalle(calle);
			espacio.setnunicipio(municipio);

			System.out.println("el espacio publico y sus datos son:");
			System.out.println("la calle es:" + calle);
			System.out.println("el municipio es:" + municipio);
		}

	if (opcion.equalsIgnoreCase("inmueble")) {

		String tipo;
		String calle;
		int numero;

		System.out.println("ingrese el tipo de inmueble:");
		tipo = sc.next();
		System.out.println("ingrese la calle:");
		calle = sc.next();
		System.out.println("ingrese el numero:");
		numero = sc.nextInt();

		//setters inmueble
		Inmueble inm = new Inmueble();
		inm.settipo(tipo);
		inm.setcalle(calle);
		inm.setnumero(numero);

		System.out.println("los datos del inmueble son:");
		System.out.println("el tipo es:" + tipo);
		System.out.println("la calle es:" + calle);
		System.out.println("el numero del inmueble:" + numero);

		}

if (opcion.equalsIgnoreCase("partido")){
		String candidato;
		String director;
		String ideologia;

		System.out.println("ingrese el candidato:");
		candidato = sc.next();
		System.out.println("ingrese el director:");
		director = sc.next();
		System.out.println("ingrese la ideologia:");
		ideologia = sc.next();


		//setter partido
		Partido part = new Partido();
		part.setcandidato(candidato);
		part.setdirector(director);
		part.setideologia(ideologia);


		System.out.println("los datos del partidos son:");
		System.out.println("el candidato es:" +candidato);
		System.out.println("el director es:" + director);
		System.out.println("la ideologia de este partido es" + ideologia);
		} 

	}
	
}
