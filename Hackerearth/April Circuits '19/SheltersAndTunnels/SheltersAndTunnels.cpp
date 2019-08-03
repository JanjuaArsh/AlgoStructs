#include <iostream>
using namespace std;
 
int main() {
	int N;
	cin >> N;
 
	int size[N+1] = {};
    int maxSize = 0;
    int numbers = 0;
	for(int i = 1; i<N; i++)
	{
		int a; int b;
		cin >> a;  cin>> b;
		 size[a]++;
		 if(size[a]>maxSize)
		 {
			 maxSize = size[a];
			 numbers = 1;
		 }
		 else if(size[a]==maxSize)
		 {
			 numbers++;
		 }
		 size[b]++;
		 if(size[b]>maxSize)
		 {
			 maxSize = size[b];
			 numbers = 1;
		 }
		 else if(size[b]==maxSize)
		 {
			 numbers++;
		 }
	}
 
	cout<< numbers<<endl;
	for(int i = 1; i<=N; i++)
	{
		if(size[i]==maxSize)cout<<i<<" ";
	}
 
	return 0;
 
}
