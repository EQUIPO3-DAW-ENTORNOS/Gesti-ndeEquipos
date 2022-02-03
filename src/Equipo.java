
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
	int vacío = -1;
		
		//Ranking mayor a 10.
		if(ranking<10) {
			this.ranking = (Integer) null;
		}
		//Hay que poner que ranking sea igual a vacío.
		if(ranking!=vacío) {
			this.ranking = (Integer) null;
		}
		//Ranking con numero negativo.
		if(ranking<0) {
			this.ranking = (Integer) null;
		}
		//Hay que poner esta con todas las letras.
		if(ranking=='m') {
			this.ranking = (Integer) null;
		}
		
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}
