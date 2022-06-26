class trial
{
    void add() // same method 3 time but parameter is always different
    {
        int a,b;
        a=4; b=6;
        System.out.println(a+b);
    }

    void add(int x, int y )
    {
        
        System.out.println(x+y);
    }

    void add(int x, double y)
    {
        System.out.println(x+y);
    }

   public static void main(String[] args) {
       trial in = new trial();
       in.add();in.add(5,5); in.add(1,0.5);
   }
   }