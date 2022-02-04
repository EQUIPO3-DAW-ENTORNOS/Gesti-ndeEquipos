
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	
	public Jugador () {
			
		}

	public void setNombreJugador(String nombre) {
		//Nombre de más de 20 caracteres.
		if(nombre=="antonioantonioantonioantonioantonioantonioantonio") {
			this.nombre = null;
		}
		//Nombre con 20 caracteres.
		if(nombre=="pedropablopedropablopedropablo") {
			this.nombre = nombre;
		}
		//Nombre campo vacío.
		if(nombre==" ") {
			this.nombre = null;
		}
		//Nombre recibe un numero.
		if(nombre=="1234") {
			this.nombre = null;
		}
	}
			
		
	
	public void setEdad(int edad) {
		//Jugador menor de 18 años.
		if(edad<18) {
			this.edad  = (Integer) null;
		}
		//Jugador edad campo vacío.-mirar como se pone vacío en un int
		if(edad==" ") {
			this.edad = (Integer) null;
		}
		//Jugador edad = 18.-mirar si esta bien esto
		if(edad==18) {
			this.edad = edad;
		}
	}
	public void setIdioma(String idioma) {
		//Idioma erroneo.-mirar como añadir más posibilidades.
		if(idioma=="Chino") {
			this.idioma = null;
		}
		//Idioma campo vacío.
		if(idioma==" ") {
			this.idioma = null;
		}
		//Idioma elegido es correcto.-Mirar como poner más de uno y sí de esta manera es correcto.
		if(idioma=="Español") {
			this.idioma = idioma;
		}
//		if(idioma=="Inglés") {
//			this.idioma = idioma;
//		}
		if(idioma=="Inglés Español") {
			this.idioma = null;
		}
	}
	//hola

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
