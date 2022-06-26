#include <iostream>
using namespace std;

class hero
{
    int a,b;
    public:

    void setData(int x, int y)
    {
        a=x;
        b=y;
    }
    void showData()
    {
        cout<<"a-->"<<a<<"b--> "<<b;
    }

    hero operator + (hero c)
    {
        hero obj;
        obj.a = a + c.a; // c1--> a  and c2--> c.a 
        obj.b = b + c.b;
        return (obj);
    }
};
int main()
{
    hero c1,c2,c3;
    c1.setData(3,4);
    c2.setData(2,5);
    c3 = c1+c2;
    c3.showData();
}