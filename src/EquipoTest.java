import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {

<<<<<<< Updated upstream



=======
<<<<<<< HEAD
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
>>>>>>> Stashed changes
	
	
	

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
=======

<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
		@Test
		void testSetnombreEquiponumerodecaracteressuperiora20() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "Fcbarrio90123456789012345";
			equipo.setNombreEquipo(nombreEquipo);
			
			assertEquals(null,equipo.getNombreEquipo());
				
		}
		
		@Test
		void testSetnombreEquiponumerodecaracteresmenora20() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "Fcbarrio";
			equipo.setNombreEquipo(nombreEquipo);
			
			assertEquals(nombreEquipo,equipo.getNombreEquipo());
				
		}
		
		@Test
		void testSetnombreEquiponumerodecaracteres20() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "Fcbarrio901234567890";
			equipo.setNombreEquipo(nombreEquipo);
			
			assertEquals(nombreEquipo,equipo.getNombreEquipo());
				
		}
		
		
		@Test
		void testSetnombreEquiponumerodecaracteresvacio() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "";
			equipo.setNombreEquipo(nombreEquipo);
			
			assertEquals(null,equipo.getNombreEquipo());
				
		}
		
		@Test
		void testSetnombreEquipoyaregistrado() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "Fcbarrio";
			equipo.setNombreEquipo(nombreEquipo);
			
			assertEquals(null,equipo.getNombreEquipo());
				
		}
		
		
>>>>>>> 46b828fa7952fe4ce03faa39b86b0bd24aae007f

		@Test
		void testSetEdad() {
			fail("Not yet implemented");
		}

		@Test
		void testSetIdioma() {
			fail("Not yet implemented");
		}

	}
