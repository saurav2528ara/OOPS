class A
{
    int roll,marks;
    String student;
    void input(){
        student= "priya"; roll=7; marks=80;
        System.out.println(student+" "+roll+" "+marks);
    }    
}
class B extends A
{
    void show()
    {
        student = "saurav";
        roll = 9; marks = 90;
        System.out.println(student+" "+roll+" "+marks);
    }
}
class trial extends B
{
    void add()
    {
        int a = 5; int b = 4;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        trial in = new trial();
        in.input();in.show();in.add();
    }
}