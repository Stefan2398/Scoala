package animale;

import java.util.ArrayList;

import interfete.Zgomot;

//pentru importuri automate: ctrl+shift+o
public class Urs extends Animal implements Zgomot {

	private String culoare;
	private ArrayList<Locatie> locatii;

	public Urs(String nume, Integer greutate, String culoare, ArrayList<Locatie> locatie) {
		super(nume, greutate);
		this.culoare = culoare;
		this.locatii = locatie;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public ArrayList<Locatie> getLocatie() {
		return locatii;
	}

	public void setLocatie(ArrayList<Locatie> locatie) {
		this.locatii = locatie;
	}

	@Override
	public String toString() {
		return "Ursul " + getNume() + ", greutate: " + getGreutate() + " de culoare " + culoare + " a mers prin "
				+ locatii;
	}

	@Override
	public void faceZgomot() {
		System.out.println("MOR MOR MOR!");

	}

}
