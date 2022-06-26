class A
{	
	int a; double b; String c;
	private A()
	{
		a=5;b=0.5;c="Saurav";
		System.out.print(a+" "+b+" "+c+" ");

	}	
		// public static void main(String[] args) {
		// 	trial in = new trial();
		// }
	
}
class trial
{
	public static void main(String[] args) {
		A in = new A();
	}
}