package pl.mbielawski.javacore.pointclass;

import java.util.*;
public class Main {

	public static void main(String args[]) {
	
		Point point1 = new Point();
		Point point2 = new Point(21, 37);
		
		point1.displayPoint();
		point2.displayPoint();
		
		point1.translate(-5, 12).displayPoint();
		point2.scale(-45).displayPoint();
	}
	
}
