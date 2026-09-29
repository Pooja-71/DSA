
import java.util.Arrays;

class removing_duplicate {

    public int removeDuplicates(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};

        removing_duplicate obj = new removing_duplicate();

        int count = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + count);
        System.out.println("Modified array: " +
                Arrays.toString(Arrays.copyOf(nums, count)));
    }
}