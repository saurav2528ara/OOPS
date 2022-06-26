// class trial
// {
//     void show()
//     {
//         System.out.println(this); // this keyword is work like (in)
//     }
//     public static void main(String[] args) {
//         trial in = new trial();
//         System.out.println(in);
//         in.show();
//     }
// }

// class trial
// {
//     int a;
//     trial (int a)
//     {
//         this.a=a;
//     }
//     void show()
//     {
//         System.out.print(a);
//     }
//     public static void main(String[] args) {
//         trial in = new trial(100);
//         in.show();
//     }
// }

// class trial
// {
//     trial()
//     {
//         System.out.println("Saurav");
//     }
//     trial(int a)
//     {
//         this();
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         trial in = new  trial(100);
//     }
// }

class trial
{
    trial()
    {
        this(100);
    }
    trial(int a)
    {
        System.out.print(a);
    }
    public static void main(String[] args) {
        trial in = new trial();
    }
}