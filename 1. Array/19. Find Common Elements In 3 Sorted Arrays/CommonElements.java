public class CommonElements {

    public static void main(String[] args) {

        //Time Complexity = O(x + y + z)
        int[] array1 = {1,5,10,20,40,80};
        int[] array2 = {6,7,20,80};
        int[] array3 = {3,4,15,20,30,70,80,120};
        int i=0,j=0,k=0;

        while(i<array1.length && j<array2.length && k< array3.length){
            if(array1[i] == array2[j] && array2[j] == array3[k]){
                System.out.println(array1[i]);
                i++;
                j++;
                k++;
            }
            else if(array1[i] < array2[j]){
                i++;
            }
            else if(array2[j] < array3[k]){
                j++;
            }
            else{
                k++;
            }
        }

    }
}
