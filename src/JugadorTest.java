import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadorTest {

	@Test
	void testSetNombreJugadornumerodecaracteressuperiora20() {
		Jugador jugador = new Jugador();
		String nombrejugador = "antonioantonioantonioantonioantonioantonioantonioantonioantonioantonioantonioantonioantonioantonio";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	@Test
	void testSetNombreJugadorconcaracteresnumericos() {
		Jugador jugador = new Jugador();
		String nombrejugador = "1234";
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
		String nombrejugador = "@";  //?¿/() ^^ [] ... ,, ;
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
	void testSetNombreJugadorconmásde4caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "aitor";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
	}
	

	
	
	@Test
		void testSetEdadRecibeLetra() {
		Jugador jugador = new Jugador();
		String edadJugador="m";
		assertThrows(IllegalArgumentException.class, () -> {
			//equipo.setRanking(rankingEquipo);
		});
		
	}
	@Test
	void testSetEdadMenor() {// edad introducida no mayor de edad
		Jugador jugador =new Jugador();
		int edadJugador= 16;
		jugador.setEdad(edadJugador);
		assertEquals(null,(Integer)jugador.getEdad());
		
		
	}
	@Test
	void testSetEdadCampoVacio() {
		Jugador jugador=new Jugador();
		int edadvacío=-1;
		jugador.setEdad(edadvacío);
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
	void CampoVacío() {
		Jugador jugador = new Jugador();
		String idioma =" ";
		jugador.setIdioma(idioma);
		
		assertEquals(null,jugador.getIdioma());
	} 
	@Test
	void ElegirEspañol() {
		Jugador jugador = new Jugador();
		String idioma ="Español";
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}
	@Test
	void ElegirIngles() {
		Jugador jugador = new Jugador();
		String idioma ="Inglés";
		jugador.setIdioma(idioma);
		
		assertEquals(idioma,jugador.getIdioma());
	}
	@Test
	void Elegirdos() {
		Jugador jugador = new Jugador();
		String idioma ="Español Inglés ";
		jugador.setIdioma(idioma);
		
		assertEquals(null,jugador.getIdioma());
	}
	
}
