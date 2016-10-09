package tests;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import triangle.Triangle;

public class Tests {
	public static Triangle triangle0;
	public static Triangle triangle1;
	public static Triangle triangle2;
	@Test
	public void test(){
		triangle0 = new Triangle(1,2,5);
		triangle1= new Triangle(4,2,8);
		triangle2 = new Triangle(5,1,3);
	}
	public void test_triangleArea(){
		assertTrue(triangle0.triangleArea(1,2,5)==4);
		assertTrue(triangle1.triangleArea(4,2,8)==7);
		assertTrue(triangle2.triangleArea(5,1,4)==5);
	}
	public void test_trianglePerimeter(){
		assertTrue(triangle0.trianglePerimeter(1,2,5)==8);
		assertTrue(triangle1.trianglePerimeter(4,2,8)==14);
		assertTrue(triangle2.trianglePerimeter(5,1,3)==9);
	}
	
	

}
