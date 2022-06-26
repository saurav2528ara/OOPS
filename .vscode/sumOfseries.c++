#include <iostream>
using namespace std;

class sumOfseries
{
    public:
    int s=0;
    int sum=0;
    int n;

    void fun()
    {
        cout<<"Enter number: ";
        cin>>n;
        for (int i=0; i<=n; i++)
        {
            s=s*10+1;
            cout<<" "<<s<<" ";
            if (i<n)
            {
                cout<<"+";
            }
            sum = sum+s;
        }
        
        

    }
};
int main()
{
    sumOfseries obj;
    obj.fun();
    cout<<endl;
    cout<<"sum of series: "<<obj.sum;
}