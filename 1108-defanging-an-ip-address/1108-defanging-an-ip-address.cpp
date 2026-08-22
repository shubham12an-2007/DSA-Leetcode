class Solution {
public:
    string defangIPaddr(string address) {

        string res ;
        for(int i =0 ; i <address.size() ; i++)
        {
            if(address[i] == '.')
            {
                res += "[.]" ;
            }
            else 
            {
                res.push_back(address[i]);
            }
        }

        return res ;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna