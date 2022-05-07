import java.util.Arrays;

public class TasksSearch {
    public static void main(String[] args) {
        int arr[] = {10, 4, 3, 50, 23, 90};
        int l=arr[arr.length-1];
        int f=arr[arr.length-2];;
        int r=arr[arr.length-3];
        System.out.println(l);
        System.out.println(f);
        System.out.println(r);

    }
    }
//       int arr[] = {10, 4, 3, 50, 23, 90};
//        Arrays.sort(arr);///3,4,10,23,50,90
//
//
//        int i, first, second, third;
//
//        /* There should be atleast three elements */
//        if (arr_size < 3) {
//            System.out.print(" Invalid Input ");
//            return;
//        }
//
//        third = first = second = Integer.MIN_VALUE;
//        for (i = 0; i < arr_size; i++) {
//            /* If current element is greater than
//            first*/
//            if (arr[i] > first) {
//                third = second;
//                second = first;
//                first = arr[i];
//            }
//
//            /* If arr[i] is in between first and
//            second then update second  */
//            else if (arr[i] > second) {
//                third = second;
//                second = arr[i];
//            }
//
//            else if (arr[i] > third)
//                third = arr[i];
//        }
//
//        System.out.println("Three largest elements are " + first + " " + second + " " + third);
//    }
//
//
//
//    }
//    }
//   Find pair 16
//        int arr[] = {5, 20, 3, 2, 50, 80};
//        System.out.println(findPair(arr, 78));
//
//
//    }
//
//    static boolean findPair(int arr[], int n) {
//        int size = arr.length;
//        for (int i = 0; i < size; i++) {
//            for (int j = 1; j < size; j++) {
//                if (i != j && (arr[j] - arr[i] == n || arr[i] - arr[j] == n)) {///
//                    System.out.print("Pair Found: " +
//                            "( " + arr[i] + ", " + arr[j] + " )");
//                    return true;
//                } else if (arr[j] - arr[i] < n)
//                    j++;
//                else
//                    i++;
//            }
//
//
//
//        }
//        System.out.print("No such pair");
//        return false;
//    }

    ////celling numbers
//        int arr[] = {1, 2, 8, 10, 10, 12, 19};
//        int n = arr.length;
//        int x = 3;
//        int index = ceilSearch(arr, 0, n - 1, x);
//        if (index == -1)
//            System.out.println("Ceiling of " + x + " doesn't exist in array");
//        else
//            System.out.println("ceiling of " + x + " is " + arr[index]);
//    }
//
//    static int ceilSearch(int arr[], int low, int high, int x) {
//        int i;
//
//
//        if (x <= arr[low])
//            return low;
//
//        /* Otherwise, linearly search for ceil value */
//        for (i = low; i < high; i++) {
//            if (arr[i] == x)
//                return i;
//
//            if (arr[i] < x && arr[i + 1] >= x)
//                return i + 1;
//        }
//
//        return -1;
//    }



