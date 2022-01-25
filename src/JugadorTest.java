import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadorTest {

	@Test
	void testSetNombreJugadornumerodecaracteressuperiora20() {
		Jugador jugador = new Jugador();
		String nombrejugador = "antonioantonioantonioantonioantonioantonioantonio";
		jugador.setNombreJugador(nombrejugador);
		
		assertEquals(nombrejugador, jugador.getNombreJugador());
		
		
		
		
	}
	@Test
	void testSetEdad() {
		fail("Not yet implemented");
	}

	@Test
	void testSetIdioma() {
		

	}

}
