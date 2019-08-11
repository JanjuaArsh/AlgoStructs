#include <iostream>
 
using namespace std;
 
int main() {
	int n, k;
	cin >> n>>k;
	if(n!=2)
	    cout << k << endl;
    else
    {
        unsigned long long Kay = (unsigned long long)k*k;
        cout << Kay << endl;
    }
	return 0;
}
