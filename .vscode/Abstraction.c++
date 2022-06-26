#include <iostream>
using namespace std;

class Abstraction
{
    int a,b;
    public:

    void setData (int x, int y)
    {
        a=x;
        b=y;
    }
    int getData ()
    {
        cout<<"a-->"<<a<<endl;
        cout<<"b-->"<<b<<endl;

    } 
};
int main()
{
    Abstraction obj;
    obj.setData (7,2);

    cout<<obj.getData();
    return 0;
}