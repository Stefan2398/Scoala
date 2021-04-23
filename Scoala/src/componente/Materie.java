package componente;

public class Materie {

	private String nume;
	private Integer nota;

	public Materie(String nume, Integer nota) {
		super();
		this.nume = nume;
		this.nota = nota;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "materia " + nume + ", nota " + nota + "";
	}

}
