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

	/**
	 * Test method for {@link AsignarEquipo#AsignarEquipo()}.
	 */
	@Test
	void testAsignarEquipo() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link AsignarEquipo#setEquipo(Equipo)}.
	 */
	@Test
	void testSetEquipo() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link AsignarEquipo#setJugador(Jugador)}.
	 */
	@Test
	void testSetJugador() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link AsignarEquipo#getEquipo()}.
	 */
	@Test
	void testGetEquipo() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link AsignarEquipo#getJugador()}.
	 */
	@Test
	void testGetJugador() {
		fail("Not yet implemented");
	}

}
