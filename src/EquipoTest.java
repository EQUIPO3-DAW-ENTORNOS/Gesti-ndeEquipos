import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

	class EquipoTest {

		@Test
		void testSetnombreEquiponumerodecaracteressuperiora20() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "Fcbarrio90123456789012345";
			equipo.setnombreEquipo(nombreEquipo);
			
			assertEquals(null,equipo.getnombreEquipo());
				
		}
		
		@Test
		void testSetnombreEquiponumerodecaracteresmenora20() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "Fcbarrio";
			equipo.setnombreEquipo(nombreEquipo);
			
			assertEquals(equipo.getnombreEquipo());
				
		}
		
		@Test
		void testSetnombreEquiponumerodecaracteres20() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "Fcbarrio901234567890";
			equipo.setnombreEquipo(nombreEquipo);
			
			assertEquals(equipo.getnombreEquipo());
				
		}
		
		
		@Test
		void testSetnombreEquiponumerodecaracteresvacio() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "";
			equipo.setnombreEquipo(nombreEquipo);
			
			assertEquals(null,equipo.getnombreEquipo());
				
		}
		
		@Test
		void testSetnombreEquipoyaregistrado() {
			Equipo equipo = new Equipo();
			String nombreEquipo = "Fcbarrio";
			equipo.setnombreEquipo(nombreEquipo);
			
			assertEquals(null,equipo.getnombreEquipo());
				
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
