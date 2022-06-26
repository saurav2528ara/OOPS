class A
{
    int a =10;
}
class B extends A
{
    int a = 20;
    void show()
    {
        System.out.println(a);
        System.out.println(super.a); // using super it can access a=10 with a=20;

    }
}
class trial
{
    public static void main(String[] args) {
        B in = new B();
        in.show();
    }
}