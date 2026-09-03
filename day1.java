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
public class day1 {
    public static void main(String[] args) {

        int num = 12345;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reverse = " + reverse);
    }
}