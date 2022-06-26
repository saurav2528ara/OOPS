#include <iostream>
using namespace std;

class myClass
{
    int a,b;
    public:
        myClass(myClass &c) //copy constructor  &c--> reference variable
        {   //initilize with object of saame class,
            a = c.a;
            b = c.b;
        }
};
int main()
{
    myClass c3 (c1);
}