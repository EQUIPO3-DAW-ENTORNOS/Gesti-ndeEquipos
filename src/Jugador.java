
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



		if(!tieneNumeros) {
			this.nombre = nombre.toUpperCase();
		}else {
			this.nombre = null;
		}


		if(nombre==nombre.toUpperCase()) {
			this.nombre=nombre;
		}else if(nombre.length()<=20) {				//Nombre menor igual a 20.
			this.nombre = nombre;
		}else if(nombre.length()>20) {			//Nombre mayor que 20.			   
			this.nombre = null;
		}

		if(nombre.length()<4) {					//Menor que 4.    
			this.nombre = null;
		}else if(nombre.length()>=4) {			//Nombre mayor igual a 4.    
			this.nombre = nombre;
		}

		if(nombre=="@") {						//Nombre caracteres especiales.            
			this.nombre = null;
		}
		if(nombre.equals("")) {					//Nombre vac�o.       
			this.nombre = null;
		}
	}





	public void setEdad(int edad) {
		final int VACIO = -1;	

		if( edad >= 18) {				//Jugador mayor de edad.
			this.edad = edad;

		}else if(edad == -1) {			//Edad vac�a.
			this.edad = VACIO;
		}else {
			this.edad=VACIO;
		}
	}


	public void setIdioma(String idioma) {	
		//Idiomas correcto e incorrecto.
		if(idioma.equals("Espa�ol")) {
			this.idioma = idioma;
		}else if(idioma.equals("Ingl�s")) {
			this.idioma = idioma;
		}else if(idioma.equals("Aleman")) {
			this.idioma = idioma;
		}else if(idioma.equals("Franc�s")) {
			this.idioma = idioma;
		}else if(idioma.equals("")) {     				//Idioma vac�o.
			this.idioma = null;
		}else if(idioma.equals("Espa�ol Ingl�s")) {    //Elegir dos idiomas.
			this.idioma = null;
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
		if(nombre==null) {
			return null;
		}else if(idioma==null) {
			return null;
		}else if(edad==-1) {
			return null;
		}else if(edad<18) {
			return null;
		}else if(edad>=18&&edad<25){
			return "Junior";
		}else if(edad>=25&&edad<35){
			return "Senior";
		}else if(edad>=35){
			return "Master";
		}else {
			return null;
		}

	}


}

