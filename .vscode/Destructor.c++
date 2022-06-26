#include <iostream>
using namespace std;

class myClass
{
    public:
    int id;

    ~myClass() //Destructor
    {       //it works just before while objecet goes to distroy
        cout<<"Destructor called: "<<id;
        cout<<endl;
    }
};
int main()
{
    myClass obj1;
    obj1.id = 7;
    int i = 0;
    while (i < 5)
    {
        myClass obj2;
        obj2.id = i;
        i++;
    }
}