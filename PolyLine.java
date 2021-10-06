package fr.dauphine.javavance.td1;

public class PolyLine {
	private Point[] lpt;
	
	//Constructeur
	public PolyLine(int nb) {
		lpt = new Point[nb];
	}
	
	
	//Methodes
	public void add(Point pt) {
		
		int i = 0;
		while (i<lpt.length) {
			if (lpt[i]==null) { 
				lpt[i] = pt;
				i = lpt.length;
			}
			i++;
		}
	}
	
	public int pointCapacity() {
		return lpt.length;
	}
	
	public int nbPoints() {
		int j = 0;
		for (int i = 0; i<lpt.length; i++) {
			if (lpt[i] != null) {
				j++;
			}
		}
		return j;
	}
	
	public boolean contains(Point pt) {
		boolean res = false;
		for (Point elem : lpt) {
			if (elem.equals(pt)) {
				return true;
			}
		}
		return res;
	}
	

	
	
	
}
