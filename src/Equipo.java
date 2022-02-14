
public class Equipo {
	
	private String nombreEquipo;
	private int ranking;

	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		
		final int CARACTERES_NOMBRE_EQUIPO1 = 20;
		final int CARACTERES_NOMBRE_EQUIPO2 = 4;
		final int CARACTERES_NOMBRE_EQUIPO3 = 3;
		
		
		if(nombreEquipo.equals(" ")) {
			this.nombreEquipo=null;
		}
		
		if(nombreEquipo.length() >= CARACTERES_NOMBRE_EQUIPO1) {
			this.nombreEquipo = null;
		}
		
		if(nombreEquipo.length() >= CARACTERES_NOMBRE_EQUIPO2) {
			this.nombreEquipo = nombreEquipo;
		}
		
		if(nombreEquipo.length() > 20) {
			this.nombreEquipo = null;
		}
		
		if(nombreEquipo.equals("Fcbarrio90")) {
			this.nombreEquipo = null;
		}
	}

	
	public void setRanking(int ranking) {
		
	int rankingVacio = -1;	
	final int CARACTERES_NOMBRE_EQUIPO3=0;
	
		if(ranking <= 10) {
			this.ranking = ranking;
		}
		
		else if(ranking == rankingVacio) {
			this.ranking = rankingVacio;
		}
		else if(ranking < CARACTERES_NOMBRE_EQUIPO3) {
			this.ranking = rankingVacio;
		}
		else {
			this.ranking = ranking;
		}

		
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
	public String categoriaEquipo(){
		
		final int CARACTERES_NOMBRE_EQUIPO4 = -1;
		final int CARACTERES_NOMBRE_EQUIPO5 = 3;
		final int CARACTERES_NOMBRE_EQUIPO6 = 6;
		final int CARACTERES_NOMBRE_EQUIPO7 = 10;
		
		if(nombreEquipo == null) {
			return null;
		}else if(ranking == CARACTERES_NOMBRE_EQUIPO4) {
			return null;
		}else if(ranking < CARACTERES_NOMBRE_EQUIPO5) {
			return "Tercera";
		}else if(ranking >=3 && ranking <= CARACTERES_NOMBRE_EQUIPO6) {
			return "Segunda";
		}else if(ranking >=7 && ranking <= CARACTERES_NOMBRE_EQUIPO7) {
			return "Primera";
		}else {
			return null;
		}
		
		
	}
	
}
