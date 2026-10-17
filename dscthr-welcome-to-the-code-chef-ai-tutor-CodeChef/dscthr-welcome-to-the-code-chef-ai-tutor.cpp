#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t ;
	cin >> t ;
	while(t--) {
	    int a , b , c ;
	    cin >> a >> b >> c ;
	    
	    int max1 =  std::max(a, b);
	    int max2 = max(max1 , c) ;
	    
	    cout << max2 << endl ;
	}

}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna