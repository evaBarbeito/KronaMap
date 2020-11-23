package com.daw.eva.krona.map;

import java.util.Comparator;
import java.util.LinkedHashMap;

public class comparadorPerWaypointAndID implements Comparator {
	public LinkedHashMap<Integer, Ruta_Dades> mapaLinkedDeRutes;
	
	
	

	public comparadorPerWaypointAndID(LinkedHashMap<Integer, Ruta_Dades> mapaLinkedDeRutes) {
		this.mapaLinkedDeRutes = mapaLinkedDeRutes;
	}



	// Al fer un MapTree fent servir aquest Comparator, es farà servir la funció compare()
    // per a determinar la posició en l'arbre ordenat i evidentment no hi podran haver elements 
    // repetits dins de l'arbre (la funció compare() determina quan 2 elements són iguals
    // perquè ocuparan la mateixa posició d'ordenació en l'arbre). 
	//
    // Com està agafant objectes de tipus Ruta_Dades, quan és fa "return valorA.compareTo(valorB)"
    // en realitat està fent servir la funció compareTo() que hi ha dins de Ruta_Dades la qual està 
    // comparant dues rutes en funció dels waypoints i del ID.
	@Override
	public int compare(Object o1, Object o2) {
		Comparable valorA = (Comparable) mapaLinkedDeRutes.get(o1);
        Comparable valorB = (Comparable) mapaLinkedDeRutes.get(o2);
        
        return valorA.compareTo(valorB);
	}

}
