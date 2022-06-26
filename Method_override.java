class hello
{
    void show() // when method is not override then call this
    {
        System.out.println("Yes it was me");
    }
}
class hi extends hello
{
    @Override   // method is override,then object call this
    void show()
    {
        super.show(); // for calling super class
        System.out.println("It was Override");
    }
}
class trial
{
    public static void main(String[] args) {
        hi in = new hi();
        in.show();
    }
}
