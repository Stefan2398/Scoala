package main;

import java.util.ArrayList;

import componente.Elev;
import componente.Materie;

public class Scoala {

	public static void main(String[] args) {
		Materie materie1 = new Materie("matematica", 10);
		Materie materie2 = new Materie("romana", 9);
		Materie materie3 = new Materie("engleza", 9);
		Materie materie4 = new Materie("istorie", 6);
		Materie materie5 = new Materie("chimie", 5);
		Materie materie6 = new Materie("franceza", 7);
		Materie materie7 = new Materie("geografie", 8);
		Materie materie8 = new Materie("fizica", 5);
		Materie materie9 = new Materie("informatica", 10);
		Materie materie10 = new Materie("desen", 9);
		ArrayList<Materie> listaDeMaterii1 = new ArrayList<Materie>();
		listaDeMaterii1.add(materie1);
		listaDeMaterii1.add(materie2);
		listaDeMaterii1.add(materie5);
		listaDeMaterii1.add(materie7);
		ArrayList<Materie> listaDeMaterii2 = new ArrayList<Materie>();
		listaDeMaterii2.add(materie2);
		listaDeMaterii1.add(materie7);
		listaDeMaterii1.add(materie3);
		listaDeMaterii1.add(materie10);
		ArrayList<Materie> listaDeMaterii3 = new ArrayList<Materie>();
		listaDeMaterii3.add(materie1);
		listaDeMaterii1.add(materie2);
		listaDeMaterii1.add(materie7);
		ArrayList<Materie> listaDeMaterii4 = new ArrayList<Materie>();
		listaDeMaterii4.add(materie4);
		listaDeMaterii1.add(materie2);
		listaDeMaterii1.add(materie9);
		listaDeMaterii1.add(materie5);
		ArrayList<Materie> listaDeMaterii5 = new ArrayList<Materie>();
		listaDeMaterii5.add(materie5);
		listaDeMaterii1.add(materie1);
		ArrayList<Materie> listaDeMaterii6 = new ArrayList<Materie>();
		listaDeMaterii6.add(materie6);
		listaDeMaterii1.add(materie2);
		listaDeMaterii1.add(materie5);
		ArrayList<Materie> listaDeMaterii7 = new ArrayList<Materie>();
		listaDeMaterii7.add(materie7);
		listaDeMaterii1.add(materie2);
		listaDeMaterii1.add(materie9);
		listaDeMaterii1.add(materie4);
		ArrayList<Materie> listaDeMaterii8 = new ArrayList<Materie>();
		listaDeMaterii8.add(materie8);
		listaDeMaterii1.add(materie2);
		listaDeMaterii1.add(materie1);
		ArrayList<Materie> listaDeMaterii9 = new ArrayList<Materie>();
		listaDeMaterii9.add(materie9);
		listaDeMaterii1.add(materie5);
		listaDeMaterii1.add(materie7);
		ArrayList<Materie> listaDeMaterii10 = new ArrayList<Materie>();
		listaDeMaterii10.add(materie10);
		listaDeMaterii1.add(materie2);
		listaDeMaterii1.add(materie1);
		ArrayList<Elev> listaElevi = new ArrayList<Elev>();
		Elev elev1 = new Elev("Stefan", 12, listaDeMaterii1);
		Elev elev2 = new Elev("Mircea", 11, listaDeMaterii2);
		Elev elev3 = new Elev("Ana", 12, listaDeMaterii3);
		Elev elev4 = new Elev("Andrei", 10, listaDeMaterii4);
		Elev elev5 = new Elev("Gigel", 9, listaDeMaterii5);
		Elev elev6 = new Elev("Ionut", 7, listaDeMaterii6);
		Elev elev7 = new Elev("Petruta", 9, listaDeMaterii7);
		Elev elev8 = new Elev("Dorin", 8, listaDeMaterii7);
		Elev elev9 = new Elev("Machedon", 11, listaDeMaterii8);
		Elev elev10 = new Elev("Nelus", 10, listaDeMaterii9);
		listaElevi.add(elev1);
		listaElevi.add(elev2);
		listaElevi.add(elev3);
		listaElevi.add(elev4);
		listaElevi.add(elev5);
		listaElevi.add(elev6);
		listaElevi.add(elev7);
		listaElevi.add(elev8);
		listaElevi.add(elev9);
		listaElevi.add(elev10);
		ArrayList<Elev> Genii = new ArrayList<Elev>();
		ArrayList<Elev> prostiiClasei = new ArrayList<Elev>();

		float media;
		float suma = 0;

		/*
		 * for (Materie materie : elev1.getListaMaterii()) { suma += materie.getNota();
		 * } media = suma / elev1.getListaMaterii().size();
		 * System.out.println("Media elevului " + elev1.getNume() + " este: " + media);
		 */
		int index = 0;
		float max = 0;
		for (Elev elev : listaElevi) {
			for (Materie materie : elev.getListaMaterii()) {
				suma += materie.getNota();
			}
			media = suma / (float) elev.getListaMaterii().size();
			System.out.println("Media elevului " + elev.getNume() + " este: " + media);
			if (media > max) {
				max = media;
				index = listaElevi.indexOf(elev);
			}
			if (media > 9) {
				Genii.add(elev);
			} else if (media < 6) {
				prostiiClasei.add(elev);
			}
			suma = 0;

		}
		System.out.println("Geniile clasei sunt: ");
		for (Elev elev : Genii) {
			System.out.println(elev.getNume());
		}
		System.out.println("Prostii clasei aka BOMBARDIERII, sunt: ");
		for (Elev elev : prostiiClasei) {
			System.out.println(elev.getNume());
		}
		System.out.println("Elevul cu cea mai mare medie este: " + listaElevi.get(index).getNume() + " " + max);
	}
}
