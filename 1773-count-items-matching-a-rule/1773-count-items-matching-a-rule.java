class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int res = 0 ;
        for(int i = 0 ; i < items.size() ; i++)
        {
           
                if(ruleKey.equals("type"))
                {
                    if(items.get(i).get(0).equals(ruleValue)) res ++ ;
                }
                else if(ruleKey.equals("color"))
                {
                    if(items.get(i).get(1).equals(ruleValue)) res ++ ;
                }
                else if(ruleKey.equals("name"))
                {
                    if(items.get(i).get(2).equals(ruleValue)) res ++ ;
                }
            
    }

        return res  ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna