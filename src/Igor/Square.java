package Igor;

public class Square {

	public int getPerimeter(int a) {
		return a * 4;
	}

	public int getSquare(int a) {
		return a * a;
	}

	public int getPerimeter(int r, double PI) {
		return (int) PI * 2 * r;
	}

	public int getSquare(int r, double PI) {
		return (int) PI * r * r;
	}
	public int getPerimeter(int a, int b, int c) {
		return a + b + c;
	}
	public int getSquare(int b, int h) {
		return (int) (1/2 * b * h);
	}
}
