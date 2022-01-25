import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {
	
	
	@Test
	void testSetNombreJugadorvacio() {
		Jugador jugador = new Jugador();
		String nombrejugador = "";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	
	@Test
	void testSetNombreJugadorconmasde20caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "albertodanieldetodoslossantos";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	
	@Test
	void testSetNombreJugadorconmenosde20caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "albertodaniel";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
	}	
	
	@Test
	void testSetNombreJugadoryaguardado() {
		Jugador jugador = new Jugador();
		String nombrejugador = "albertodaniel";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}	
	
	@Test
	void testSetNombreJugadoryaguardadoenotroequipo() {
		Jugador jugador = new Jugador();
		String nombrejugador = "albertodaniel";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}	
	@Test
	void testNombreJugadorcon20caracteres() {
		Jugador jugador = new Jugador();
		String nombrejugador = "antonioantonioantonioantonio";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
	}
	@Test
	void testNombreJugadorqueyaexista() {
		Jugador jugador = new Jugador();
		String nombrejugador = "antonio";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(nombrejugador,jugador.getNombreJugador());
			
	}
	@Test
	void testNombreJugadorquenoexista() {
		Jugador jugador = new Jugador();
		String nombrejugador = "pepe";
		jugador.setNombreJugador(nombrejugador);
		assertEquals(null,jugador.getNombreJugador());
	}
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
