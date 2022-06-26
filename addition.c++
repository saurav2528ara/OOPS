#include <bits/stdc++.h>
using namespace std;

class Solution{

  public:
    int sum(int a, int b)
    {
      int c=0;
      c=a+b;
      return c;
    }
};
int main()
{
  int t;
  cin>>t;
  while(t--)
  {
    int a,b;
    cin>>a>>b;
    Solution obj;
    cout<<obj.sum(a,b)<<endl;
  }
  return 0;
}