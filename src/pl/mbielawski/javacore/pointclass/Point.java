package pl.mbielawski.javacore.pointclass;

public final class Point {

	private int x, y;
	
	Point() {
		this.x = 0;
		this.y = 0;
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point translate(int x, int y) {
		int newX = this.x + x;
		int newY = this.y + y;
		return new Point(newX, newY);
	}
	
	public Point scale(int factor) {
		int newX = this.x * x;
		int newY = this.y * y;
		return new Point(newX, newY);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void displayPoint() {
		System.out.print("s = ");
		System.out.print(x);
		System.out.print(", y = ");
		System.out.println(y);
	}
}
