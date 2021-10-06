package fr.dauphine.javavance.td1;

public class Circle {
	private final Point center;
	private final double radius;
	
	//Constructeur
	public Circle(Point centre, double rayon) {
		this.center = centre;
		this.radius = rayon;
	}
	
	
	//Accesseurs
	public Point getCenter() {
		return center;
	}
	
	public double getRadius() {
		return radius;
	}
	
	
	//Methodes
	
	public Circle translate(double dx, double dy) {
		return new Circle(center.translate(dx, dy),radius);
	}
	
	public double area() {
		return Math.pow(radius,2)*Math.PI;
	}
	
	@Override
	public String toString() {
		return ("( "+center.toString()+" ; r= "+radius+" ; aire= "+this.area()+ " )");
	}
	
	public boolean contains(Point p) {
		//(x - center_x)^2 + (y - center_y)^2 < radius^2
		boolean res = false;
		double pythagore = Math.pow( p.getX()-center.getX() , 2) + Math.pow( p.getY()-center.getY() , 2);
		if (pythagore <= Math.pow(radius, 2)) {
			res = true;
		}
		return res;
	}
	
	public boolean contains(Point p, Circle[] circles) {
		for (Circle elem : circles) {
			if (elem.contains(p)) {
				return true;
			}
		}
		return false;	
	}	
	
}
