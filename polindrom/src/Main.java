import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        PalindromChecker pc = new PalindromChecker(s);
        System.out.println(pc.isPalindrom()?"полиндром": "не полиндром");
    }
}
