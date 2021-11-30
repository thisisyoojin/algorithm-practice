package K;

import java.util.ArrayList;


public class P12935 {
    public static void main(String[] args) {
        int[] arr = {4,3,1,2};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != min){
                result.add(arr[i]);
            }
        }

        if (result.size() == 0){
            result.add(-1);
        }

        int[] answer = result.stream().mapToInt(i->i).toArray();

    }
}
