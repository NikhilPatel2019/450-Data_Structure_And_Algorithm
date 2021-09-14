import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        //Method - 1 Worst Case
        //Time Complexity = O (n^2)
        System.out.println("=================================================================");
        System.out.println("Method-1: Worst Case(O(n^2))");
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,6,8,9};
        int size1 = arr1.length;
        int size2 = arr2.length;
        System.out.println("Given Array 1: " + Arrays.toString(arr1));
        System.out.println("Given Array 2: " + Arrays.toString(arr2));

        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                if(arr1[i] > arr2[j]){
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        Arrays.sort(arr2);

        System.out.println("Sorted Array 1: " + Arrays.toString(arr1));
        System.out.println("Sorted Array 2: " + Arrays.toString(arr2));
        System.out.println("=================================================================");

        //Method - 2 Gap Method
        //Time Complexity = O (nlog n)
        //Space Complexity = O (1)
        System.out.println("=================================================================");
        System.out.println("Method-2 ");
        int[] array1 = {1,5,9,10,15,20};
        int[] array2 = {2,3,8,13};
        System.out.println("Given Array 1: " + Arrays.toString(array1));
        System.out.println("Given Array 2: " + Arrays.toString(array2));

        MergeArrays(array1, array2, array1.length, array2.length);

        System.out.println("Merged Array 1: " + Arrays.toString(array1));
        System.out.println("Merged Array 2: " + Arrays.toString(array2));

        System.out.println("=================================================================");
    }

    static int nextGap(int gap){
        if(gap <= 1){
            return 0;
        }
        else{
            return (gap / 2) + (gap % 2);
        }
    }

    static void MergeArrays(int array1[], int array2[], int size1 , int size2){
        int i,j, gap = size1+size2;

        for(gap=nextGap(gap); gap > 0; gap=nextGap(gap)){

            //Step-1: Checking in First Array
            for(i=0; i + gap < size1; i++){
                if(array1[i] > array1[i+gap]){
                    int temp = array1[i];
                    array1[i] = array1[i+gap];
                    array1[i+gap] = temp;
                }
            }

            //Step-2: Checking in both Arrays
            for(j = gap > size1 ? gap - size1 : 0 ; i<size1 && j<size2 ; i++,j++){
                if(array1[i] > array2[j]){
                    int temp = array1[i];
                    array1[i] = array2[j];
                    array2[j] = temp;
                }
            }

            //Step-3: Checking in Array2
            if(j<size2){
                for(j=0; j+gap<size2; j++){
                    if(array2[j] > array2[j+gap]){
                        int temp = array2[j];
                        array2[j] = array2[j+gap];
                        array2[j+gap] = temp;
                    }
                }
            }
        }
    }
}
