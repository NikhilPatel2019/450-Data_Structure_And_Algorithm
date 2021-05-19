import java.util.Arrays;

public class KthMaxAndMin {

    public static void main(String[] args) {

        //Method-1
        System.out.println("============================================================================");
        System.out.println("METHOD 1");
        int[] array1 = {2,9,10,3,4,5,6,7,15};
        int k = 3;

        for(int i=0; i< array1.length-1; i++){
            for(int j=0; j<array1.length-i-1; j++){
                if(array1[j] > array1[j+1]){
                    swap(array1,i,j+1);
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(array1));
        System.out.println(k + "th Maximum of an array = " + array1[array1.length - k]);
        System.out.println(k + "th Minimum of an array = " + array1[k-1]);
        System.out.println("============================================================================");

        //Method-2
        System.out.println("============================================================================");
        System.out.println("METHOD 2");
        int[] array2 = {5,8,12,7,6,2,4};
        int kth = 3;

        for(int i=0; i< array2.length-1; i++){
            for(int j=i+1; j<array2.length; j++){
                if(array2[i] > array2[j]){
                      swap(array2,i,j);
                }
            }
            if(i == kth-1){
                System.out.println(kth +"th Minimum Element = " + array2[i]);
                break;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(array2));

        for(int i=0; i< array2.length-1; i++){
            for(int j=i+1; j<array2.length; j++){
                if(array2[i] < array2[j]){
                    swap(array2,i,j);
                }
            }
            if(i == kth-1){
                System.out.println(kth +"th Maximum Element = " + array2[i]);
                break;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(array2));
        System.out.println("============================================================================");

        //Method-3 => Using Quick Sort
        System.out.println("============================================================================");
        System.out.println("METHOD 3");
        int[] array3 = {2,9,10,3,4,5,6,7,15};
        int n =array3.length;
        int k3 = 3;

        quickSort(array3,0,n-1);
        System.out.println("Sorted Array: " + Arrays.toString(array1));
        System.out.println(k3 + "th Maximum of an array = " + array1[array3.length - k3]);
        System.out.println(k3 + "th Minimum of an array = " + array1[k-1]);
        System.out.println("============================================================================");
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr,int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<=high-1;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i+1, high);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi = partition(arr,low,high);

            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
}
