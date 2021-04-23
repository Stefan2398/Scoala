package animale;

public class Locatie {

	private String nume;
	private String latitudine;
	private String longitudine;

	public Locatie(String nume, String latitudine, String longitudine) {
		super();
		this.nume = nume;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(String latitudine) {
		this.latitudine = latitudine;
	}

	public String getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(String longitudine) {
		this.longitudine = longitudine;
	}

	@Override
	public String toString() {
		return nume;
	}

}
