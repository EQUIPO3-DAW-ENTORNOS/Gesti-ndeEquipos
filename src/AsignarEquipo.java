import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AsignarEquipo {
      private Equipo equipo;
      private Jugador jugador;
      

      public void setEquipo(Equipo equipo) {
  		//code here
    	  String nombrevalido="FCBARRIO";
    	  int numeroJugadores=20;
    	  int ranking=12;
    	  equipo.setNombreEquipo(nombrevalido);
    	  equipo.setRanking(numeroJugadores);
    	  
    	  assertNotNull(nombrevalido);
    	  assertNotNull(numeroJugadores);
    	
    	  
      }
      
      public void setJugador(Jugador jugador) {
  		//code here
    	  AsignarEquipo asignarEquipo = new AsignarEquipo();
  		/*Creamos un jugador con todos los campos válidos*/
  		String nombrevalido = "Antonio";
  		int edadValida = 20;
  		String idiomaValido = "Español";
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
      
      
      public Equipo getEquipo(){
          return equipo;
      }
      
      public Jugador getJugador(){
         return jugador;
      }
      
}
