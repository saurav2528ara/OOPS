class A
{
	int a; String b;
	A()
	{
		a=9; b="Saurav";
		System.out.println(a+" "+b);
	}
	A(A in)
	{
		a = in.a;
		b= in.b;
		System.out.println(a+" "+b);
	}
}
class trial
{
	public static void main(String[] args) {
		A r = new A();
		A r2 = new A(r);
	}
}