//package elecciones;

public class Habitante {

		private String nombre;
		private String apellido;
		private int edad;
	    
		 public String getnombre( ){
			    return this.nombre;
			  }
		 public void setnombre(String nombre){
			    this.nombre = nombre;
		 }
		 public String getapellido(){
			    return this.apellido;
			  }
		 public void setapellido(String apellido) {
			    this.apellido = apellido;
		 }
		 public int getedad(){
			    return this.edad;
			  }
		 public void setedad(int edad) {
			    this.edad = edad;
		 }
	public String datos(){
        return this.nombre+"\n"+this.apellido;
    }
    public int edad(){
     //   return this.edad;
        if (this.edad >= 18) {
        	System.out.println("\npuedes votar");
        	return edad;
        }
        else {
        	System.out.println("\nno puedes votar");
        	return edad;
        }
}
}

