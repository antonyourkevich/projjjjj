package Igor;

public class Igor {

	public static void main(String[] args) {

		Square square1 = new Square();
		System.out.println(square1.getPerimeter(5));
		System.out.println(square1.getSquare(5));
		
		System.out.println(square1.getPerimeter(3 , 3.14));
		System.out.println(square1.getSquare(3 , 3.14));
	}
}