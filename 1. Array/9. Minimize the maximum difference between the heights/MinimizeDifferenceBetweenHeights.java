import java.util.Arrays;

public class MinimizeDifferenceBetweenHeights {

    public static void main(String[] args) {
        //Time Complexity = O(n)
        int[] array = {1,5,8,10};
        int k = 2;
        System.out.println("Given Array: " + Arrays.toString(array));

        for(int i=0; i<array.length; i++){
            if(array[i] <= k){
                array[i] += k;
            }
            else{
                array[i] -= k;
            }
        }
        System.out.println("Modified Array: " + Arrays.toString(array));

        int max = array[0], min = array[0];
        for(int i=0; i< array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            else{
                min = array[i];
            }
        }
        System.out.println("Maximum: " + max + "\nMinimum: " + min );
        System.out.println("Difference: " + (max-min));

    //Method-2
        Arrays.sort(array);
       System.out.println("Method: 2" );
        System.out.println("Given Array: " + Arrays.toString(array));

        int ans = array[array.length-1] - array[0];		
        int smallest = array[0] + k;
        int largest = array[array.length-1] - k;
        int minimum, maximum;

       for(int i=0; i<array.length-1; i++){
	minimum = Math.min(smallest, array[i+1] - k);
	maximum = Math.max(largest, array[i] + k);
				
	if(minimum < 0){ continue;}
	ans = Math.min(ans, max - min);
      }
     System.out.println("Minimum Difference:  " + ans);

    }
}
