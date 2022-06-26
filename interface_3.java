    /* Multiple inheritance using interface*/
    

// interface A
// {
//     void show();
// }
// interface B
// {
//     void show();
// }
// class trial implements A,B
// {
//     public void show()
//     {
//         System.out.println("Saurav A & B");
//     }
//     public static void main(String[] args)
//     {
//         trial in = new trial();
//         in.show();
//     } 
// }

interface A
{
    void show();
}
interface B
{
    void Display();
}
class trial implements A,B
{
    public void show()
    {
        System.out.print("a & b");
    }
    public void Display()
    {
        System.out.print("A & B");
    }
    public static void main(String[] args) {
        trial in = new trial();
        in.show();
        in.Display();
    }
}