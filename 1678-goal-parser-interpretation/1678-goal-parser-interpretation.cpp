class Solution {
public:
    string interpret(string s) {

        int len = s.size();
    string res = "";

    int i = 0;

    while (i < len) {
        if (s[i] == 'G') {
            res += 'G';
            i++;
        }
        else if (s.substr(i, 2) == "()") {
            res += 'o';
            i += 2;
        }
        else if (s.substr(i, 4) == "(al)") {
            res += "al";
            i += 4;
        }
    }


    return res;
        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna