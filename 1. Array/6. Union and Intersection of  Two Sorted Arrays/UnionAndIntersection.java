import java.util.Arrays;

public class UnionAndIntersection {

    public static void main(String[] args) {

        //METHOD 1 - with duplicates(Worst case)
        System.out.println("METHOD 1");
        System.out.println("============================================================================");
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {1,3,5,7,9};
        int array1_length = array1.length;
        int array2_length = array2.length;
        int k=0;

        //Intersection
        //Time Complexity = O(n*n)
        if(array1_length >= array2_length){
            int[] intersect = new int[array2_length];
            for(int i=0; i<array1_length; i++){
                for(int j=0; j<array2_length;j++){
                    if(array1[i] == array2[j]){
                        intersect[k++] = array1[i];
                    }
                }
            }
            System.out.println("Intersection: " + Arrays.toString(intersect));
        }
        else{
            int[] intersect = new int[array1_length];
            for(int i=0; i<array2_length; i++){
                for(int j=0; j<array1_length;j++){
                    if(array2[i] == array1[j])
                        intersect[k++] = array2[i];
                }
            }
            System.out.println("Intersection: " + Arrays.toString(intersect));
        }

        //Union
        //Time complexity = O(n)
        int totalLength = array1_length + array2_length;
        int[] union = new int[totalLength];

        for(int i = 0; i<array1_length; i++){
            union[i] = array1[i];
        }
        int j=0;
        for(int i = array1_length; i<totalLength; i++){
            union[i] = array2[j++];
        }
        System.out.println("Union : " + Arrays.toString(union));
        System.out.println("============================================================================");

        //METHOD 2
        System.out.println("METHOD 2");
        System.out.println("============================================================================");
        int[] array3 = {1,3,4,5,7};
        int[] array4 = {2,3,5,6};
        int array3_length = array3.length;
        int array4_length = array4.length;

        System.out.print("Union: ");
        Union(array3, array4, array3_length, array4_length);

        System.out.print("Intersection: ");
        Intersection(array3, array4, array3_length, array4_length);

        System.out.println("");
        System.out.println("============================================================================");
    }

    public static int Union(int array1[], int array2[], int len1, int len2){
        int i=0, j=0;
        while(i < len1 && j < len2){

            //Both the while loop below will check for duplicates value in same array
            while((i < len1-1) && (array1[i] == array1[i+1])){
                i++;
            }
            while((j < len2-1) && (array2[j] == array2[j+1])){
                j++;
            }

            if(array1[i] < array2[j]){
                System.out.print(array1[i++] + " ");
            }
            else if(array2[j] < array1[i]){
                System.out.print(array2[j++] + " ");
            }
            else{
                System.out.print(array1[i++] + " ");
                j++;
            }
        }

        //If one array is bigger than other one then any one of this while loop will run to print values of longest array
        while(i < len1){
            if((i < len1-1) && (array1[i] == array1[i+1])){
                i++;
            }
            else{
                System.out.println(array1[i++] + " ");
            }
        }
        while(j < len2){
            if((j < len2-1) && (array2[j] == array2[j+1])){
                j++;
            }
            else{
                System.out.println(array2[j++] + " ");
            }
        }
        return 0;
    }

    public static int Intersection(int array1[], int array2[], int len1, int len2){
        int i=0, j=0;
        while(i < len1 && j < len2){

            //Both the while loop below will check for duplicates value in same array
            while((i < len1-1) && (array1[i] == array1[i+1])){
                i++;
            }
            while((j < len2-1) && (array2[j] == array2[j+1])){
                j++;
            }

            if(array1[i] < array2[j]){
                i++;
            }
            else if(array2[j] < array1[i]){
                j++;
            }
            else{
                System.out.print(array1[i++] + " ");
                j++;
            }
        }
        return 0;
    }
}
