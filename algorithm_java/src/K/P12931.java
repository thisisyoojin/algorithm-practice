package K;

import java.util.Arrays;

public class P12931 {
    public static void main(String[] args) {
        int n = 987;
        int answer = 0;
        String num = Integer.toString(n);
        int[] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++){
            arr[i] = num.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++){
            answer = answer + arr[j];
        }
        System.out.println(answer);
    }
}
