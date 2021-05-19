import java.util.Arrays;

public class Kadane {

    public static void main(String[] args) {
        int[] array = {4,-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Given Array: " + Arrays.toString(array));
        int maximumSubArray = Integer.MIN_VALUE;
        int currentMaximumSubArray = 0;
        int start=0, end=0;

        for(int i=0; i< array.length; i++){
                currentMaximumSubArray += array[i];
                if(currentMaximumSubArray > maximumSubArray){
                    maximumSubArray = currentMaximumSubArray;
                    end = i;
                }
                if(currentMaximumSubArray < 0){
                    currentMaximumSubArray = 0;
                    start = i+1;
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
