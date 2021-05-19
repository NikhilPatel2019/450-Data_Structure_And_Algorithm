import java.util.Arrays;

public class LargestSumSubArray {

    public static void main(String[] args) {
        //Method - 1 Using Worst Case
        //Time Complexity = O(n*n)
        System.out.println("===============================================================================");
        System.out.println("Method 1: Using Worst Case(Brute Force Approach)");
	    int[] array = {-2,-3,4,-1,-2,1,5,-3};
        SubArrayUsingWorstCase(array);
        System.out.println("===============================================================================");
        System.out.println("===============================================================================");
        System.out.println("Method 2: Kadane's Algorithm");
        System.out.println("In Program N0. 13");
        System.out.println("===============================================================================");
    }

    static void SubArrayUsingWorstCase(int array[]){
        System.out.println("Given Array: " + Arrays.toString(array));
        int maximumSubArray = Integer.MIN_VALUE;
        int start=0, end=0;

        for(int i=0; i< array.length; i++){
            int currentMaximumSubArray = 0;
            for(int j=i; j<array.length; j++){
                currentMaximumSubArray += array[j];
                if(currentMaximumSubArray > maximumSubArray){
                    maximumSubArray = currentMaximumSubArray;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println("Maximum Sum: " + maximumSubArray);
        System.out.print("Sub Array: [");
        for( ; start<=end; start++){
            System.out.print(array[start] + " ");
        }
        System.out.print("]\n");
    }
}
