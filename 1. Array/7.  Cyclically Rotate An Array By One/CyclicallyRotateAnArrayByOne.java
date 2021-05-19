import java.util.Arrays;

public class CyclicallyRotateAnArrayByOne {

    public static void main(String[] args) {

    	//Method-1
		//Time Complexity = O(n)
		System.out.println("=============================================================================");
		System.out.println("METHOD-1");
	    int[] array = {6,5,3,8,2};
		System.out.println("Given Array: " + Arrays.toString(array));
	    Rotate(array);
		System.out.println("=============================================================================");
    }

    static void Rotate(int array[]){
    	int lastValue = array[array.length - 1];

		for(int i= array.length - 1; i > 0; i--){
			array[i] = array[i-1];
		}
		array[0] = lastValue;
		System.out.println(Arrays.toString(array));
	}
}
