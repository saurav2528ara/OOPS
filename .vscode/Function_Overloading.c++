#include <iostream>
using namespace std;

class vehicle
{
    public:
    
    void hell(int x)
    {
        cout<<"Value of x is: "<<x<<endl;
    }
    void hell(double x)
    {
        cout<<"Value of x is: "<<x<<endl;
    }
};
int main()
{
    vehicle obj;
    obj.hell(4);
    obj.hell(7.77);
}