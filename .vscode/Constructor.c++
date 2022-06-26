#include <iostream>
using namespace std;

class myClass
{
    public:
    string name;
    int id;
    myClass()   //default constructor
    {
        cout<<"Hello ";
    }
    myClass(int x, int y)   //Parameterized Constructor
    {
        cout<<"parameterized constructor: ";
        name = x;
        id = y;
    }
};
int main()
{
    myClass obj1;
    obj1.name = " Saurav";
    obj1.id = 123;

    cout<<"Name is: "<<obj1.name;
    cout<<"Id: "<<obj1.id;

}