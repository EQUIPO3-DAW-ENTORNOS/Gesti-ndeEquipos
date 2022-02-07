
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	private String tipojugador;
	
	



	public Jugador () {
			
		}

	public void setNombreJugador(String nombre) {
		if(nombre.length()<=20) {				//Nombre menor igual a 20.
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
		if(nombre.equals("")) {					//Nombre vacío.       
			this.nombre = null;
		}                          
		for(int i=0;i<=nombre.length()-1;i++) { //Nombre con un número.
		char letra = nombre.charAt(i);
		if	(!Character.isLetter(letra) && letra !=20);
	}
		 
		
	}
	public void setEdad(int edad) {
	int vacío = -1;	
	
		if(edad>18) {				//Jugador mayor de edad.
			this.edad = edad;
		}else if(edad==18) {		//Edad igual a 18.
			this.edad = edad;
		}else if(edad<18) {			//Edad menor de 18.
			this.edad  = vacío;
		}else if(edad==vacío) {		//Edad vacía.
			this.edad = vacío;
		}
 
		
	}
	public void setIdioma(String idioma) {	
		//Idiomas correcto e incorrecto.
		if(idioma.equals("Español")) {
			this.idioma = idioma;
		}else if(idioma.equals("Inglés")) {
			this.idioma = idioma;
		}else if(idioma.equals("Aleman")) {
			this.idioma = idioma;
		}else if(idioma.equals("Francés")) {
			this.idioma = idioma;
		}else if(idioma.equals("")) {     				//Idioma vacío.
			this.idioma = null;
		}else if(idioma.equals("Español Inglés")) {    //Elegir dos idiomas.
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
		if(edad<18) {
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