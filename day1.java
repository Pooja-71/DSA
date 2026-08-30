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

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}