package main;

import java.util.ArrayList;

import animale.Locatie;
import animale.Urs;
import animale.Vulpe;

public class Padure {

	public static void main(String[] args) {
		Locatie lizieraPadure = new Locatie("Liziera padurii", "2131", "213.213");
		Locatie poiana = new Locatie("Poiana", "2131", "213.213");
		Locatie lac = new Locatie("Lac", "2131", "213.213");
		Locatie padure = new Locatie("Padure", "2131", "213.213");

		ArrayList<Locatie> locatiiVulpe = new ArrayList<Locatie>();
		locatiiVulpe.add(poiana);
		locatiiVulpe.add(lac);

		ArrayList<Locatie> locatiiUrs = new ArrayList<Locatie>();
		locatiiUrs.add(lizieraPadure);
		locatiiUrs.add(padure);

		Vulpe vulpe = new Vulpe("Maegareta", 15, locatiiVulpe);
		Urs urs = new Urs("Mos Martin", 1500, "maro", locatiiUrs);

//		System.out.println(vulpe);
//		System.out.println(urs);
		vulpe.faceZgomot();
		urs.faceZgomot();
	}

}
