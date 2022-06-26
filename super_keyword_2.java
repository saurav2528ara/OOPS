class A
{
    void show()
    {
        System.out.println("Hello world");
    }
}
class B extends A
{
    void show()
    {
        super.show(); // Constructor me ye feature already rhta hai
        System.out.println("Hello Saurav");
    }
}
class trial
{
    public static void main(String[] args) {
        B in = new B();
        in.show();
    }
}