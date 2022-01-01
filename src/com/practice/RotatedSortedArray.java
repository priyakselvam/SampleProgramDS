package com.practice;

public class RotatedSortedArray {
    public static int[] getSorted(int[] nums) {
        int lengthOfNums = nums.length;
        for (int i = 0; i < lengthOfNums - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                reverse(nums, 0, i);
                reverse(nums, i + 1, lengthOfNums - 1);
                reverse(nums, 0, lengthOfNums - 1);
            }
        }
        return nums;
    }

    static int smallest(int[] num) {
        return num[0];
    }

    static int largest(int[] num) {
        return num[num.length - 1];
    }

    static void reverse(int[] nums, int i, int j) {
        int temp;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++) {
           System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        int[] num = {3, 4, 5, 1, 2};

        System.out.println("Before Sort :");
        printArray(num, num.length);

        getSorted(num);

        System.out.println("After Sort :");
        printArray(num, num.length);

        System.out.println("Pivot element of the sorted elements " +smallest(num));

        System.out.println("Smallest Number " +smallest(num));

        System.out.println("Largest Number " +largest(num));

    }
}
