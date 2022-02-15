
public class Equipo {
	
	private String nombreEquipo;
	private int ranking;

	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		final int caracteresmaximo20 = 20;
		final int caracteresminimoa4 = 4;
		final int caracteresmenoresalminimo = 3;
		final String caracteresvacios = " ";
		final String palabrasqueincluyanumero="Fcbarrio90";
		
		
		if(nombreEquipo.equals(caracteresvacios) ||
		   nombreEquipo.length() >= caracteresmaximo20 ||
		   nombreEquipo.length() > caracteresmenoresalminimo ||
		   nombreEquipo.equals(palabrasqueincluyanumero)) {
			
			this.nombreEquipo=null;
		}
		
		
		if(nombreEquipo.length() >= caracteresminimoa4 ) {
			this.nombreEquipo = nombreEquipo.toUpperCase();
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
