// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, DSA!");
//     }
// }

// public class day1 {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 40, 50};

//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

// public class day1 {
//     public static void main(String[] args) {

//         int[] arr = {10, 45, 23, 67, 12};

//         int max = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         System.out.println("Largest = " + max);
//     }
// }

// public class day1 {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 40, 50};

//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
//         }

//         System.out.println("Sum = " + sum);
//     }
// }

// public class day1 {
//     public static void main(String[] args) {

//         int[] arr = {10, 15, 22, 31, 40, 53};

//         int even = 0;
//         int odd = 0;

//         for (int i = 0; i < arr.length; i++) {

//             if (arr[i] % 2 == 0) {
//                 even++;
//             } else {
//                 odd++;
//             }
//         }

//         System.out.println("Even numbers = " + even);
//         System.out.println("Odd numbers = " + odd);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 40, 50};

//         boolean sorted = true;

//         for (int i = 0; i < arr.length - 1; i++) {

//             if (arr[i] > arr[i + 1]) {
//                 sorted = false;
//                 break;
//             }
//         }

//         if (sorted) {
//             System.out.println("Array is sorted");
//         } else {
//             System.out.println("Array is not sorted");
//         }
//     }
// }

// public class day2 {
//     public static void main(String[] args) {

//         int[] arr = {10, 25, 45, 30, 60};

//         int largest = arr[0];
//         int secondLargest = arr[0];

//         for (int i = 1; i < arr.length; i++) {

//             if (arr[i] > largest) {
//                 secondLargest = largest;
//                 largest = arr[i];
//             } 
//             else if (arr[i] > secondLargest && arr[i] != largest) {
//                 secondLargest = arr[i];
//             }
//         }

//         System.out.println("Largest = " + largest);
//         System.out.println("Second Largest = " + secondLargest);
//     }
// }

// public class day3 {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 10, 30, 10, 40};

//         int target = 10;
//         int count = 0;

//         for (int i = 0; i < arr.length; i++) {

//             if (arr[i] == target) {
//                 count++;
//             }
//         }

//         System.out.println("Element " + target + " occurs " + count + " times");
//     }
// }

// public class day1 {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 20, 40};

//         boolean duplicate = false;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = i+1; j < arr.length; j++) {

//                 if (arr[i] == arr[j]) {
//                     duplicate = true;
//                     break;
//                 }
//             }

//             if (duplicate) {
//                 break;
//             }
//         }

//         if (duplicate) {
//             System.out.println("Array contains duplicate elements");
//         } else {
//             System.out.println("No duplicate elements");
//         }
//     }
// }

// import java.util.*;

// public class day1 {

//     public static int prefixmaxarr(int arr[]) {

//         int i, j, sum = 0;
//         int n;

//         n = arr.length;
//         int prefixarr[] = new int[n];

//         prefixarr[0] = arr[0];

//         for(i = 1; i < n; i++) {
//             prefixarr[i] = arr[i] + prefixarr[i-1];
//         }

//         System.out.println(Arrays.toString(prefixarr));

//         return 0;
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, -2, 6, -1, 3};

//         prefixmaxarr(arr);
//     }
// }

// public class day1 {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 20, 40};

//         boolean duplicate = false;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = i+1; j < arr.length; j++) {

//                 if (arr[i] == arr[j]) {
//                     duplicate = true;
//                     break;
//                 }
//             }

//             if (duplicate) {
//                 break;
//             }
//         }

//         if (duplicate) {
//             System.out.println("Array contains duplicate elements");
//         } else {
//             System.out.println("No duplicate elements");
//         }
//     }
// }
// public class day1 {
//     public static void main(String[] args) {

//         int num = 12345;
//         int reverse = 0;

//         while (num != 0) {
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num = num / 10;
//         }

//         System.out.println("Reverse = " + reverse);
//     }
// }

// public class day1 {
//     public static void main(String[] args) {

//         int num = 121;
//         int original = num;
//         int reverse = 0;

//         while (num != 0) {
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num = num / 10;
//         }

//         if (original == reverse) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }

// public class day1 {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 10, 30, 20, 10};

//         for (int i = 0; i < arr.length; i++) {

//             boolean alreadyCounted = false;

//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     alreadyCounted = true;
//                     break;
//                 }
//             }

//             if (!alreadyCounted) {

//                 int count = 0;

//                 for (int j = 0; j < arr.length; j++) {
//                     if (arr[i] == arr[j]) {
//                         count++;
//                     }
//                 }

//                 System.out.println(arr[i] + " occurs " + count + " times");
//             }
//         }
//     }
// }

// class day1 {
//     public int removelement(int[] nums, int val) {
//         int k=0;
    
//         for(int i=0;i<nums.length;i++){
//             if (nums[i]==val){
//                 continue;
//             }
//             else {
//                 nums[k]=nums[i];
//                 k++;
//             }
//         }
//         return k;
//     }
// }


import java.util.Arrays;

class day1 {

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

class Solution {
    public boolean isPalindrome(int x) {
        int o=x;
        int dx=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int r=x%10;
            dx=dx*10 + r;
            x=x/10;
        }
        if (o==dx){
             return true;
        }
        else{
             return false;
        }
       
    }


}

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for(int i = s.length() - 1; i >= 0; i--) {

            if(s.charAt(i) == ' ' && count > 0) {
                break;
            }
            else {
                if(s.charAt(i) != ' ') {
                    count++;
                }
            }
        }

        return count;
    }
}

class Solution {
    public int mySqrt(int x) {

        int low = 1;
        int high = x;
        int ans = 0;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if((long)mid * mid <= x) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = 0; j < nums1.length - i - 1; j++) {

                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }
}

class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}

class Solution {

    public int mySqrt(int x) {

        for (int i = 1; i <= x / i; i++) {

            if (i == x / i && i * i == x) {
                return i;
            }

            if (i + 1 > x / (i + 1)) {
                return i;
            }
        }

        return 0;
    }
}