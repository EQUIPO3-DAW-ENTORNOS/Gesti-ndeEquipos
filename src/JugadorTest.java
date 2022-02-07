import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadorTest {

	@Test
	void testSetNombreJugadornumerodecaracteressuperiora20() {
		Jugador jugador = new Jugador();
		String nombrejugador = "pablodddddddddddddddddddddddddddd";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
	}
	@Test
	void testSetNombreJugadorconcaracteresnumericos() {
		Jugador jugador = new Jugador();
		String nombrejugador = "1";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	@Test
	void testSetNombreJugadorcon20caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "pedropablopedropablopedropablo";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador, jugador.getNombreJugador());
	}
	@Test
	void testSetNombreJugadorvacio() {
		Jugador jugador = new Jugador();
		String nombrejugador = "";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	@Test
	void testSetNombreJugadorcaracteresespeciales() {
		Jugador jugador = new Jugador();
		String nombrejugador = "@";  //?�/() ^^ [] ... ,, ;
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	@Test
	void testSetNombreJugadorconmenosde4caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "ana";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	@Test
	void testSetNombreJugadorconde4caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "iker";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
	}
	@Test
	void testSetNombreJugadorconm�sde4caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "aitor";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
	}
	

	
	
	@Test
	void testSetEdadMenor() {// edad introducida no mayor de edad
		Jugador jugador =new Jugador();
		int edadJugador= 16;
		jugador.setEdad(edadJugador);
		assertEquals(-1,jugador.getEdad());
		
		
	}
	@Test
	void testSetEdadCampoVacio() {
		Jugador jugador=new Jugador();
		int edadvac�o=-1;
		jugador.setEdad(edadvac�o);
		assertEquals(-1,jugador.getEdad());
	

	}
	@Test
	void testSetEdadMayorEdad(){
		Jugador jugador=new Jugador();
		int edadJugador=18;
		jugador.setEdad(18);
		assertEquals(edadJugador,jugador.getEdad());
		
		
	}
	@Test
	void testSetEdadiguala18() {
		Jugador jugador = new Jugador();
		int edadJugador=18;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
				
	}
	

	@Test
	void ElegirIdiomaIncorrecto() {
		Jugador jugador = new Jugador();
		String idioma ="Chino";
		jugador.setIdioma(idioma);
	
		assertEquals(null,jugador.getIdioma());
	}
	@Test
	void CampoVac�o() {
		Jugador jugador = new Jugador();
		String idioma =" ";
		jugador.setIdioma(idioma);
		
		assertEquals(null,jugador.getIdioma());
	} 
	@Test
	void ElegirEspa�ol() {
		Jugador jugador = new Jugador();
		String idioma ="Espa�ol";
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}
	@Test
	void ElegirIngles() {
		Jugador jugador = new Jugador();
		String idioma ="Ingl�s";
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}
	@Test
	void Elegirdos() {
		Jugador jugador = new Jugador();
		String idioma ="Espa�ol Ingl�s ";
		jugador.setIdioma(idioma);
		
		assertEquals(null,jugador.getIdioma());
	}





	//Nuevos test para el metodo nuevo tipo jugador story 5.
	@Test
	void TipoJugador18y25() {
		Jugador jugador = new Jugador();
		String nombre = "Iker";
		jugador.setNombreJugador(nombre);
		int edad = 19;
		jugador.setEdad(edad);
		String idioma = "Espa�ol";
		jugador.setIdioma(idioma);
		assertEquals("Junior",jugador.tipoJugador());		
	}
	@Test
	void TipoJugador18y25con18() {
		Jugador jugador = new Jugador();
		String nombre = "Iker";
		jugador.setNombreJugador(nombre);
		int edad = 18;
		jugador.setEdad(edad);
		String idioma = "Espa�ol";
		jugador.setIdioma(idioma);
		assertEquals("Junior",jugador.tipoJugador());		
	}
	@Test
	void TipoJugador18y25con25() {
		Jugador jugador = new Jugador();
		String nombre = "Iker";
		jugador.setNombreJugador(nombre);
		int edad = 25;
		jugador.setEdad(edad);
		String idioma = "Espa�ol";
		jugador.setIdioma(idioma);
		assertEquals("Senior",jugador.tipoJugador());		
	}
	@Test
	void TipoJugador18y25concampovac�onombre() {
		Jugador jugador = new Jugador();
		String nombre = " ";
		jugador.setNombreJugador(nombre);
		int edad = 22;
		jugador.setEdad(edad);
		String idioma = "Espa�ol";
		jugador.setIdioma(idioma);
		assertEquals(nombre,jugador.tipoJugador());
	}
	@Test
	void TipoJugador25y35() {
		Jugador jugador = new Jugador();
		String nombre = "aitor";
		jugador.setNombreJugador(nombre);
		int edad = 26;
		jugador.setEdad(edad);
		String idioma = "Espa�ol";
		jugador.setIdioma(idioma);
		assertEquals("Senior",jugador.tipoJugador());
	}
	@Test
	void TipoJugador25y35con25() {
		Jugador jugador = new Jugador();
		String nombre = "aitor";
		jugador.setNombreJugador(nombre);
		int edad = 25;
		jugador.setEdad(edad);
		String idioma = "Espa�ol";
		jugador.setIdioma(idioma);
		assertEquals("Senior",jugador.tipoJugador());
	}
	@Test
	void TipoJugador25y35con35() {
		Jugador jugador = new Jugador();
		String nombre = "aitor";
		jugador.setNombreJugador(nombre);
		int edad = 35;
		jugador.setEdad(edad);
		String idioma = "Espa�ol";
		jugador.setIdioma(idioma);
		assertEquals("Master",jugador.tipoJugador());
	}
	@Test
	void TipoJugador25y35concampoidiomavac�o() {
		Jugador jugador = new Jugador();
		String nombre = "aitor";
		jugador.setNombreJugador(nombre);
		int edad = 26;
		jugador.setEdad(edad);
		String idioma = "";
		jugador.setIdioma(idioma);
		assertEquals(null,jugador.tipoJugador());
	}
	@Test
	void TipoJugadorm�sde35a�os() {
		Jugador jugador = new Jugador();
		String nombre = "Pedro";
		jugador.setNombreJugador(nombre);
		int edad = 36;
		jugador.setEdad(edad);
		String idioma = "Espa�ol";
		jugador.setIdioma(idioma);
		assertEquals("Master",jugador.tipoJugador());
	}
	@Test
	void TipoJugadorm�sde35a�oscon35() {
		Jugador jugador = new Jugador();
		String nombre = "Pedro";
		jugador.setNombreJugador(nombre);
		int edad = 35;
		jugador.setEdad(edad);
		String idioma = "Espa�ol";
		jugador.setIdioma(idioma);
		assertEquals("Master",jugador.tipoJugador());
	}
	@Test
	void TipoJugadorm�sde35a�osconcampoedadvac�o() {   
		Jugador jugador = new Jugador();
		String nombre = "Pedro";
		jugador.setNombreJugador(nombre);
		int edadvac�o = -1;
		jugador.setEdad(edadvac�o);
		String idioma = "Espa�ol";
		jugador.setIdioma(idioma);
		assertEquals(-1,jugador.tipoJugador());
	}
	
	
}
