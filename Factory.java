//Universidad del Valle de Guatemala
//Algoritmos y Estructura de Datos
//Diego López
//141222
//29-08-16


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class Factory<E> {
	
	public Set<E> setTable(int n){
		Set<E> programadores = null;
		
		switch(n){
		case 1:
			programadores = new TreeSet<E>();
			break;
		case 2: 
			programadores = new HashSet<E>();
			break;
		case 3:
			programadores = new LinkedHashSet<E>();
			break;
		}
		return programadores;
			
	}
	
	}

