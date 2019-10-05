package solution;

import java.util.Scanner;

public class Que10 {
    public static void main(String[] artgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("char ch = ");
        String ch = scanner.next();
        System.out.println("String inputString = ");
        String inputString = scanner.next();

        System.out.println(inputString.indexOf(ch));
    }


}