//     Count number of occurrences (or frequency) in a sorted array
//        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
//        int x=2;
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(x==arr[i]){
//                count++;
//            }
//            else {
//
//            }
//            }
//
//
//
//        System.out.println(count);


///missing and repeating elements
//        int[] arr = {4, 3, 6, 0, 1, 1};
//
//        Map<Integer, Boolean> numberMap = new HashMap<>();
//
//        int count = arr.length;////length of
//
//        for (Integer i : arr) {
//
//            if (numberMap.get(i) == null) {
//                numberMap.put(i, true);
//            } else {
//                System.out.println("Repeating = " + i);
//            }
//        }
//        for (int i = 1; i <= count; i++) {
//            if (numberMap.get(i) == null) {
//                System.out.println("Missing = " + i);
//            }
//        }

//Find a Fixed Point (Value equal to index) in a given array
//    static void fixedPoint(int arr[]) {
//        int fixpoint = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == i) {
//                fixpoint = arr[i];
//
//            } else {
//                System.out.println("no natch ");
//            }
//        }
//
//
//        System.out.println(fixpoint);
//
//    }
//}

//        int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
//        int n = arr1.length;
//        int key = 3;
//        System.out.println("Index of the element is : "
//                + pivotedBinarySearch(arr1, n, key));

////Maximum and minimum of an array using minimum number of comparisons
///-------------------------
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int max=Integer.MIN_VALUE;
//        int min=Integer.MAX_VALUE;
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            if(nums[i]>max){
//                max=nums[i];}
//            else if(nums[i]<min){
//                min=nums[i];
//            }
//                else{
//                System.out.println("Not ");
//            }
//
//
//        }
//        System.out.println(max);
//        System.out.println(min);


//Search an element in a sorted and rotated array
//    static int pivotedBinarySearch(int arr[], int n, int key) {
//        int pivot = findPivot(arr, 0, n - 1);
//
//        // If we didn't find a pivot, then
//        // array is not rotated at all
//        if (pivot == -1)
//            return binarySearch(arr, 0, n - 1, key);
//
//        // If we found a pivot, then first
//        // compare with pivot and then
//        // search in two subarrays around pivot
//        if (arr[pivot] == key)
//            return pivot;
//        if (arr[0] <= key)
//            return binarySearch(arr, 0, pivot - 1, key);
//        return binarySearch(arr, pivot + 1, n - 1, key);
//    }
//
//    /* Function to get pivot. For array
//       3, 4, 5, 6, 1, 2 it returns
//       3 (index of 6) */
//    static int findPivot(int arr[], int low, int high) {
//        // base cases
//        if (high < low)
//            return -1;
//        if (high == low)
//            return low;
//
//        /* low + (high - low)/2; */
//        int mid = (low + high) / 2;
//        if (mid < high && arr[mid] > arr[mid + 1])
//            return mid;
//        if (mid > low && arr[mid] < arr[mid - 1])
//            return (mid - 1);
//        if (arr[low] >= arr[mid])
//            return findPivot(arr, low, mid - 1);
//        return findPivot(arr, mid + 1, high);
//    }
//
//    /* Standard Binary Search function */
//    static int binarySearch(int arr[], int low, int high, int key) {
//        if (high < low)
//            return -1;
//
//        /* low + (high - low)/2; */
//        int mid = (low + high) / 2;
//        if (key == arr[mid])
//            return mid;
//        if (key > arr[mid])
//            return binarySearch(arr, (mid + 1), high, key);
//        return binarySearch(arr, low, (mid - 1), key);
//    }
//}

//task 5---->  find 2 minimum elements
/////  int arr[] = {12, 13, 1, 10, 34, 1};
//
////    static void print2Smallest(int arr[])    {
////        int first, second, arr_size = arr.length;
////
////        /* There should be atleast two elements */
////        if (arr_size < 2)
////        {
////            System.out.println(" Invalid Input ");
////            return;
////        }
////
////        first = second = Integer.MAX_VALUE;
////        for (int i = 0; i < arr_size ; i ++)
////        {
////            /* If current element is smaller than first
////              then update both first and second */
////            if (arr[i] < first)
////            {
////                second = first;
////                first = arr[i];
////            }
////
////            /* If arr[i] is in between first and second
////               then update second  */
////            else if (arr[i] < second && arr[i] != first)
////                second = arr[i];
////        }
////        if (second == Integer.MAX_VALUE)
////            System.out.println("There is no second" +
////                    "smallest element");
////        else
////            System.out.println("The smallest element is " +
////                    first + " and second Smallest" +
////                    " element is " + second);
//    }
//}


///task 1 missing numbers
//        int[] nums = { 1, 2, 4, 5, 6 };
//        int sum=0,arrSum=0;
//        int n=nums.length+1;
//        for(int i=0;i<=n;i++){
//            sum+=i;
//        }
//        for(int i=0;i<nums.length;i++){
//            arrSum+=nums[i];
//        }
//        int search=sum-arrSum;
//        System.out.println(search);




