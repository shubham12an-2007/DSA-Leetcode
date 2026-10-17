#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t ;
	cin >> t ;
	while(t--) {
	    int n , k ;
	    cin >> n >> k ;
	    
	    int a[n] ;
	    for(int i = 0; i < n ; ++i) {
	        cin >> a[i] ;
	    }
	    
	    int total= 0 ;
	    int len = sizeof(a) / sizeof(a[0]) ;
	    sort(a , a + len) ;
	    int idx = 0;
	    while(k--) {
	        total = total + a[n-1-idx] ;
	        idx ++ ;
	    }
	    
	    cout << total << endl;
	}

}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna