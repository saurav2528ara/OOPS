import java.util.Scanner;
interface A
{
   void input();
   void output();
}
class B implements A
{
    String name; double roll;
    public void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();

        System.out.print("Enter roll no: ");
        roll = in.nextDouble();
    }
    public void output()
    {
        System.out.print(name+" "+roll);
    }
}
class trial
{
    public static void main(String[] args) {
        A r1 = new B();
        r1.input();
        r1.output();
    }
}