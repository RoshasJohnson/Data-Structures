public class SecondMaximum {
    public static int FindSecondMaximum(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int fir_max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        System.out.println(fir_max);
        System.out.println(sec_max);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > fir_max) {
                sec_max = fir_max;
                fir_max = nums[i];
            } else if (nums[i] > sec_max && nums[i] != fir_max) {
                sec_max = nums[i];
            }
        }

    
        return sec_max;
    }

    public static void main(String args[]) {
        int[] nums1 = { 100, 5, 29, 101, 1009, 25, 1010, 28, 99, 5 };
        int[] nums2 = { 1000, 500, 1000, 10, 9 };
        System.out.println("Second maximum in nums1: " + FindSecondMaximum(nums1)); // Should print 1009
        System.out.println("Second maximum in nums2: " + FindSecondMaximum(nums2)); // Should print 500
       // System.out.println("Second maximum in nums3: " + FindSecondMaximum(nums3)); // Will throw an exception
    }
}
