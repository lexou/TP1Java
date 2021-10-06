package fr.dauphine.javavance.td1;

import java.util.LinkedList;

public class PolyLineLinked {
	private LinkedList<Point> l;
	
	//Constructeur
	public PolyLineLinked() {
		l = new LinkedList<Point>();
	}
	
	
	//Methodes
	public void add(Point pt) {
		l.add(pt);
	}
	
	public int nbPoint() {
		return l.size();
	}
	
	public boolean contains(Point pt) {
		return l.contains(pt);
	}
}
