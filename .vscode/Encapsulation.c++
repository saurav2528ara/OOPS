#include <iostream>
using namespace std;

class Encapsulation
{
    int x;
    public: 
    
    void set (int a)
    {
        x = a;
    }

    int get ()
    {
        return x;
    }
};
int main()
{
    Encapsulation obj;
    obj.set(7);

    cout<<obj.get();
}