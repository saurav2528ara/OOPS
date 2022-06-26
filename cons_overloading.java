class A
{
	int a; double b; String c;
	A()
	{
		a=9; b=7.7; c="Saurav";
	}
	A(int x)
	{
		a=x;
		System.out.print(a);
	}
	A(String s)
	{
		c = s;
		System.out.print(c);

	}
}
class trial
{
	public static void main(String[] args) {
		A r = new A();
		A r2 = new A(9);
		A r3 = new A("Saurav");
	}
}
