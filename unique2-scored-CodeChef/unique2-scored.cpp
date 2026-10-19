#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int n ;
	cin >> n ;
	int a[n] ;
	
	for(int i = 0;   i < n ; ++i) {
	    cin >> a[i] ;
	}
	
	 std::unordered_set<int> seen;
	 std::vector<int> insertion_order;
        
        for(int num : a){
            
                    if (seen.find(num) == seen.end()) {
            // If NOT found, insert it into both
            seen.insert(num);
            insertion_order.push_back(num);
           
        } else {
            // If found, skip it
            
        }

        }
        
        for(int i  : insertion_order){
            cout << i << " " ;
        }
        cout << endl ;
	
	
	
	return 0 ; 

}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna