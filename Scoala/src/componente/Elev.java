package componente;

import java.util.ArrayList;

public class Elev extends Materie {

	private String nume;
	private Integer clasa;
	ArrayList<Materie> listaMaterii;

	public Elev(String nume, Integer clasa, ArrayList<Materie> listaMaterii) {
		super(nume, clasa);
		this.nume = nume;
		this.clasa = clasa;
		this.listaMaterii = listaMaterii;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Integer getClasa() {
		return clasa;
	}

	public void setClasa(Integer clasa) {
		this.clasa = clasa;
	}

	public ArrayList<Materie> getListaMaterii() {
		return listaMaterii;
	}

	public void setListamaterie(ArrayList<Materie> listaMaterii) {
		this.listaMaterii = listaMaterii;
	}

	@Override
	public String toString() {
		return "Elev [nume=" + nume + ", clasa=" + clasa + ", listaMaterii=" + listaMaterii + "]";
	}

}
