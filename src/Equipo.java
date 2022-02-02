
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		//code here
	}
	public void setRanking(int ranking) {
		//Ranking mayor a 10.
		if(ranking<10) {
			this.ranking = (Integer) null;
		}
		//Hay que poner que ranking sea igual a vacío.-mirar como se pone vacío en un int
		if(ranking==" ") {
			this.ranking = (Integer) null;
		}
		//Ranking con numero negativo.
		if(ranking<0) {
			this.ranking = (Integer) null;
		}
		//Hay que poner esta con todas las letras.-mirar como se ponen todas las letras.
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
