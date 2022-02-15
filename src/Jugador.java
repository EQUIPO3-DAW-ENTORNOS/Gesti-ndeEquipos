
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	private String tipojugador;
	


	public Jugador () {

	}



	public void setNombreJugador(String nombre) {
		//tener en cuenta que tiene que ir en mayusculas

		boolean tieneNumeros = nombre.matches("[0-9].+");

		if (!tieneNumeros && nombre.length() <=20 && nombre.length() >= 4){
			this.nombre = nombre.toUpperCase();
		} else if (nombre == "@" || nombre.equals("")) {
			this.nombre = null;
		} else {
			this.nombre = null;
		}



	}





	public void setEdad(int edad) {
		final int VACIO = -1;
 
		if ( edad >= 18) {				//Jugador mayor de edad.
			this.edad = edad;

		} else if ( edad == -1) {		//Edad vacía.
			this.edad = VACIO;
		} else {
			this.edad = VACIO;
		}
	}


	public void setIdioma(String idioma) {	
		final String IDIOMA_VALIDO[]=	
			{ 
					"Inglés","Español","Aleman","Francés"		
			};
		if (idioma.equals( IDIOMA_VALIDO[0] ) 
				|| idioma.equals( IDIOMA_VALIDO[1] ) 
				|| idioma.equals( IDIOMA_VALIDO[2] )
				|| idioma.equals( IDIOMA_VALIDO[3] )) {
			this.idioma=idioma;
		} else {
			this.idioma=null;
		}

	}




	public String getIdioma() {
		return idioma;
	}
	public String getNombreJugador() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String tipoJugador() {
		final int VACIO = -1;

		if ( nombre == null || idioma == null || edad == VACIO || edad < 18 ) {
			return null;
		} else if ( edad >= 18 && edad < 25 ){
			return "Junior";
		} else if ( edad >= 25 && edad < 35 ){
			return "Senior";
		} else if ( edad >= 35 ){
			return "Master";
		} else {
			return null;
		}

	}


}

