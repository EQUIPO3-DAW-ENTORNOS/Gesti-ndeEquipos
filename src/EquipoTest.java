import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {


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
		
		

		@Test
		void testSetEdad() {
			fail("Not yet implemented");
		}

		@Test
		void testSetIdioma() {
			fail("Not yet implemented");
		}

	}
