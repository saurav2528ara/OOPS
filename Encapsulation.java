class A
{
    private int value;

    public void setValue(int x)
    {
        value = x;      // using setValue and getValue we can acces private
    }
    public int getValue()
    {
        return value;
    }
}
class trial
{
    public static void main(String[] args) {
        A in = new A();
        in.setValue(100);
        System.out.print(in.getValue());

    }
}