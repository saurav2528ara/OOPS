class A
{
	int a,b;
	A()
	{
		a=10; b=20;
	}
	void add()
	{
		System.out.print(a+b);
	}
}
class trial
{
	public static void main(String[] args) {
		A in = new A();
		in.add();
	}  
}