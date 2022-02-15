import static org.junit.jupiter.api.Assertions.*;

//ficheros no porque no hay ficheros.
//declaracion de variables(codigo ordenado)
//Nombres de identificadores(comprobado)
//Estructura de codiga es correcta
//magic numbers HECHO
//Bad Smells hecho


import org.junit.jupiter.api.Test;

public class AsignarEquipo {
      private Equipo equipo;
      private Jugador jugador;
      

      public void setEquipo(Equipo equipo) {
      final  int RANKINGVACIO=-1; 
    	  if(equipo!=null &&
    	   equipo.getNombreEquipo()!=null &&
    	   equipo.getRanking()!=RANKINGVACIO) {
    		  this.equipo = equipo;
    	  } else {
    		  this.equipo = null;
    	
    	  }
    	 	  
      }
      
      public void setJugador(Jugador jugador) {
    	  final int EDADVACIA=-1;
    	  if(jugador!=null && 
    	 jugador.getNombreJugador()!=null &&
    	 jugador.getIdioma()!=null &&
    	 jugador.getEdad()!=EDADVACIA) {
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
