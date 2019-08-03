#include <iostream>
using namespace std;
 
int main() {
	int N;
	cin >> N;
 
	long sum = 0;
	int RectComb[N+1];
	RectComb[1] = 1;
	for(int i=2;i<=N;i++)
	{
		RectComb[i] = RectComb[i-1] + i;
	}
 
	for(int i=3;i<=N;i++)
	{
		int level = i;
		level = level - 2;
		while(level>0)
		{
			sum = sum + (long)RectComb[level];
			level = level-2;
		}
	}
	cout<<sum;
}
