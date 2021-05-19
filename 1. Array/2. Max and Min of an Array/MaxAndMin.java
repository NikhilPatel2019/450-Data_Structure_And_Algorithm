public class MaxAndMin {

    public static void main(String[] args) {

        //Using the Linear search
        //Time Complexity = O(n)

        int[] array = {2,4,6,8,10};
        int min1 = array[0];
        int max1 = array[0];

        for(int i=0; i< array.length; i++){
            if(array[i] > max1){
                max1 = array[i];
            }
            else{
                min1 = array[i];
            }
        }

        System.out.println("Maximum Number: " + max1);
        System.out.println("Minimum Number: " + min1);
    }
}
