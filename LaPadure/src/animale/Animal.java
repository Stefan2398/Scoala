package animale;

public class Animal {

	private String nume;
	private Integer greutate;

	public Animal(String nume, Integer greutate) {
		super();
		this.nume = nume;
		this.greutate = greutate;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Integer getGreutate() {
		return greutate;
	}

	public void setGreutate(Integer greutate) {
		this.greutate = greutate;
	}

}
