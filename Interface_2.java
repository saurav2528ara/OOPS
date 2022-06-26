interface customer
{
    int amount = 5; // final value
    void purchase();
}
class seller implements customer
{
    public void purchase()
    {
        // amount =7 not final 
        System.out.print("Saurav needs "+amount+"kg mango");
    }
}
class trial
{
    public static void main(String[] args) {
        customer in = new seller();
        in.purchase();
        System.out.println(customer.amount); // Static
    }
}