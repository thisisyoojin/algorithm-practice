package K;

import java.util.Scanner;

public class P12912 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++){
                answer = i + answer;
            }
        } else if (b < a) {
            for (int i = b; i <= a; i++){
                answer = i + answer;
            }
        } else {
            answer = a;
        }

        System.out.println(answer);
    }
}
