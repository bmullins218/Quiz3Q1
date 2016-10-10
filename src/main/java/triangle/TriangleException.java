package triangle;
import triangle.Triangle;


public class TriangleException extends Exception{
	private Triangle t;
	
	public TriangleException(Triangle t){
		super();
		this.t=t;
	}
	
	

}
