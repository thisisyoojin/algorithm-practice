package K;

public class P12944 {
    public static void main(String[] args) {
        double answer = 0;
        double total = 0;
        int[] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++){
           total = total + arr[i];
        }
        answer = (double) total / arr.length;
        System.out.println(answer);
    }
}
