class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int[] res =   new int[arr1.length] ;
        Map<Integer , Integer> map = new TreeMap<>() ;
        int n = arr1.length ;
        
        for(int i = 0 ; i < n ;i++)
        {
            int curNum = arr1[i];
            map.put(curNum , map.getOrDefault(curNum , 0) + 1) ;

        }

        int index = 0 ;
        for(int i = 0 ; i< arr2.length ; i++)
        {
            if(map.containsKey(arr2[i]))
            {
                int count  = map.get(arr2[i]) ;
                while(count > 0 )
                {
                    res[index] = arr2[i] ;
                    index ++;
                    
                    count --;
                }
                map.remove(arr2[i]) ; 
            }
        }

        // now for remainig elements 
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            while (count > 0) {
                res[index++] = key;
                count--;
            }
        }

        return res ;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna