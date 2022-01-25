import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {

	@Test
	//esta prueba es cuando tengo un equipo vac
	public void testSetNombreEquipoVacio() {
		Equipo equipo = new Equipo();
		String nombrequipo="";
		equipo.setNombreEquipo(nombrequipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	public void testSetNombreEquipoCompleto() {
		Equipo equipo = new Equipo();
		String nombrequipo="";
		equipo.setNombreEquipo(nombrequipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	
	

	@Test
	void testSetrankingnumeroentre0y10() {
		Equipo equipo = new Equipo();
		int rankingEquipo=9;
		equipo.setRanking(rankingEquipo);
		assertEquals(rankingEquipo,equipo.getRanking());
	}
	
	@Test
	void testSetrankingrecibeunaletra() {
		Equipo equipo = new Equipo();
		String rankingEquipo="m";
		assertThrows(IllegalArgumentException.class, () -> {
			//equipo.setRanking(rankingEquipo);
		});
		
	}
	@Test
	void testSetrankingrecibeunnumeronegativo() {
		Equipo equipo = new Equipo();
		int rankingEquipo=-1;
		equipo.setRanking(rankingEquipo);
		assertEquals(0,equipo.getRanking());
	}
	void testSetrankingcampovacio() {
		Equipo equipo = new Equipo();
		int rankingEquipo=0;
		equipo.setRanking(rankingEquipo);
		assertEquals(0,equipo.getRanking());
	}

}
//pruebaaaaaaaaaaaa