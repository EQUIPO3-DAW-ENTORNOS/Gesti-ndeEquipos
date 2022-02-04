import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {


	@Test
	//esta prueba es cuando tengo un equipo vac
	public void testSetNombreEquipoVacio() {
		Equipo equipo = new Equipo();
		String nombrequipo=" ";
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
	void testSetnombreEquiponumerodecaracteresIgualValorlimite4() {
		Equipo equipo = new Equipo();
		String nombreEquipo="FCBA";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
		
	}
	@Test
	void testSetnombreEquiponumerodecaracteresMenorValorlimite4() {
		Equipo equipo= new Equipo();
		String nombreEquipo="FCB";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(null,equipo.getNombreEquipo());
		
	}

	@Test
	void testSetnombreEquiponumerodecaracteresmenorValorlimite20() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Fcbarrio";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
			
	}
	
	@Test
	void testSetnombreEquiponumerodecaracteresIgualaValorlimite20() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Fcbarrio901234567890";
		equipo.setNombreEquipo(nombreEquipo);
		
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}
		@Test
	void testSetnombreEquiponumerodecaracteresMayorValorlimite20() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "Fcbarrio901234567890445";
			equipo.setNombreEquipo(nombreEquipo);
			
			assertEquals(null,equipo.getNombreEquipo());

			
	}
		@Test
		void testSetnombreEquipoCaracteresEspeciales() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "Fcbarrio90";
			equipo.setNombreEquipo(nombreEquipo);
			
			assertEquals(null,equipo.getNombreEquipo());

			
	}
	

			
	
	
//	@Test
//	void testSetnombreEquipoyaregistrado() {
//		Equipo equipo = new Equipo();
//		String nombreEquipo = "Fcbarrio";
//		equipo.setNombreEquipo(nombreEquipo);
//		
//		assertEquals(null,equipo.getNombreEquipo());
//			
//	}

	
	
	

	//@Test
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
		int rankingvacío=-1;
		equipo.setRanking(rankingvacío);
		assertEquals(-1,equipo.getRanking());
	}
	void testSetrankingcampovacio() {
		Equipo equipo = new Equipo();
		int rankingvacío=-1;
		equipo.setRanking(rankingvacío);
		assertEquals(-1,equipo.getRanking());
	}


		

	}
