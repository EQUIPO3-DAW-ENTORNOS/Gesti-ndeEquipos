
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	
	public Jugador () {
			
		}

	public void setNombreJugador(String nombre) {
		//Nombre de m�s de 20 caracteres.
		if(nombre=="antonioantonioantonioantonioantonioantonioantonio") {
			this.nombre = null;
		}
		//Nombre con 20 caracteres.
		if(nombre=="pedropablopedropablopedropablo") {
			this.nombre = nombre;
		}
		//Nombre campo vac�o.
		if(nombre==" ") {
			this.nombre = null;
		}
		//Nombre recibe un numero.
		if(nombre=="1234") {
			this.nombre = null;
		}
	}
			
		
	
	public void setEdad(int edad) {
		//Jugador menor de 18 a�os.
		if(edad<18) {
			this.edad  = (Integer) null;
		}
		//Jugador edad campo vac�o.-mirar como se pone vac�o en un int
		if(edad==" ") {
			this.edad = (Integer) null;
		}
		//Jugador edad = 18.-mirar si esta bien esto
		if(edad==18) {
			this.edad = edad;
		}
	}
	public void setIdioma(String idioma) {
		//Idioma erroneo.-mirar como a�adir m�s posibilidades.
		if(idioma=="Chino") {
			this.idioma = null;
		}
		//Idioma campo vac�o.
		if(idioma==" ") {
			this.idioma = null;
		}
		//Idioma elegido es correcto.-Mirar como poner m�s de uno y s� de esta manera es correcto.
		if(idioma=="Espa�ol") {
			this.idioma = idioma;
		}
//		if(idioma=="Ingl�s") {
//			this.idioma = idioma;
//		}
		if(idioma=="Ingl�s Espa�ol") {
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
