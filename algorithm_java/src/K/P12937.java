package K;

import java.util.Scanner;

public class P12937 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String answer ="";
        if (num % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }
        System.out.println(answer);
    }
}
