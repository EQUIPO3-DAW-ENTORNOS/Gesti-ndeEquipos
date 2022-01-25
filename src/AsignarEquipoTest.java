import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author LeonadoSacorNefedova
 *
 */
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
		jugador.setNombreJugador(nombre)
	}
}
