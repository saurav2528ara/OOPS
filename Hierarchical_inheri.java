class A
{
    String a,b,c;
    void input()
    {
        System.out.print("What is your name: ");
    }
}
class B extends A
{
    void first()
    {
        System.out.println("My name is Saurav");
    }
}
class C extends A
{
    void second()
    {
        System.out.println("I dont know");
    }
}
class trial
{
    public static void main(String[] args) {
        B r = new B();
        C r2 = new C();
        r.input(); r.first();
        r2.input(); r2.second();
    }
}
