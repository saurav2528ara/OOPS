abstract class company
{
    public abstract void category();
}
class list extends company
{
    @Override
    public void category()
    {
        System.out.print("saurav ");
    }
}
class alpha extends company
{
    @Override
    public void category()
    {
        System.out.print("sharma");
    }
}
class trial
{
    public static void main(String[] args) {
        list r1 = new list();
        r1.category();
        alpha r2 = new alpha();
        r2.category();
    }
}