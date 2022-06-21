import java.util.Scanner;

import static java.util.Arrays.binarySearch;


public class Striong {
    public static void main(String[] args) {
        int arr[] = {9, 6, 5, 4, 3, 8, 2, 1};
        bubblesort(arr);
        int result = binarySearch(arr, 0, arr.length - 1, 8);
        System.out.println(result);
    }
    public static void bubblesort(int[] arr) {
        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    private static int binarySearch(int[] arr, int first, int last, int elements) {
        while (first <= last) {
            int mid = (first + last) / 2;
            if (elements == arr[mid]) {
                return mid;
            } else if (elements > arr[mid]) {
                return mid - 1;
            } else if (elements < arr[mid]) {
                return mid + 1;
            }
        }
            return -1;//not found
        }

            }



