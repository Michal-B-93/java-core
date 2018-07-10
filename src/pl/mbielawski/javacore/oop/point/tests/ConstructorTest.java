package pl.mbielawski.javacore.oop.point.tests;

import org.junit.Test;

import pl.mbielawski.javacore.oop.point.Point;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestJunit {
	
	@Test
	public void testGetters()
	{
		Point point = new Point(12, -10);
		
		assertEquals(point.getX(), 12);
		assertEquals(point.getY(), -10);
	}
	
	@Test
	public void testPointConstructor() {
		
		Point point1 = new Point(534,-56930);
		
		assertEquals(point1.getX(), 534);
		assertEquals(point1.getY(), -56930);
	}
	
	@Test
	public void testTranslate()
	{
		Point point2 = new Point(-2, 65);
		
		assertEquals(point2.translate(4, -25).getX(), 2);
		assertEquals(point2.translate(4, -25).getY(), 40);
	}
	
	@Test
	public void testScale()
	{
		Point point3 = new Point(-4, 8);
		
		assertEquals(point3.scale(3).getX(), -12);
		assertEquals(point3.scale(-2).getY(), -16);
	}
	
	@Test
	public void testImmutability()
	{
		Point point = new Point(3,4);
		Point point1;
		
		assertThat(point.hashCode() != point.scale(0).hashCode());
		assertThat(point.hashCode() != point.translate(1, 2).hashCode());
		
		point1 = point.scale(39).translate(43,-21);
		
		assertThat(point.hashCode() != point1.hashCode());
	}
}