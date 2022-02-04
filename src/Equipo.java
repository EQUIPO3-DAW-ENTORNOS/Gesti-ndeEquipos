
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
		
		
		if(ranking<10) {
			this.ranking = rankingvacío;
		}else if(ranking==rankingvacío) {
			this.ranking = rankingvacío;
		}else if(ranking<0) {
			this.ranking = rankingvacío;
		}else if(ranking=='m') {
			this.ranking = rankingvacío;
		}
		
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}
