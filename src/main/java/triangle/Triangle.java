package triangle;
import java.util.Scanner;

//public class Triangle extends GeometricObject{ (Couldn't get error at Triangle to disappear)
public class Triangle extends Exception{	
	

	
		public static double side1 = 1.0;
		public static double side2 = 1.0;
		public static double side3 = 1.0;

		
		public Triangle(){
			super();
		}
		
		public Triangle(double side1, double side2, double side3){
			this();
			if ((side1<=0) || (side2<=0) || (side3<=0)){
				throw new TriangleException();
			}
			
			this.side1=side1;
			this.side2=side2;
			this.side3=side3;
			
		}


		
		//Setters & Getters
		public double getSide1() {
			return side1;
		}
		public void setSide1(double side1) {
			this.side1 = side1;
		}
		public double getSide2() {
			return side2;
		}
		public void setSide2(double side2) {
			this.side2 = side2;
		}
		public double getSide3() {
			return side3;
		}
		public void setSide3(double side3) {
			this.side3 = side3;
		}
		//Calculations
	public static void main(String[] args){
		Scanner datainput=new Scanner(System.in);
		
		System.out.println("Enter side 1:");
		double side1 = datainput.nextDouble();
		
		System.out.println("Enter side 2:");
		double side2 = datainput.nextDouble();
		
		System.out.println("Enter side 3:");
		double side3 = datainput.nextDouble();
		
		System.out.printf("Area of this triangle is: ");
		System.out.println(triangleArea(side1,side2,side3));
		
		System.out.printf("Perimeter of this triangle is: ");
		System.out.println(trianglePerimeter(side1,side2,side3));
		
	}
		
		//Area Calculator
		public static double triangleArea(double side1,double side2, double side3){
			double area_perimeter = (side1+side2+side3)/2;
			double area = Math.sqrt((area_perimeter*(area_perimeter-side1)*(area_perimeter-side2)
					*(area_perimeter-side3)));
			return area;	
		}
		//Perimeter Calculator
		public static double trianglePerimeter(double side1,double side2, double side3){
			double perimeter = (side1+side2+side3);
			return perimeter;
		}
		//Making the sides strings
		public String toString(){
			return("Side1="+side1+"Side2"+side2+"Side3"+side3+"Area"+triangleArea(side1,side2,side3)+"Perimeter"+
					trianglePerimeter(side1,side2,side3));
		}
	
	
		

}
