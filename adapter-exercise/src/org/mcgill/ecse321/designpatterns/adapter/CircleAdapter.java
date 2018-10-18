package org.mcgill.ecse321.designpatterns.adapter;

public class CircleAdapter implements Shape {
	private Circle adaptee;
	
	public CircleAdapter(Circle circle) {
		this.adaptee = circle;
	}
	
	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		adaptee.draw(x1, y1, x2);
	}
}