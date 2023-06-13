import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number N:  ");
        int N = sc.nextInt();
        char c1 = 'a';
        char c2 = 'b';
        FromintToString(N, c1, c2);
    }

    public static void FromintToString(int N, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N / 2; i++) {
            sb.append(c1).append(c2);
        }
        System.out.println(sb);
    }
}


