public class Maximum {

    public static int FindMaximum(int[] nums) {
        int i = 1;
        int max = nums[0];
        while (i < nums.length) {
            if (max < nums[i]) {
                max = nums[i];

            }
            i++;
        }
        return max;
    }

    public static void main(String args[]) {
        int[] nums = { 100, 5, 29, 25, 1010, 28, 99, 5 };
        System.out.println(FindMaximum(nums));
    }
}
