class A
{
	int x,y;
	A(int a, int b) //parameterized constructor
	{
		x=a; y=b;
	}
	A(int c, String d) //parameterized constructor
	{
		System.out.println(c+" "+d);
	}
	void show()
	{
		System.out.println(x+y);
	}
}
class trial
{
	public static void main(String[] args) {
		A in = new A(4,5);
		A r = new A(7,"Saurav");
		in.show();
	}
	
}
