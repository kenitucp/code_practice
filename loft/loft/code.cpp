#include<iostream>
using namespace std;
int fib(int m)
{
	if (m == 1 || m == 2)
		return m;
	return fib(m - 1) + fib(m - 2);
}
int main()
{
	int n;
	cin >> n;
	if (n == 1 || n == 2)
	{
		cout << n << endl;
	}
	else
	{
        int ret = fib(n);
	    cout << ret << endl;
	}
	
}