#include <iostream>
using namespace std;
class pyramid
{
    public:
    int i,j,k,l,n;

    void fun()
    {
        cout<<"enter number of rows ";
        cin>>n;
        
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            cout<<" ";
        }
        for (int k=1; k<=i; k++)
        {
            cout<<k;
        }
        for (int l=i-1; l>=1; l--)
        {
            cout<<l;
        }
        cout<<endl;
    }
};
int main()
{
    pyramid obj;
    obj.fun();

}