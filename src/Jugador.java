
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	
	public Jugador () {
			
		}

	public void setNombreJugador(String nombre) {
		//Nombre de más de 20 caracteres.
		if(nombre.length()>20) {
			this.nombre = null;
		}
		//Nombre con 20 caracteres.
		if(nombre.length()<=20) {
			this.nombre = nombre;
		}
		//Nombre con menos de 4 caracteres
		if(nombre.length()<4) {
			this.nombre = null;
		}
		//Nombre con 4 caracteres
		if(nombre.length()==4) {
			this.nombre = nombre;
		}
		//Nombre con más de 4 caracteres
		if(nombre.length()>4) {
			this.nombre = nombre;
		}
		//Nombre con caracteres especiales
		if(nombre=="@") {
			this.nombre = null;
		}	
		//Nombre campo vacío.
		if(nombre.equals("")) {
			this.nombre = null;
		}	
		//Nombre recibe un numero 
		for(int i=0;i<=nombre.length()-1;i++) {
			char letra = nombre.charAt(i);
				Character.isLetter(letra);
		}if(nombre=nombre.charAt()){
			this.nombre = nombre; 
		}
			
	}
			
		
	
	public void setEdad(int edad) {
	int vacío = -1;	
		
		//Jugador menor de 18 años.
		if(edad<18) {
			this.edad  = (Integer) null;
		}
		//Jugador edad campo vacío.
		if(edad!=vacío) {
			this.edad = edad;
		}
		//Jugador mayor de edad.
		if(edad>=18) {
			this.edad = edad;
		}
		//Edad recibe una letra.
		if(edad=='m') {
			this.edad = (Integer)null;
		}
		
		
	}
	public void setIdioma(String idioma) {	
		//Idiomas correcto e incorrecto.
		if(idioma.equals("Español")) {
			this.idioma = idioma;
		}
		if(idioma.equals("Inglés")) {
			this.idioma = idioma;
		}
		if(idioma.equals("Aleman")) {
			this.idioma = idioma;
		}
		if(idioma.equals("Francés")) {
			this.idioma = idioma;
		}
	
		//Idioma vacío.
		if(idioma.equals("")) {
			this.idioma = null;
		}
		//Elegir dos idiomas
		if(idioma.equals("Español Inglés")) {
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
}
