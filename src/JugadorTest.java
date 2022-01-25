import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadorTest {

	@Test
	void testSetNombreJugadornumerodecaracteressuperiora20() {
		Jugador jugador = new Jugador();
		String nombrejugador = "antonioantonioantonioantonioantonioantonioantonio";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	@Test
	void testSetNombreJugadorconcaracteresnuimericos() {
		Jugador jugador = new Jugador();
		String nombrejugador = "1234";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	void testSetNombreJugadorcon20caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "pedropablopedropablopedropablo";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador, jugador.getNombreJugador());
	}
	void testSetNombreJugadorvacio() {
		Jugador jugador = new Jugador();
		String nombrejugador = "";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	void testSetNombreJugadoryaregistrado() {
		Jugador jugador = new Jugador();
		String nombrejugador = "";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	
	
	@Test
	void testSetEdad() {
		fail("Not yet implemented");
	}

	@Test
	void ElegirIdioma() {
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
	
}
