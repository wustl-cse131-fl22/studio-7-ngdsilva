package studio7;

public class Rectangle {

	private int width;
	private int height;
		public Rectangle(int w, int h)
		{
			width = w;
			height = h;
		}
		public int getArea()
		{
			int area = width * height;
			return area;
		}
		public int getPerimeter()
		{

			int perimeter = width * 2 + height * 2;
			return perimeter;
		}
		public boolean isSquare()
		{
			boolean square = false;
			if(width == height)
			{
				square = true;
			}
			else
			{
				square = false;
			}
			return square;
		}
		public boolean isSmaller(Rectangle r, Rectangle s)
		{
			if(r.getArea() > s.getArea())
			{
				return false;
			}
			else
			{
				return true;
			}
		}
public static void main(String[] args) {
Rectangle r = new Rectangle(5, 5);
Rectangle s = new Rectangle(3, 6);
System.out.println(r.getArea());
System.out.println(r.getPerimeter());
System.out.println(r.isSquare());
System.out.println(r.isSmaller(r, s));
}
}