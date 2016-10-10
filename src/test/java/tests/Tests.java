package tests;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import triangle.Triangle;

public class Tests {
	static Triangle triangle0;
	static Triangle triangle1;
	static Triangle triangle2;
	static Triangle triangle3;
	

	@Test
	public void test_Area(){
		//True Tests
		triangle0 = new Triangle();
		assertTrue(triangle0.triangleArea(3,4,5)==6.0);
		triangle1= new Triangle();
		assertTrue(triangle1.triangleArea(5,5,2)== Math.sqrt(24));
		
		//False Tests
		triangle2 = new Triangle();
		assertFalse(triangle2.triangleArea(2,3,4)==3.0);
		triangle3 = new Triangle();
		assertFalse(triangle2.triangleArea(9,10,11)==19.0);
	}

	public void test_trianglePerimeter(){
		//True Tests
		triangle0 = new Triangle();
		assertTrue(triangle0.trianglePerimeter(3,4,5)==12.0);
		triangle1= new Triangle();
		assertTrue(triangle1.trianglePerimeter(5,5,2)== 12.0);
		
		//False Tests
		triangle2 = new Triangle();
		assertFalse(triangle2.trianglePerimeter(2,3,4)==10.0);
		triangle3 = new Triangle();
		assertFalse(triangle2.trianglePerimeter(10,12,4)==25.0);
	}
}
