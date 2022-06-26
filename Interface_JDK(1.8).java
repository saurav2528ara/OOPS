interface A
{
    void a1();
    void a2();
    default void a3()   // what happen when we add a another fun
    {
        System.out.println("a3 of A");
    }  

}
class B implements A
{
    public void a1()
    {
        System.out.println("a1 of A");
    }
    public void a2()
    {
        System.out.println("a2 of A");
    }
}
class trial
{
    public static void main(String[] args) {
        B in = new B();
        in.a1(); in.a2();in.a3();
    }
}