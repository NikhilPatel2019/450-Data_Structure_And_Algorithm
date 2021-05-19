import java.util.Arrays;

public class ArrayOf012 {

    public static void main(String[] args) {

        //Trial 1
        int[] array1 = {2,1,0,1,0,2,0,0,1,2};
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        //TAKING COUNTS
        for(int i=0; i< array1.length;i++){
            switch (array1[i]){
                case 0:
                    count_0++;
                    break;

                case 1:
                    count_1++;
                    break;

                case 2:
                    count_2++;
                    break;

                default:
                    System.out.println("Only 0, 1, and 2 Numbers are allowed");
            }
        }

        System.out.println("0's: " + count_0 + "\t1's: " + count_1 + "\t2's: " + count_2);

        //Inserting
        int j=0;
        while(count_0 > 0){
            array1[j++] = 0;
            count_0--;
        }

        while(count_1 > 0){
            array1[j++] = 1;
            count_1--;
        }

        while(count_2 > 0){
            array1[j++] = 2;
            count_2--;
        }

        System.out.println("ARRAY: " + Arrays.toString(array1));

    }
}
