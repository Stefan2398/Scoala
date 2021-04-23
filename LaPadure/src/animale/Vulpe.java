package animale;

import java.util.ArrayList;

import interfete.Zgomot;

public class Vulpe extends Animal implements Zgomot {

	private ArrayList<Locatie> locatii;

	public Vulpe(String nume, Integer greutate, ArrayList<Locatie> locatii) {
		super(nume, greutate);
		this.locatii = locatii;
	}

	public ArrayList<Locatie> getLocatii() {
		return locatii;
	}

	public void setLocatii(ArrayList<Locatie> locatii) {
		this.locatii = locatii;
	}

	@Override
	public String toString() {
		return "Vulpe " + getNume() + ", cu greutatea " + getGreutate() + " a fost vazuta in " + locatii;
	}

	@Override
	public void faceZgomot() {
		System.out.println("RING DING DING");

	}

}
