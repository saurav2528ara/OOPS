abstract class animal
{
    public abstract void sound();
}
class Dog extends animal
{
    public void sound()
    {
        System.out.print("Dog is barking");
    }
}
class Lion extends animal
{
    public void sound()
    {
        System.out.print("Lion is Roar");
    }
}
class trial
{
    public static void main(String[] args) {
        Dog r = new Dog();
        Lion r2 = new Lion();
        r.sound(); r2.sound();
    }
}