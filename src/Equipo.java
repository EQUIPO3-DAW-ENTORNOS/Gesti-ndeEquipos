
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
	int rankingvac�o = -1;
		
		
		if(ranking<10) {
			this.ranking = rankingvac�o;
		}else if(ranking==rankingvac�o) {
			this.ranking = rankingvac�o;
		}else if(ranking<0) {
			this.ranking = rankingvac�o;
		}else if(ranking=='m') {
			this.ranking = rankingvac�o;
		}
		
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}
