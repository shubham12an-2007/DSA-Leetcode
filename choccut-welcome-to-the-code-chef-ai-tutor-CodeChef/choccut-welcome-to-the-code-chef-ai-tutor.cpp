#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t ;
	cin >> t ;
	while(t--) {
	    int n , m ;
	    cin >> n >> m ;
	    
	    if(n  % 2  == 0 && m % 2 == 0){
	        cout << "YES" << endl ;
	    }
	    else if(n % 2 == 0 || m % 2  == 0){
	        cout << "YES" << endl ;
	    }
	    else {
	        cout << "NO" << endl ;
	    }
	}
    
    return 0 ; 

}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna