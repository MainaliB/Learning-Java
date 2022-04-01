/*
Given an array of integers determine if a "mirror" exists within the array. 
A mirror is an exact duplication of the order of numbers, but reversed. 
For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is 
length 3 (the {1, 2, 3} part). Your method should return the size of the 
largest mirror section found in the given array.
 */
public class Problem30 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,5,4,3,2,1}; 
        System.out.println(maxMirror(list));// 10

        int[] list2 = {7, 1, 2, 9, 7, 2, 1}; 
        System.out.println(maxMirror(list2));// 2

        int[] list3 = { 5, 9, 9, 4, 5, 4, 9, 9, 2 };
        System.out.println(maxMirror(list3));// 7
    }

    public static int maxMirror(int[] myArray) {
        // Your code here
    }
}
    
    
}
