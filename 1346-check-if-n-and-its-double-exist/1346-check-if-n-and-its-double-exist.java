
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int n : arr) {
            
            if (seen.contains(2 * n) || (n % 2 == 0 && seen.contains(n / 2))) {
                return true;
            }
            seen.add(n);
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna