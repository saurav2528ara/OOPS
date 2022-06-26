#include <iostream>
using namespace std;

class myName
{
    public:
    string name;

    void printname(){

    cout<<"Name is: "<<name;
    }
};
int main()
{
    myName obj1;
    obj1.name = "saurav";
    obj1.printname();

    return 0;
}