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
		assertNotNull(jugador.getNombreJugador());
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
		jugador.setEdad(edadjugador);
		assertNotNull(jugador.getEdad());
	}
	@Test
	void testSetAsignarJugadoredadvacía() {
		Jugador jugador = new Jugador();
		int edadjugador =0;
		jugador.setEdad(edadjugador);
		assertNotNull(jugador.getEdad());
	}
	@Test
	void testSetAsignarJugadoridiomaincorrecto() {
		Jugador jugador = new Jugador();
		String idioma ="Polaco";
		jugador.setIdioma(idioma);;
		assertEquals(null,jugador.getIdioma());
	}
	@Test
	void testSetAsignarJugadoridiomavacío() {
		Jugador jugador = new Jugador();
		String idioma =" ";
		jugador.setIdioma(idioma);
		assertEquals(null,jugador.getIdioma());
	}

	
//Asignar Equipo
	@Test
	void testSetAsignarEquiponoexiste() {
		Equipo equipo = new Equipo();
		String nombreEquipo=" ";
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	@Test
	void testSetAsignarEquipoqueyaexiste() {
		Equipo equipo = new Equipo();
		String nombreEquipo="FCloslimones";
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}
	@Test
	void testSetAsignarEquiponumerodecaracteressuperiora20() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Fcbarrio90123456789012345";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(null,equipo.getNombreEquipo());
		//prueba
	}
	@Test
	void testSetAsignarEquiposinnombre(){
		Equipo equipo = new Equipo();
		String nombreEquipo = " ";
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	//@Test
	void testSetAsignarEquiporankingincorrecto() {
		Equipo equipo = new Equipo();
		Integer.parseInt("m");
		assertThrows(IllegalArgumentException.class, () -> {
			//equipo.setRanking(rankingEquipo);
		});	
	}
	@Test
	void testSetAsignarEquiporankingVacío() {
		Equipo equipo = new Equipo();
		int rankingVacío =-1;
		equipo.setRanking(rankingVacío);
		assertEquals(-1,equipo.getRanking());
	}
	
}