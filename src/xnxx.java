

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

	class AsignarEquipoTest {
	    
		/*Asignar jugador que exista y tenga todos los campos v�lidos*/
		@Test
		void testSetJugador() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			/*Creamos un jugador con todos los campos v�lidos*/
			Jugador jugador = new Jugador();
			String nombrevalido = "Antonio";
			int edadValida = 20;
			String idiomaValido = "Espa�ol";
			jugador.setNombreJugador(nombrevalido);
			jugador.setEdad(edadValida);
			jugador.setIdioma(idiomaValido);
			
			/*Asignar el jugador creado en asignar equipo*/
			asignarEquipo.setJugador(jugador);
			
			Jugador jugadorGuardado = asignarEquipo.getJugador(); 
			assertNotNull(jugadorGuardado);
			assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
			assertEquals(edadValida, jugadorGuardado.getEdad());
			assertEquals(idiomaValido, jugadorGuardado.getIdioma());
		}
		
		@Test
		void testSetEquipo() {
			
			fail("Not yet implemented");
		}

	}


