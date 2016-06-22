/**
 * 
 */
package com.company.domotique.appareils;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author ib
 * @param <E>
 *
 */
public class Bordereau extends Vector<AppareilElectrique> {



	public Bordereau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void afficher(){
		for (Enumeration<Appareil> AE = this.elements();AE.hasMoreElements();) {
			System.out.println(AE.nextElement());
		}
	}
	public void trierCroissant(){
		Collections.sort(this,new SortBycroissant());
	}


	public void trierDecroissant(){
			
	}
	class SortBycroissant implements Comparator<AppareilElectrique>{
	

		@Override
		public int compare(AppareilElectrique o1, AppareilElectrique o2) {
			String Ap1 =(o1).getMarque();
			String Ap2 =(o2).getMarque();
			return Ap1.compareTo(Ap2);
		}


	}



	@Override
	public String toString() {
		return "Bordereau []";
	}

}
