
public class Rectangle {

	private static final String String = null;
	private  int width;
	private  int length;
	private static  int area;

	public Rectangle(int w, int l) {
		width = w;
		length = l;
		area = w * l;

	}

	public static int getArea() {
		return area;
	}

	public int getWidth() {
		return width;
	}

	public int getlength() {
		return length;
	}
	
	public double getDiagonal(0){
		double dia =0;
		dia = Math.sqrt(width * width + Math.pow(length, 2));
		
		return dia;
	}

	public void setWidth(int w) {
		width = w;

	}

	public void setLength(int l) {
		length = l;

	}
	public String toString() {
		String myString = " a rectangle object with \n" + length + " " + width + " " + area ;
		
		//System.out.println(length);
		//System.out.println(Width);

		//System.out.println(getArea());
		//System.out.println();
		return myString;
	}

}
