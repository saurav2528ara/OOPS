interface A
{
    void sum();
}
interface B extends A
{
    void sub();
}
class tech implements B
{
    int a = 6; int b=4;
    public void sum()
    {
        System.out.println(a+b);
    }
    public void sub()
    {
        System.out.print(a-b);
    }
}
class trial
{
    public static void main(String[] args) {
    tech in = new tech();
    in.sum(); in.sub();
}
}