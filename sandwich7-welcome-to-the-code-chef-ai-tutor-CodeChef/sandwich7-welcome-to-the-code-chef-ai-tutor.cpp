#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int b , h , c ;
	cin >> b >> h >> c ;
	int cnt  = 0 ;
	
	while(b >=  2){
	   b =  b - 2;
	   if(h >= c){
	       h = h -1;
	       cnt ++ ;
	   }
	   else if( c >  0 &&  h == 0){
	       c=   c- 1;
	       cnt ++ ;
	   }
	  
	  
	  
	}
	
	cout << cnt << endl ;

}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna