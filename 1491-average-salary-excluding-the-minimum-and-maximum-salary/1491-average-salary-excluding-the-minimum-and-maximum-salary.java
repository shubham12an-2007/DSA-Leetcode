class Solution {
    public double average(int[] salary) {
        
        // to get max
        int maxNum = Integer.MIN_VALUE ;
        int minNum = Integer.MAX_VALUE ;

        for(int i = 0 ; i < salary.length ;i++)
        {
            if(maxNum < salary[i])
            {
                maxNum = salary[i] ;
            }
            if(minNum > salary[i])
            {
                minNum = salary[i] ;
            }
        }

        // we have maxnum and minnum

        List<Integer> ls= new ArrayList<>() ;
        for(int i = 0 ; i< salary.length ; i++)
        {
            if(salary[i] == maxNum || salary[i] == minNum)
            {
                continue  ;
            }
            else
            {
                ls.add(salary[i]) ;
            }
        }

        // now average 
        double averageSalary = 0 ;
        for(int i = 0 ; i < ls.size() ;i++)
        {
            averageSalary += ls.get(i) ;
        }

        return averageSalary / ls.size() ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna