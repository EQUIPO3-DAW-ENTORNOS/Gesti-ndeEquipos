
public class Equipo {
	
	private String nombreEquipo;
	private int ranking;

	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		
		final int CARACTERES_MAXIMO_20 = 20;
		final int CARACTERES_MINIMO_A_4 = 4;
		final int CARACTERES_MENORES_AL_MINIM0 = 3;
		final String CARACTERES_VACIO = " ";
		final String PALABRAS_QUE_INCLUYA_NÚMERO="Fcbarrio90";
		nombreEquipo=nombreEquipo.toUpperCase();
		
		if(nombreEquipo.equals(CARACTERES_VACIO) ||
		   nombreEquipo.length() >= CARACTERES_MAXIMO_20 ||
		   nombreEquipo.length() > CARACTERES_MENORES_AL_MINIM0 ||
		   nombreEquipo.equals(PALABRAS_QUE_INCLUYA_NÚMERO)) {
			
			this.nombreEquipo=null;
		}
		
		
		if(nombreEquipo.length() >= CARACTERES_MINIMO_A_4 ) {
			this.nombreEquipo = nombreEquipo;
		}
		
		
	}

	
	public void setRanking(int ranking) {
		
	int rankingVacio = -1;	
	int RANKING_VACIO=0;
	final int RANKING_MENOR_O_IGUAL_MAXIMO=10;
	
		if(ranking <= RANKING_MENOR_O_IGUAL_MAXIMO) {
			this.ranking = ranking;
		}
		
		else if(ranking == rankingVacio ||
				ranking < RANKING_VACIO) {
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
		
		 int CARACTERES_NOMBRE_NULO = -1;
		final int CARACTERES_MENORES_A_3 = 3;
		final int CARACTERES_ENTRE_TRES_Y_SEIS = 6;
		final int CARACTERES_ENTRE_SIETE_Y_DIEZ = 10;
		
		if(nombreEquipo == null ||
		   ranking == CARACTERES_NOMBRE_NULO 	) {
			return null;
		}
		
		else if(ranking < CARACTERES_MENORES_A_3 ) {
			return "Tercera";
		}
		else if(ranking >=3 && ranking <=  CARACTERES_ENTRE_TRES_Y_SEIS ) {
			return "Segunda";
		}
		else if(ranking >=7 && ranking <= CARACTERES_ENTRE_SIETE_Y_DIEZ) {
			return "Primera";
		}
		else {
			return null;
		}
		
		
	}
	
}
