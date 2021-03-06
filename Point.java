package fr.dauphine.javavance.td1;

public class Point {
	private final double x;
	private final double y;
	private static int counter = 0;
	
	//Constructeur
	public Point(double px, double py){
		x = px;  
		y = py;
		counter++;
	}
	
	public Point(Point p2){
		x = p2.x;
		y = p2.y;
		counter++;
	}

	
	// Accesseurs
	 double getX() {
		return x;
	}
	 double getY() {
		return y;
	}
	 static final int getCounter(){  //on ne doit pas pouvoir modifier ce compteur
		return counter;
	}
	
	 
	 //Methodes
	public void methode(double abs, double ord) {
		Point p = new Point(abs, ord);
		System.out.println("("+ p.x + ", " + p.y + ")");
	}
	
	public boolean isSameAs(Point p) {
		boolean res = false;
		if ( this.x == p.x && this.y == p.y ) {
			res = true;
		}
		return res;
	}
	

    @Override // trouvé sur Stackoverflow
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
        	return false;
        }
        Point other = (Point) obj;
        return x==other.x && y==other.y;
    }
    
    
    @Override
    public String toString() {
    	return "("+ this.x + "," + this.y + ")";
    }
    
    public Point translate(double dx, double dy) {
    	return new Point(x+dx, y+dy);
    }
    
    
    
	
}
