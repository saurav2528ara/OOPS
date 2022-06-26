            /*Interface private method*/

interface A
{
default void ans()  // here we use default to acces private add();
    {
        add(6,4);
    }
    private void add(int x, int y)
    {
        System.out.print("Sum is: "+(x+y));
    }
}
class B implements A
{
    void sub(int x, int y)
    {
        System.out.print("sub is: "+(x-y));
    }
}
class trial
{
    public static void main(String[] args) {
        B in = new B();
        in.ans(); in.sub(100,50);
    }
}