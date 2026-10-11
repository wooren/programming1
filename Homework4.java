import java.util.Scanner;

public class Homework4 {
    public static int gcd(int a, int b) {
        if ( b == 0 ) {
             return a;
        }
        else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력하세요:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("두 수의 최대공약수는 " + gcd(a, b) + "입니다.");
    }
}
