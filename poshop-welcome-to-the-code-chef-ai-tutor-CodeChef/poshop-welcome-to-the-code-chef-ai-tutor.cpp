#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int  t;
	cin >> t ;
	while(t--) {
	    int n ;
	    cin >> n ;
	    int a[n] ;
	    for(int i= 0 ; i < n ; ++i) {
	        cin >> a[i] ;
	    }
	    
	    // if he buys two
	  int cost1 = INT_MIN ;
	  for(int i =  0; i < n ; ++i) {
	      int j = i +1;
	      while( j < n){
	           int cursum = 0 ;
	          if(a[i] <= a[j]){
	              cursum = cursum + a[i] + a[j] ;
	              cost1 = max(cost1 , cursum) ;
	             
	          }
	            j++ ;
	          
	      }
	  }
	   
	   // if he buys one 
	   int maxi = INT_MIN; 
	   for(int i= 0 ; i < n ; ++i) {
	       if(a[i] > maxi) maxi = a[i] ;
	   }
	   
	   cout << max(maxi  , cost1) << endl ;
	    
	}
	
	return 0 ;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna