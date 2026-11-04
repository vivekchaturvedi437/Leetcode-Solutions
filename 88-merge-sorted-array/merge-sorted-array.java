class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int length = m + n;
        int gap = (int) Math.ceil(length / 2.0);

        while (gap > 0) {

            int left = 0;
            int right = left + gap;

            while (right < length) {

                // when one ptr on arr1 and another on arr2;
                if (left < m && right >= m) {
                    swapIfGreater(nums1, left, nums2, right - m);
                }

                //when both ptr on arr2;
                else if (left >= m && right >= m) {
                    swapIfGreater(nums2, left - m, nums2, right - m);
                }

                // when both ptr on arr1;
                else {
                    swapIfGreater(nums1, left, nums1, right);
                }

                left++;
                right++;
            }

            if (gap == 1)
                break;
            gap = (int) Math.ceil(gap / 2.0);
        }
        System.arraycopy(nums2, 0, nums1, m, n);
    }

    private void swapIfGreater(int[] arr1, int left, int[] arr2, int right) {

        if (arr1[left] > arr2[right]) {
            int temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
        }
    }
}