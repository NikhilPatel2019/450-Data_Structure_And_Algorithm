import java.util.Arrays;

public class Duplicates {

    public static void main(String[] args) {
        int[] array = {1,2,3,6,3,6,1};

        //METHOD-1 Worst Case
        //Time Complexity = O(n^2)
        //GIVEN Restriction - Cannot modify array and use only constant extra space
        System.out.println("========================================================");
        System.out.println("METHOD-1 Brute Force");
        System.out.print("Duplicates: ");
        for (int i=0;i< array.length-1;i++){
            for(int j=i+1; j< array.length ;j++){
                if((array[i] == array[j]) && (i != j)){
                    System.out.print(array[j] + " ");
                    break;
                }
            }
        }
        System.out.println("\n========================================================");

        //METHOD-2
        System.out.println("========================================================");
        System.out.println("METHOD-2 ");
        System.out.print("Duplicates: ");
        for(int i=0; i<array.length; i++){
            int nextIndex = Math.abs(array[i]);

            if(array[nextIndex] >= 0){
                array[nextIndex] *= -1;
            }
            else {
                System.out.print(nextIndex + " ");
            }
        }
        System.out.println("\n========================================================");

        //Method-3: Runner Technique
        System.out.println("========================================================");
        System.out.println("METHOD-3 ");
        int[] array2 = { 2, 6, 4, 1, 3, 1, 5};
        int fast = array2[0];
        int slow = array2[0];
        do{
            slow = array2[slow];
            fast = array2[array2[fast]];
        }while(slow!=fast);

        slow = array2[0];
        while(slow!=fast){
            fast = array2[fast];
            slow = array2[slow];
        }

        System.out.print(slow + "");
        System.out.println("\n========================================================");

    }
}
