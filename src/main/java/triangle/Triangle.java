package triangle;

public class Triangle {
		public double side1 = 1.0;
		public double side2 = 1.0;
		public double side3 = 1.0;
		public Triangle(){
		}
		public Triangle(double side1, double side2, double side3){
			super();
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
		public double triangleArea(double side1,double side2,double side3){
			return (side1+side2+side3)/2;	
		}
		public double trianglePerimeter(double side1,double side2, double side3){
			return (side1+side2+side3);
		}
		//Making the sides strings
		public String toString(){
			return("Side1="+side1+"Side2"+side2+"Side3"+side3+"Area"+triangleArea(side1,side2,side3)+"Perimeter"+
					trianglePerimeter(side1,side2,side3));
		}
		

}
