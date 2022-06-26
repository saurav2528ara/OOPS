/* Final */class user //if we use Final class user then all methods under this class is secure No SUB class can be access;
{
    void mNum()
    {
        System.out.println("844894894");
    }
   Final void mPin()
    {
        System.out.println("7878"); //Here we use FINAL for data secure
                                    // like ATM pin, using FINAL no otheer Sub class extends SUPER class
    }
}
class Thief extends user
{
    
    public void Mnum()
    {
        System.out.println("844894894");
    }
    public void mPin()
    {
        System.out.println("7878");
    }
}
class trial
{
    public static void main(String[] args) {
        Thief in = new Thief();
        in.mPin(); in.mNum();
    }
}
