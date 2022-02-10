import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {
	
//Asignar jugador	
	@Test
	void testSetAsignarJugadornoexiste() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos jugador
		Jugador jugador = new Jugador();
		//rellenamos los campos
		String nombrejugador = " ";
		jugador.setNombreJugador(nombrejugador);
		int edadjugador = 15;
		jugador.setEdad(edadjugador);
		String idioma ="Italiano";
		jugador.setIdioma(idioma);
		

		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getJugador());
	
	}
	@Test
	void testSetAsignarJugadorqueyaexista() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos jugador
		Jugador jugador = new Jugador();
		//rellenamos los campos
	
		String nombrejugador = "antonio";
		jugador.setNombreJugador(nombrejugador);
		int edadjugador = 16;
		jugador.setEdad(edadjugador);
		String idioma ="Frances";
		jugador.setIdioma(idioma);
		

		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getJugador());
		
		
		
			
	}
	
	@Test
	void testSetAsignarJugadorconmasde20caracteres() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos jugador
		Jugador jugador = new Jugador();
		//rellenamos los campos
		String nombrejugador = "albertodanieldetodoslossantos";
		jugador.setNombreJugador(nombrejugador);
		int edadjugador = 16;
		jugador.setEdad(edadjugador);
		String idioma ="Frances";
		jugador.setIdioma(idioma);
		
		
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getJugador());
		
		
		
		
	}
	@Test
	void testSetAsignarJugadorsinnombre() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos jugador
		Jugador jugador = new Jugador();
		//rellenamos campos
		String nombrejugador = " ";
		jugador.setNombreJugador(nombrejugador);
		int edadjugador = 18;
		jugador.setEdad(edadjugador);
		String idioma ="Frances";
		jugador.setIdioma(idioma);
		
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getJugador());
		
		
		
	}
	@Test
	void testSetAsignarJugadoredadincorrecta() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos jugador
		Jugador jugador = new Jugador ();
		//rellenamos campos
		String nombreJugador="Ferran";
		jugador.setNombreJugador(nombreJugador);
		int edadjugador = 4;
		jugador.setEdad(edadjugador);
		String idioma ="Español";
		jugador.setIdioma(idioma);
		
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getJugador());
		
		
		
	}
	@Test
	void testSetAsignarJugadoredadvacía() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos jugador
		Jugador jugador = new Jugador();
		//rellenamos campos
		String nombreJugador="Pedri";
		jugador.setNombreJugador(nombreJugador);
		int edadjugador =-1;
		jugador.setEdad(edadjugador);
		String idioma ="Español";
		jugador.setIdioma(idioma);
		

		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getJugador());
		
		
			}
	@Test
	void testSetAsignarJugadoridiomaincorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos jugador
		Jugador jugador = new Jugador();
		//rellenamos campos
		String nombreJugador="Paco";
		jugador.setNombreJugador(nombreJugador);
		int edadjugador=17;
		jugador.setEdad(edadjugador);
		String idioma ="Polaco";
		jugador.setIdioma(idioma);
		
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getJugador());
		

	}
	@Test
	void testSetAsignarJugadoridiomavacío() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos jugador
		Jugador jugador = new Jugador();
		//rellenamos campos
		String nombreJugador="Pepe";
		jugador.setNombreJugador(nombreJugador);
		int edadjugador=16;
		jugador.setEdad(edadjugador);
		String idioma =" ";
		jugador.setIdioma(idioma);
		
		asignarEquipo.setJugador(jugador);
		assertNull(asignarEquipo.getJugador());
		
	}

	
//Asignar Equipo
	@Test
	void testSetAsignarEquiponoexiste() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos el equipo
		Equipo equipo = new Equipo();
		//rellenamos campos
		String nombreEquipo=" ";
		equipo.setNombreEquipo(nombreEquipo);
		int ranking =8;
		equipo.setRanking(ranking);
		
		asignarEquipo.setEquipo(equipo);
		assertNull(asignarEquipo.getEquipo());
		
		
		
	}
	@Test
	void testSetAsignarEquipoqueyaexiste() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos el equipo
		Equipo equipo = new Equipo();
		//rellenamos sus campos
		String nombreEquipo="FCloslimones";
		equipo.setNombreEquipo(nombreEquipo);
		int ranking=7;
		equipo.setRanking(ranking);
		
		asignarEquipo.setEquipo(equipo);
		assertNotNull(asignarEquipo.getEquipo());
		
		
	}
	@Test
	void testSetAsignarEquiponumerodecaracteressuperiora20() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		
		//creamos el equipo
		Equipo equipo = new Equipo();
		//rellenamos sus campos
		String nombreEquipo = "Fcbarrio90123456789012345";
		equipo.setNombreEquipo(nombreEquipo);
		int ranking = 4;
		equipo.setRanking(ranking);
		
		asignarEquipo.setEquipo(equipo);
		assertNull(asignarEquipo.getEquipo());
		//prueba
	}
	@Test
	void testSetAsignarEquiposinnombre(){
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos el equipo
		Equipo equipo = new Equipo();
		//rellenamos sus campos
		String nombreEquipo = " ";
		equipo.setNombreEquipo(nombreEquipo);
		int ranking = 1;
		equipo.setRanking(ranking);
		
		asignarEquipo.setEquipo(equipo);
		assertNull(asignarEquipo.getEquipo());
		

	}

	@Test
	void testSetAsignarEquiporankingVacío() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//creamos el equipo
		Equipo equipo = new Equipo();
		//rellenamos sus campos
		String nombreEquipo="FCBOLA";
		equipo.setNombreEquipo(nombreEquipo);
		int ranking =-1;
		equipo.setRanking(ranking);
		
		asignarEquipo.setEquipo(equipo);
		assertNull(asignarEquipo.getEquipo());
		
	}
	
}