#include <bits/stdc++.h>
using namespace std;

bool ans(vector<int>a , int y) {
    for(int i = 0; i < a.size() ; ++i) {
        if(a[i] == y){
           
           return true  ;
        }
    }
    
    return false;
    
}

int main() {
	// your code goes here
	int x ,  k , y ;
	cin >> x >> k >> y;
	
	vector<int>a ;
	for(int i = 1; i <= x ; ++i) {
	    int curnum =  (k*i) ;
	    a.push_back(curnum) ;
	}
	
	
	if(ans(a ,y)) {
	    cout << "YES" << endl ;
	}
	else {
	    cout << "NO" << endl ;
	}
	
	

}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna