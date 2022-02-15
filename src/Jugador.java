
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	private String tipojugador;
	


	public Jugador () {

	}



	public void setNombreJugador(String nombre) {
		
		/**

		 *Comprobar si el nombre es correcto

		 */

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
		/**

		 *Comprobar si la edad es correcta

		 */
		final int edadmaxima = 18;
		final int vacio = -1;
		
		if ( edad >= edadmaxima) {				
			this.edad = edad;
		} else {
			this.edad = vacio;
		}
	}


	public void setIdioma(String idioma) {	
		/**

		 *Comprobar si los idiomas son correctos

		 */
		final String[] idiomavalido=	
			{ 
					"Inglés","Español","Aleman","Francés"		
			};
		if (idioma.equals( idiomavalido[0] ) 
				|| idioma.equals( idiomavalido[1] ) 
				|| idioma.equals( idiomavalido[2] )
				|| idioma.equals( idiomavalido[3] )) {
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
		/**

		 *Definir la clase si todo es correcto
		 */
		final int vacio = -1;

		if ( nombre == null || idioma == null || edad == vacio || edad < 18 ) {
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

