class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum = 0 ;
        int product =  1;
        int total = 0 ;
        int num = n ;

        while(n != 0){
            int ld = n % 10 ;
            sum += ld ;
            product *= ld ;

            n = n / 10 ;
        }

        total = sum + product ;
        if(num % total == 0){
            return true  ;
        }else {
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna