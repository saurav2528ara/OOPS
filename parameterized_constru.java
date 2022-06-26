class A
{
	int x,y;
	A(int a,int b)
	{
		x=a; y=b;
	}
	void show()
	{
		System.out.print(x+y);
	}
}
class trial
{
	public static void main(String[] args) {
		A in = new A(5,4);
		in.show();
	}
}