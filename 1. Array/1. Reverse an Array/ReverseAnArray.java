
import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

      int[] array1 = {1,2,3,4,5,6,7,8,9,10};
      int start = 0;
      int end = array1.length-1;

      System.out.println("Given Array:    " + Arrays.toString(array1));

      while(start<end){
          int temp = array1[start];
          array1[start] = array1[end];
          array1[end] = temp;
          start++;
          end--;
      }

        System.out.println("Reversed Array: " + Arrays.toString(array1));
    }

}
