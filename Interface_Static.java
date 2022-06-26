            /* Interface Static method */
interface A
{
    public static void a1()
    {
        System.out.println("a1 of A");
    }
    public static void a2()
    {
        System.out.println("a1 of A");
    }

    public static void a3()   // what happen when we add a another fun
    {
        System.out.println("a3 of A");
    }  
}

class trial
{
    public static void main(String[] args) {
        A.a1(); A.a2(); A.a3();
    }
}