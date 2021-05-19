import java.util.Arrays;

public class NegativeElementsOnOneSide {

    public static void main(String[] args) {
		int[] array1 = {1,-11,2,-12,3,-13,-19,-18,4,5,6,-10};
		System.out.println("Unsorted Array: " + Arrays.toString(array1));
		int k = 0;
		for(int i=0; i< array1.length; i++){
	    	if(array1[i] < 0){
	        	if( i != k){
	            	int temp = array1[i];
	            	array1[i] = array1[k];
	            	array1[k] = temp;
	            	k++;
            	}
        	}
    	}
        System.out.println("Sorted Array  : " + Arrays.toString(array1));
    }
}
