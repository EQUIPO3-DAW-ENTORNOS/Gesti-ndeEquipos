import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {

	@Test
	//esta prueba es cuando tengo un equipo vac
	void testSetNombreEquipoVacio() {
		Equipo equipo = new Equipo();
		String nombrequipo="";
		equipo.setNombreEquipo(nombrequipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	void testSetNombreEquipoCompleto() {
		Equipo equipo = new Equipo();
		String nombrequipo="";
		equipo.setNombreEquipo(nombrequipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	
	

	@Test
	void testSetRanking() {
		fail("Not yet implemented");
	}

}
//pruebaaaaaaaaaaaa