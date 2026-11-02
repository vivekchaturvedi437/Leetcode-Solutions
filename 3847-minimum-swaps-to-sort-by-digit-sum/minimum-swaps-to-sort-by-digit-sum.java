class Solution {
    public int minSwaps(int[] nums) {

        int n = nums.length;

        int[][] arr = new int[n][2];

        // Store number and its digit sum
        for (int i = 0; i < n; i++) {

            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            arr[i][0] = nums[i];
            arr[i][1] = sum;
        }

        // Sort based on digit sum, then number
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }

            return Integer.compare(a[0], b[0]);
        });

        // Find minimum swaps using cycle detection
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i][0], i);
        }

        boolean[] visited = new boolean[n];

        int swaps = 0;

        for (int i = 0; i < n; i++) {

            if (visited[i] || map.get(nums[i]) == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {

                visited[j] = true;

                j = map.get(nums[j]);

                cycleSize++;
            }

            swaps += cycleSize - 1;
        }

        return swaps;
    }
}