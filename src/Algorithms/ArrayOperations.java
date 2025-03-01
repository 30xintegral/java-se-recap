package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayOperations {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    //here we use a binary way to swap elements
                    arr[i]=arr[i] ^ arr[j];
                    arr[j]=arr[i] ^ arr[j];
                    arr[i]=arr[i] ^ arr[j];
                }
            }
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Method to partition the array
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }


    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        int mid=0;
        while(start<=end){
            mid = start + ((end-start)/2);

            if (target<arr[mid]){
                end = mid -1;
            }
            else if (target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        integers.add(0, 100);
        System.out.println(integers);

        int i = 74/26;
        int r = 74%26;


        


        String sz = "A";
        System.out.println(Arrays.toString(sz.getBytes()));
        int x = 3;
        int y = 8;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x +  "," + y);





        /**
         *
         *
         int[] a = {1,2};
         int[] b = {1,2};
         these objects are not same
         System.out.println(a==b); //false
         System.out.println(a.equals(b)); //false
         System.out.println(Objects.equals(a, b)); //false
         System.out.println(Arrays.equals(a,b)); // true
         //while
         String s1 = "a";
         String s2 = "a";
         System.out.println(s1==s2); //prints true

         String z = new String("aa");
         String z1 = new String("aa");
         System.out.println(z==z1);//prints false
         System.out.println(z.equals(z1));//prints true

         * @author Elvin Mahmudzada
         * @subject equality of objects
         */

    }
}
