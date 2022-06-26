class A
{
    A show()
    {
        System.out.print("learn saruav");
        return this;
    }
}
class B extends A
{
    B show()
    {
        System.out.print("Learn show");
        return this;
    }
}
class trial
{
    public static void main(String[] args) {
        B in = new B();
        in.show();
    }
}