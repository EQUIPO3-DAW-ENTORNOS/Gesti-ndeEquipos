import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AsignarEquipo {
      private Equipo equipo;
      private Jugador jugador;
      

      public void setEquipo(Equipo equipo) {
    	  if(equipo!=null && equipo.getNombreEquipo()!=null && equipo.getRanking()!=-1) {
    		  this.equipo = equipo;
    	  } else {
    		  this.equipo = null;
    	
    	  }
    	 
    		  
    	  
      }
      
      public void setJugador(Jugador jugador) {
    	  if(jugador!=null && jugador.getNombreJugador()!=null && jugador.getIdioma()!=null && jugador.getEdad()!=-1) {
  		this.jugador = jugador;
  	}else {
  	  this.jugador= null;
  	}
  		
  	}
      
      
      public Equipo getEquipo(){
          return equipo;
      }
      
      public Jugador getJugador(){
         return jugador;
      }
      
}
