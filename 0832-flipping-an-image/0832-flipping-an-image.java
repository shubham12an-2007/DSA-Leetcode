class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int[][] res = new int[image.length][image[0].length] ;
        
   
        for(int i = 0; i < image.length; i++)
        {
            int left = 0;
            int right = image[i].length - 1;

            while(left <= right)
            {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                left++;
                right--;
            }
        }

       
        for(int i = 0 ; i < image.length;  i++)
        {
            for(int j = 0 ; j < image[i].length; j++)
            {
                if(image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }

        return image;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna