interface client
{
    void webdesign();
    void webdev();
}
abstract class Tech implements client // we use abstract becaue this developer left his work
{
   public void webdesign()
    {
        System.out.println("html,css,JS");
    }
}
class Btech extends Tech
{
    public void webdev()
    {
        System.out.println("Frontend, Backend");
    }
}
class trial
{
    public static void main(String[] args) {
        Btech in =new Btech();
        in.webdesign();
        in.webdev();
    }
}