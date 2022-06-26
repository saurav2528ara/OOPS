#include <iostream>
using namespace std;

class parent
{
   public:
        int id_a;
};
class child : public parent
{
    public:
        int id_b;
};
int main()
{
    child obj;
    obj.id_a = 7;
    obj.id_b = 27;
    cout<<"child id is: "<<obj.id_b<<endl;
    cout<<"parent id is: "<<obj.id_a<<endl;

}