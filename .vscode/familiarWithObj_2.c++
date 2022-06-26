#include <iostream>
using namespace std;

class myClass
{
    public:
    string name;
    int id;

    void printname();
    /* {
        cout<<"Name is: "<<name;
    } */
    void printId()
    {
        cout<<"user id: "<<id;
    }
};
void myClass::printname()   //another way using scopeResolution
{
    cout<<"Name is: "<<name;
}
int main()
{
    myClass obj1;
    obj1.name = "Saurav";
    obj1.id = 123;

    obj1.printname();
    cout<<endl;
    obj1.printId();

    return 0;
}