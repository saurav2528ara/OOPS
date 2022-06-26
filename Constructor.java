class A
{
	int a; String b;
	A()
	{
		a=7; b="Saurav";
	}
	void show()
	{
		System.out.print(a+" "+b);
	}
}
class trial
{
	public static void main(String[] args) {
		A in = new A();
		in.show();
	}
}