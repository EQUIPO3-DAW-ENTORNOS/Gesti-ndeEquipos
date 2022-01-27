import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {
	
//Asignar jugador	
	@Test
	void testSetAsignarJugadornoexiste() {
		Jugador jugador = new Jugador();
		String nombrejugador = " ";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	@Test
	void testSetAsignarJugadorqueyaexista() {
		Jugador jugador = new Jugador();
		String nombrejugador = "antonio";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
			
	}
	
	@Test
	void testSetAsignarJugadorconmasde20caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "albertodanieldetodoslossantos";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	@Test
	void testSetAsignarJugadorsinnombre() {
		Jugador jugador = new Jugador();
		String nombrejugador = " ";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	@Test
	void testSetAsignarJugadoredadincorrecta() {
		Jugador jugador = new Jugador ();
		int edadjugador = 5;
		jugador.setEdad(5);
		assertEquals(null,(Integer)jugador.getEdad());
	}
	@Test
	void testSetAsignarJugadoredadvacía() {
		Jugador jugador = new Jugador();
		int edadjugador =0;
		jugador.setEdad(0);
		assertEquals(null,(Integer)jugador.getEdad());
	}
	@Test
	void testSetAsignarJugadoridiomaincorrecto() {
		Jugador jugador = new Jugador();
		String idioma ="Polaco";
		jugador.setIdioma("polaco");;
		assertEquals(null,jugador.getIdioma());
	}
	@Test
	void testSetAsignarJugadoridiomavacío() {
		Jugador jugador = new Jugador();
		String idioma =" ";
		jugador.setIdioma(null);
	}

	
//Asignar Equipo
	@Test
	void testNombreEquipovacio() {
		Jugador jugador = new Jugador();
		String nombrejugador = "";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	void testNombreEquipocorrecto() {
		Jugador jugador = new Jugador();
		String nombrejugador = "Los limones";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
	}
	void testNombreEquipoconmasde20caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "Los limones Los limones";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	void testNombreEquipoconmenossde20caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "Los limones";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
	}
	void testNombreEquipocon20caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "antonioantonioantonioantonio";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
	}
	void testNombreEquipoañadidoanteriromente() {
		Jugador jugador = new Jugador();
		String nombrejugador = "Los limones";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	void testNombreEquiponoañadidoanteriormente() {
		Jugador jugador = new Jugador();
		String nombrejugador = "Los Aguacates";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	void testNombreEquipoañadidoanteriormente() {
		Jugador jugador = new Jugador();
		String nombrejugador = "Los Limones";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
	}
	
}
