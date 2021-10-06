package fr.dauphine.javavance.td1;

import java.util.ArrayList;

public class TestPoint {

	public static void main(String[ ] args) {
		
		
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		Point p4 = new Point(2,2);
		Point p5 = new Point(0,0);
		Point p6 = new Point(1,1);
		
		
		System.out.println(p1);
		
		
		System.out.println( p1==p2 );
		System.out.println( p1==p3 );
		
		System.out.println(p1.isSameAs(p3));
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
		PolyLine poly = new PolyLine(5);
		poly.add(p1);
		poly.add(p4);
		poly.add(null);
		
		System.out.println(poly.nbPoints());
		System.out.println(poly.contains(p4));
		
		
		PolyLineLinked poly2 = new PolyLineLinked();
		poly2.add(p1);
		poly2.add(p4);
		
		System.out.println(poly2.nbPoint());
		System.out.println(poly2.contains(p4));
		
		
		System.out.println(p1.translate(1, 1));
		
		Circle c = new Circle(p1,1);
		Circle c2 = new Circle(p2,2); 
		System.out.println(c2.translate(1, 1));
		System.out.println(c+" "+c2);
		
		
		Circle c3 = new Circle(p5,2);
		System.out.println(c3.getCenter().translate(1, 1));
		System.out.println(c3);
		
		System.out.println(c3.contains(p6));
		Circle[] liste_cercle = new Circle[3];
		liste_cercle[0] = c;
		liste_cercle[1] = c2;
		liste_cercle[2] = c3;
		System.out.println(c.contains(p6, liste_cercle));
		
		
		
		Ring r = new Ring(p5,1,3);
		Ring r2 = new Ring(p1,3,4);
		//Ring r3 = new Ring(p4,2,1);
		Ring r3 = new Ring(p4,1,2);
		System.out.println(r);
		System.out.println(r.contains(p5));
		Ring[] liste_ring = new Ring[3];
		liste_ring[0] = r;
		liste_ring[1] = r2;
		liste_ring[2] = r3;
		System.out.println(r.contains(p5, liste_ring));
		
	 }
}
