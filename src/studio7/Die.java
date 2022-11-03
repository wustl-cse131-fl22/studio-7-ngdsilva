package studio7;

public class Die {

	private int n;
	
	public Die(int nSides)
	{
		n = nSides;
	}
	public int getValue()
	{
		return (int)(Math.random() * n) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die x = new Die(4);
		System.out.println(x.getValue());
		System.out.println(x.getValue());
		System.out.println(x.getValue());
		System.out.println(x.getValue());
		System.out.println(x.getValue());
	}

}
