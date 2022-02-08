
public class Equipo {
	private String nombreEquipo;
	private int ranking;

	
	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		if(nombreEquipo.equals(" ")) {
			this.nombreEquipo=null;
		}
		if(nombreEquipo.length()>=20) {
			this.nombreEquipo=null;
		}
		if(nombreEquipo.length()>=4) {
			this.nombreEquipo=nombreEquipo;
		}
		if(nombreEquipo.length()>20) {
			this.nombreEquipo=null;
		}
		if(nombreEquipo.equals("Fcbarrio90")) {
			this.nombreEquipo=null;
		}
	}

	
	public void setRanking(int ranking) {
	int rankingvacío = -1;
		
		
		if(ranking<=10) {
			this.ranking = ranking;
		}else if(ranking==rankingvacío) {
			this.ranking = rankingvacío;
		}else if(ranking<0) {
			this.ranking = rankingvacío;
		}else {
			this.ranking = ranking;
		}

		
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
	public String categoriaequipo(){
		if(nombreEquipo==null) {
			return null;
		}else if(ranking==-1) {
			return null;
		}else if(ranking<3) {
			return "Tercera";
		}else if(ranking>=3&&ranking<=6) {
			return "Segunda";
		}else if(ranking>=7&&ranking<=10) {
			return "Primera";
		}else {
			return null;
		}
		
		
	}
	
}
