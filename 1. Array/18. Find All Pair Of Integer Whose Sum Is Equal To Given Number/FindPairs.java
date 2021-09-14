import java.util.Arrays;
import java.util.HashMap;

public class FindPairs {

    public static void main(String[] args) {
        //Method-1: Brute Force
        //Time Complexity = O(n^2)
        //Space Complexity = O(n)
        System.out.println("======================================================================");
        System.out.println("Method-1: Brute Force");
        int[] arr = {1,5,7,1};
        int k = 6;
        method1(arr,k);
        System.out.println("======================================================================");

        //Method-2
        //Time Complexity = O(nlog n)
        System.out.println("Method-2: Using Sorting"); //WON't WORK FOR ARRAY CONTAINING REPEATING VALUES
        method2(arr, k);
        System.out.println("======================================================================");

        //Method-3
        //Time Complexity = O(n)
        System.out.println("Method-3: Using Hashing");
        method2(arr, k);
        System.out.println("======================================================================");
    }

    static  void method1(int array[], int k){
        int pairs = 0;

        for(int i=0; i< array.length; i++){
            for(int j= i+1; j< array.length;j++){
                if(array[i] + array[j] == k){
                    pairs++;
                }
            }
        }
        System.out.println("Pairs Formed: " + pairs);
    }

    static void method2(int array[], int k){
        int len = array.length;
        int low=0, hi=len-1;
        int pairs = 0;

        //nlog n
        Arrays.sort(array);

        while(low<hi){
            int sum = array[low] + array[hi];
            if(sum == k){
                pairs++;
                low++;
            }
            else if(sum > k){
                hi--;
            }
            else if(sum < k){
                low++;
            }
        }
        System.out.println("Pairs Formed: " + pairs);
    }

    static void method3(int array[], int k){
            int counter = 0;
            //1. Create map for all values of array
            HashMap<Integer, Integer> map = new HashMap<>();

            //2. Itearte
            for(int i=0; i< array.length; i++){
                //3. Element must be smaller than k to form a pair
                if(array[i] <k){
                    int temp = k - array[i];
                    //4. If element is present then get its frequency(Value)
                    if(map.containsKey(temp)){
                        counter += map.get(temp);
                    }

                    //5. If element is not present in map then insert it
                    if(map.get(array[i]) == null){
                        map.put(array[i], 0);
                    }

                    map.put(array[i], map.get(array[i])+1);
                }
            }
        System.out.println(counter);

    }

}
